package emu.grasscutter.server.packet.recv;

import emu.grasscutter.net.packet.Opcodes;
import emu.grasscutter.net.packet.PacketHandler;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.PlayerSetPauseReqOuterClass.PlayerSetPauseReq;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.server.packet.send.PacketPlayerSetPauseRsp;
import emu.grasscutter.server.packet.send.PacketPlayerTimeNotify;
import emu.grasscutter.server.packet.send.PacketSceneTimeNotify;

@Opcodes(PacketOpcodes.PlayerSetPauseReq)
public class HandlerPlayerSetPauseReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        PlayerSetPauseReq req = PlayerSetPauseReq.parseFrom(payload);

        session.send(new PacketPlayerSetPauseRsp());
        session.getPlayer().setPaused(req.getIsPaused());

        session.send(new PacketPlayerTimeNotify(session.getPlayer()));
        session.send(new PacketSceneTimeNotify(session.getPlayer()));
    }
}
