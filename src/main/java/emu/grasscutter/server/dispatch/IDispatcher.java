package emu.grasscutter.server.dispatch;

import static emu.grasscutter.config.Configuration.DISPATCH_INFO;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import emu.grasscutter.utils.Crypto;
import emu.grasscutter.utils.JsonAdapters.ByteArrayAdapter;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import org.java_websocket.WebSocket;
import org.slf4j.Logger;

public interface IDispatcher {
    Gson JSON =
            new GsonBuilder()
                    .disableHtmlEscaping()
                    .registerTypeAdapter(byte[].class, new ByteArrayAdapter())
                    .create();

    Function<JsonElement, JsonObject> DEFAULT_PARSER =
            (packet) -> IDispatcher.decode(packet, JsonObject.class);

    /**
     * Decodes an escaped JSON message.
     *
     * @param element The element to decode.
     * @return The decoded JSON object.
     */
    static JsonObject decode(JsonElement element) {
        return IDispatcher.decode(element, JsonObject.class);
    }

    /**
     * Decodes an escaped JSON message.
     *
     * @param element The element to decode.
     * @return The decoded JSON object.
     */
    static <T> T decode(JsonElement element, Class<T> type) {
        if (element.isJsonObject()) {
            return JSON.fromJson(element, type);
        } else {
            var data = element.getAsString();

            // Check if the element starts and ends with quotes.
            if (data.startsWith("\"") && data.endsWith("\"")) {
                // Remove the quotes.
                data = data.substring(1, data.length() - 1);
            }

            // Un-escape the data.
            data = data.replaceAll("\\\\\"", "\"");
            data = data.replaceAll("\\\\", "");

            // De-serialize the data.
            return JSON.fromJson(data, type);
        }
    }

    /**
     * Waits for a request from the other server to be fulfilled.
     *
     * @param request The request data.
     * @param requestId The request packet ID.
     * @param responseId the response packet ID.
     * @param parser The parser for the response data.
     * @return The fulfilled data, or null.
     * @param <T> The type of data to be returned.
     */
    default <T> T await(
            JsonObject request, int requestId, int responseId, Function<JsonElement, T> parser) {
        // Perform the setup for the request.
        var future = this.async(request, requestId, responseId, parser);

        try {
            // Try to return the value.
            return future.get(5L, TimeUnit.SECONDS);
        } catch (Exception ignored) {
            return null;
        }
    }

    /**
     * Registers a callback for a packet to be received. Sends a packet with the provided request.
     *
     * @param request The request object.
     * @param requestId The packet ID of the request packet.
     * @param responseId The packet ID of the response packet.
     * @return A promise containing the parsed JSON data.
     */
    default CompletableFuture<JsonObject> async(JsonObject request, int requestId, int responseId) {
        return this.async(request, requestId, responseId, DEFAULT_PARSER);
    }

    /**
     * Registers a callback for a packet to be received. Sends a packet with the provided request.
     *
     * @param request The request object.
     * @param requestId The packet ID of the request packet.
     * @param responseId The packet ID of the response packet.
     * @param parser The parser for the received data.
     * @return A promise containing the parsed JSON data.
     */
    default <T> CompletableFuture<T> async(
            JsonObject request, int requestId, int responseId, Function<JsonElement, T> parser) {
        // Create the future.
        var future = new CompletableFuture<T>();
        // Listen for the response.
        this.registerCallback(responseId, packet -> future.complete(parser.apply(packet)));
        // Broadcast the packet.
        this.sendMessage(requestId, request);

        return future;
    }

    /**
     * Internally used method to broadcast a packet.
     *
     * @param packetId The packet ID.
     * @param message The packet data.
     */
    void sendMessage(int packetId, Object message);

    /**
     * Decodes a message from the client.
     *
     * @param message The message to decode.
     * @return The decoded message.
     */
    default JsonObject decodeMessage(byte[] message) {
        // Decrypt the message.
        Crypto.xor(message, DISPATCH_INFO.encryptionKey);
        // Deserialize the message.
        return JSON.fromJson(new String(message, StandardCharsets.UTF_8), JsonObject.class);
    }

    /**
     * Creates an encoded message.
     *
     * @param packetId The packet ID.
     * @param message The message data.
     * @return The encoded message.
     */
    default JsonObject encodeMessage(int packetId, Object message) {
        // Create a message from the message data.
        var serverMessage = new JsonObject();
        serverMessage.addProperty("packetId", packetId);
        serverMessage.addProperty("message", JSON.toJson(message));

        return serverMessage;
    }

    /**
     * Handles a message from the client.
     *
     * @param socket The socket the message was received from.
     * @param messageData The message data.
     */
    default void handleMessage(WebSocket socket, byte[] messageData) {
        // Decode the message.
        var decoded = this.decodeMessage(messageData);
        if (decoded == null) {
            this.getLogger().warn("Received invalid message.");
            socket.close();
            return;
        }

        // Get the packet ID.
        var packetId = decoded.get("packetId").getAsInt();
        // Get the packet data.
        var packetData = decoded.get("message");

        // Check to see if the client has authenticated.
        if (packetId != PacketIds.LoginNotify) {
            if (socket.getAttachment() instanceof Boolean authenticated) {
                if (!authenticated) {
                    this.getLogger().warn("Received packet ID {} from unauthenticated client.", packetId);
                    socket.close();
                    return;
                }
            } else return;
        }

        try {
            // Check if the packet ID is registered.
            if (this.getHandlers().containsKey(packetId)) {
                // Get the handler.
                var handler = this.getHandlers().get(packetId);
                // Handle the packet.
                handler.accept(socket, packetData);
            }

            // Check if the packet ID has callbacks.
            if (this.getCallbacks().containsKey(packetId)) {
                // Get the callbacks.
                var callbacks = this.getCallbacks().get(packetId);
                // Call the callbacks.
                callbacks.forEach(callback -> callback.accept(packetData));
                callbacks.clear();
            }
        } catch (Exception exception) {
            this.getLogger().warn("Exception occurred while handling packet {}.", packetId);
            exception.printStackTrace();
        }
    }

    /**
     * Registers a message handler.
     *
     * @param packetId The packet ID to register.
     * @param handler The handler to register.
     */
    default void registerHandler(int packetId, BiConsumer<WebSocket, JsonElement> handler) {
        // Check if the packet ID is already registered.
        if (this.getHandlers().containsKey(packetId))
            throw new IllegalArgumentException("Packet ID already registered.");

        // Register the handler.
        this.getHandlers().put(packetId, handler);
    }

    /**
     * Registers a callback.
     *
     * @param packetId The packet ID to register.
     * @param callback The callback to register.
     */
    default void registerCallback(int packetId, Consumer<JsonElement> callback) {
        // Check if the packet ID has a list for callbacks.
        if (!this.getCallbacks().containsKey(packetId))
            this.getCallbacks().put(packetId, new LinkedList<>());

        // Register the callback.
        this.getCallbacks().get(packetId).add(callback);
    }

    /**
     * @return The logger for the dispatcher.
     */
    Logger getLogger();

    /**
     * @return The message handlers.
     */
    Map<Integer, BiConsumer<WebSocket, JsonElement>> getHandlers();

    /**
     * @return The callbacks.
     */
    Map<Integer, List<Consumer<JsonElement>>> getCallbacks();
}
