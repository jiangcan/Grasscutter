// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GameplayRecommendationReliquaryMainPropData.proto

package emu.grasscutter.net.proto;

public final class GameplayRecommendationReliquaryMainPropDataOuterClass {
    private GameplayRecommendationReliquaryMainPropDataOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface GameplayRecommendationReliquaryMainPropDataOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:GameplayRecommendationReliquaryMainPropData)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 main_prop_id = 11;</code>
         *
         * @return The mainPropId.
         */
        int getMainPropId();

        /**
         * <code>uint32 permillage = 12;</code>
         *
         * @return The permillage.
         */
        int getPermillage();
    }
    /**
     *
     *
     * <pre>
     * Name: PGIJOMGHNEA
     * </pre>
     *
     * Protobuf type {@code GameplayRecommendationReliquaryMainPropData}
     */
    public static final class GameplayRecommendationReliquaryMainPropData
            extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:GameplayRecommendationReliquaryMainPropData)
            GameplayRecommendationReliquaryMainPropDataOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use GameplayRecommendationReliquaryMainPropData.newBuilder() to construct.
        private GameplayRecommendationReliquaryMainPropData(
                com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private GameplayRecommendationReliquaryMainPropData() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new GameplayRecommendationReliquaryMainPropData();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private GameplayRecommendationReliquaryMainPropData(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 88:
                            {
                                mainPropId_ = input.readUInt32();
                                break;
                            }
                        case 96:
                            {
                                permillage_ = input.readUInt32();
                                break;
                            }
                        default:
                            {
                                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass
                    .internal_static_GameplayRecommendationReliquaryMainPropData_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass
                    .internal_static_GameplayRecommendationReliquaryMainPropData_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass
                                    .GameplayRecommendationReliquaryMainPropData.class,
                            emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass
                                    .GameplayRecommendationReliquaryMainPropData.Builder.class);
        }

        public static final int MAIN_PROP_ID_FIELD_NUMBER = 11;
        private int mainPropId_;
        /**
         * <code>uint32 main_prop_id = 11;</code>
         *
         * @return The mainPropId.
         */
        @java.lang.Override
        public int getMainPropId() {
            return mainPropId_;
        }

        public static final int PERMILLAGE_FIELD_NUMBER = 12;
        private int permillage_;
        /**
         * <code>uint32 permillage = 12;</code>
         *
         * @return The permillage.
         */
        @java.lang.Override
        public int getPermillage() {
            return permillage_;
        }

        private byte memoizedIsInitialized = -1;

        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
            if (mainPropId_ != 0) {
                output.writeUInt32(11, mainPropId_);
            }
            if (permillage_ != 0) {
                output.writeUInt32(12, permillage_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (mainPropId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(11, mainPropId_);
            }
            if (permillage_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(12, permillage_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj
                    instanceof
                    emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass
                            .GameplayRecommendationReliquaryMainPropData)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass
                            .GameplayRecommendationReliquaryMainPropData
                    other =
                            (emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass
                                            .GameplayRecommendationReliquaryMainPropData)
                                    obj;

            if (getMainPropId() != other.getMainPropId()) return false;
            if (getPermillage() != other.getPermillage()) return false;
            if (!unknownFields.equals(other.unknownFields)) return false;
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + MAIN_PROP_ID_FIELD_NUMBER;
            hash = (53 * hash) + getMainPropId();
            hash = (37 * hash) + PERMILLAGE_FIELD_NUMBER;
            hash = (53 * hash) + getPermillage();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass
                        .GameplayRecommendationReliquaryMainPropData
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass
                        .GameplayRecommendationReliquaryMainPropData
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass
                        .GameplayRecommendationReliquaryMainPropData
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass
                        .GameplayRecommendationReliquaryMainPropData
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass
                        .GameplayRecommendationReliquaryMainPropData
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass
                        .GameplayRecommendationReliquaryMainPropData
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass
                        .GameplayRecommendationReliquaryMainPropData
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass
                        .GameplayRecommendationReliquaryMainPropData
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass
                        .GameplayRecommendationReliquaryMainPropData
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass
                        .GameplayRecommendationReliquaryMainPropData
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass
                        .GameplayRecommendationReliquaryMainPropData
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass
                        .GameplayRecommendationReliquaryMainPropData
                parseFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(
                emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass
                                .GameplayRecommendationReliquaryMainPropData
                        prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         *
         *
         * <pre>
         * Name: PGIJOMGHNEA
         * </pre>
         *
         * Protobuf type {@code GameplayRecommendationReliquaryMainPropData}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:GameplayRecommendationReliquaryMainPropData)
                emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass
                        .GameplayRecommendationReliquaryMainPropDataOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass
                        .internal_static_GameplayRecommendationReliquaryMainPropData_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass
                        .internal_static_GameplayRecommendationReliquaryMainPropData_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass
                                        .GameplayRecommendationReliquaryMainPropData.class,
                                emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass
                                        .GameplayRecommendationReliquaryMainPropData.Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass.GameplayRecommendationReliquaryMainPropData.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                mainPropId_ = 0;

                permillage_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass
                        .internal_static_GameplayRecommendationReliquaryMainPropData_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass
                            .GameplayRecommendationReliquaryMainPropData
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass
                        .GameplayRecommendationReliquaryMainPropData.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass
                            .GameplayRecommendationReliquaryMainPropData
                    build() {
                emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass
                                .GameplayRecommendationReliquaryMainPropData
                        result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass
                            .GameplayRecommendationReliquaryMainPropData
                    buildPartial() {
                emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass
                                .GameplayRecommendationReliquaryMainPropData
                        result =
                                new emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass
                                        .GameplayRecommendationReliquaryMainPropData(this);
                result.mainPropId_ = mainPropId_;
                result.permillage_ = permillage_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index,
                    java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other
                        instanceof
                        emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass
                                .GameplayRecommendationReliquaryMainPropData) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass
                                            .GameplayRecommendationReliquaryMainPropData)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass
                                    .GameplayRecommendationReliquaryMainPropData
                            other) {
                if (other
                        == emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass
                                .GameplayRecommendationReliquaryMainPropData.getDefaultInstance()) return this;
                if (other.getMainPropId() != 0) {
                    setMainPropId(other.getMainPropId());
                }
                if (other.getPermillage() != 0) {
                    setPermillage(other.getPermillage());
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass
                                .GameplayRecommendationReliquaryMainPropData
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass
                                            .GameplayRecommendationReliquaryMainPropData)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int mainPropId_;
            /**
             * <code>uint32 main_prop_id = 11;</code>
             *
             * @return The mainPropId.
             */
            @java.lang.Override
            public int getMainPropId() {
                return mainPropId_;
            }
            /**
             * <code>uint32 main_prop_id = 11;</code>
             *
             * @param value The mainPropId to set.
             * @return This builder for chaining.
             */
            public Builder setMainPropId(int value) {

                mainPropId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 main_prop_id = 11;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearMainPropId() {

                mainPropId_ = 0;
                onChanged();
                return this;
            }

            private int permillage_;
            /**
             * <code>uint32 permillage = 12;</code>
             *
             * @return The permillage.
             */
            @java.lang.Override
            public int getPermillage() {
                return permillage_;
            }
            /**
             * <code>uint32 permillage = 12;</code>
             *
             * @param value The permillage to set.
             * @return This builder for chaining.
             */
            public Builder setPermillage(int value) {

                permillage_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 permillage = 12;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearPermillage() {

                permillage_ = 0;
                onChanged();
                return this;
            }

            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }

            // @@protoc_insertion_point(builder_scope:GameplayRecommendationReliquaryMainPropData)
        }

        // @@protoc_insertion_point(class_scope:GameplayRecommendationReliquaryMainPropData)
        private static final emu.grasscutter.net.proto
                        .GameplayRecommendationReliquaryMainPropDataOuterClass
                        .GameplayRecommendationReliquaryMainPropData
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass
                            .GameplayRecommendationReliquaryMainPropData();
        }

        public static emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass
                        .GameplayRecommendationReliquaryMainPropData
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<GameplayRecommendationReliquaryMainPropData>
                PARSER =
                        new com.google.protobuf.AbstractParser<GameplayRecommendationReliquaryMainPropData>() {
                            @java.lang.Override
                            public GameplayRecommendationReliquaryMainPropData parsePartialFrom(
                                    com.google.protobuf.CodedInputStream input,
                                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                                    throws com.google.protobuf.InvalidProtocolBufferException {
                                return new GameplayRecommendationReliquaryMainPropData(input, extensionRegistry);
                            }
                        };

        public static com.google.protobuf.Parser<GameplayRecommendationReliquaryMainPropData> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<GameplayRecommendationReliquaryMainPropData>
                getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass
                        .GameplayRecommendationReliquaryMainPropData
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_GameplayRecommendationReliquaryMainPropData_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_GameplayRecommendationReliquaryMainPropData_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n1GameplayRecommendationReliquaryMainPro"
                    + "pData.proto\"W\n+GameplayRecommendationRel"
                    + "iquaryMainPropData\022\024\n\014main_prop_id\030\013 \001(\r"
                    + "\022\022\n\npermillage\030\014 \001(\rB!\n\031emu.grasscutter."
                    + "net.protoZ\004/genb\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_GameplayRecommendationReliquaryMainPropData_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_GameplayRecommendationReliquaryMainPropData_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_GameplayRecommendationReliquaryMainPropData_descriptor,
                        new java.lang.String[] {
                            "MainPropId", "Permillage",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
