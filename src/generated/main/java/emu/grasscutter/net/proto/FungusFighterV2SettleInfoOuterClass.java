// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FungusFighterV2SettleInfo.proto

package emu.grasscutter.net.proto;

public final class FungusFighterV2SettleInfoOuterClass {
    private FungusFighterV2SettleInfoOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface FungusFighterV2SettleInfoOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:FungusFighterV2SettleInfo)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 LJLPPLECIJK = 9;</code>
         *
         * @return The lJLPPLECIJK.
         */
        int getLJLPPLECIJK();

        /**
         * <code>uint32 PFEJLBFPMGF = 2;</code>
         *
         * @return The pFEJLBFPMGF.
         */
        int getPFEJLBFPMGF();

        /**
         * <code>uint32 cost_time = 3;</code>
         *
         * @return The costTime.
         */
        int getCostTime();

        /**
         * <code>uint32 HMEKPCPLCDG = 6;</code>
         *
         * @return The hMEKPCPLCDG.
         */
        int getHMEKPCPLCDG();

        /**
         * <code>uint32 level_id = 8;</code>
         *
         * @return The levelId.
         */
        int getLevelId();

        /**
         * <code>bool is_new_record = 1;</code>
         *
         * @return The isNewRecord.
         */
        boolean getIsNewRecord();
    }
    /**
     *
     *
     * <pre>
     * Name: JKLPFKCFBHM
     * </pre>
     *
     * Protobuf type {@code FungusFighterV2SettleInfo}
     */
    public static final class FungusFighterV2SettleInfo extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:FungusFighterV2SettleInfo)
            FungusFighterV2SettleInfoOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use FungusFighterV2SettleInfo.newBuilder() to construct.
        private FungusFighterV2SettleInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private FungusFighterV2SettleInfo() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new FungusFighterV2SettleInfo();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private FungusFighterV2SettleInfo(
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
                        case 8:
                            {
                                isNewRecord_ = input.readBool();
                                break;
                            }
                        case 16:
                            {
                                pFEJLBFPMGF_ = input.readUInt32();
                                break;
                            }
                        case 24:
                            {
                                costTime_ = input.readUInt32();
                                break;
                            }
                        case 48:
                            {
                                hMEKPCPLCDG_ = input.readUInt32();
                                break;
                            }
                        case 64:
                            {
                                levelId_ = input.readUInt32();
                                break;
                            }
                        case 72:
                            {
                                lJLPPLECIJK_ = input.readUInt32();
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
            return emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass
                    .internal_static_FungusFighterV2SettleInfo_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass
                    .internal_static_FungusFighterV2SettleInfo_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass
                                    .FungusFighterV2SettleInfo.class,
                            emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass
                                    .FungusFighterV2SettleInfo.Builder.class);
        }

        public static final int LJLPPLECIJK_FIELD_NUMBER = 9;
        private int lJLPPLECIJK_;
        /**
         * <code>uint32 LJLPPLECIJK = 9;</code>
         *
         * @return The lJLPPLECIJK.
         */
        @java.lang.Override
        public int getLJLPPLECIJK() {
            return lJLPPLECIJK_;
        }

        public static final int PFEJLBFPMGF_FIELD_NUMBER = 2;
        private int pFEJLBFPMGF_;
        /**
         * <code>uint32 PFEJLBFPMGF = 2;</code>
         *
         * @return The pFEJLBFPMGF.
         */
        @java.lang.Override
        public int getPFEJLBFPMGF() {
            return pFEJLBFPMGF_;
        }

        public static final int COST_TIME_FIELD_NUMBER = 3;
        private int costTime_;
        /**
         * <code>uint32 cost_time = 3;</code>
         *
         * @return The costTime.
         */
        @java.lang.Override
        public int getCostTime() {
            return costTime_;
        }

        public static final int HMEKPCPLCDG_FIELD_NUMBER = 6;
        private int hMEKPCPLCDG_;
        /**
         * <code>uint32 HMEKPCPLCDG = 6;</code>
         *
         * @return The hMEKPCPLCDG.
         */
        @java.lang.Override
        public int getHMEKPCPLCDG() {
            return hMEKPCPLCDG_;
        }

        public static final int LEVEL_ID_FIELD_NUMBER = 8;
        private int levelId_;
        /**
         * <code>uint32 level_id = 8;</code>
         *
         * @return The levelId.
         */
        @java.lang.Override
        public int getLevelId() {
            return levelId_;
        }

        public static final int IS_NEW_RECORD_FIELD_NUMBER = 1;
        private boolean isNewRecord_;
        /**
         * <code>bool is_new_record = 1;</code>
         *
         * @return The isNewRecord.
         */
        @java.lang.Override
        public boolean getIsNewRecord() {
            return isNewRecord_;
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
            if (isNewRecord_ != false) {
                output.writeBool(1, isNewRecord_);
            }
            if (pFEJLBFPMGF_ != 0) {
                output.writeUInt32(2, pFEJLBFPMGF_);
            }
            if (costTime_ != 0) {
                output.writeUInt32(3, costTime_);
            }
            if (hMEKPCPLCDG_ != 0) {
                output.writeUInt32(6, hMEKPCPLCDG_);
            }
            if (levelId_ != 0) {
                output.writeUInt32(8, levelId_);
            }
            if (lJLPPLECIJK_ != 0) {
                output.writeUInt32(9, lJLPPLECIJK_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (isNewRecord_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, isNewRecord_);
            }
            if (pFEJLBFPMGF_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(2, pFEJLBFPMGF_);
            }
            if (costTime_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(3, costTime_);
            }
            if (hMEKPCPLCDG_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(6, hMEKPCPLCDG_);
            }
            if (levelId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(8, levelId_);
            }
            if (lJLPPLECIJK_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(9, lJLPPLECIJK_);
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
                    emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass
                            .FungusFighterV2SettleInfo)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo
                    other =
                            (emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass
                                            .FungusFighterV2SettleInfo)
                                    obj;

            if (getLJLPPLECIJK() != other.getLJLPPLECIJK()) return false;
            if (getPFEJLBFPMGF() != other.getPFEJLBFPMGF()) return false;
            if (getCostTime() != other.getCostTime()) return false;
            if (getHMEKPCPLCDG() != other.getHMEKPCPLCDG()) return false;
            if (getLevelId() != other.getLevelId()) return false;
            if (getIsNewRecord() != other.getIsNewRecord()) return false;
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
            hash = (37 * hash) + LJLPPLECIJK_FIELD_NUMBER;
            hash = (53 * hash) + getLJLPPLECIJK();
            hash = (37 * hash) + PFEJLBFPMGF_FIELD_NUMBER;
            hash = (53 * hash) + getPFEJLBFPMGF();
            hash = (37 * hash) + COST_TIME_FIELD_NUMBER;
            hash = (53 * hash) + getCostTime();
            hash = (37 * hash) + HMEKPCPLCDG_FIELD_NUMBER;
            hash = (53 * hash) + getHMEKPCPLCDG();
            hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
            hash = (53 * hash) + getLevelId();
            hash = (37 * hash) + IS_NEW_RECORD_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsNewRecord());
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass
                        .FungusFighterV2SettleInfo
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass
                        .FungusFighterV2SettleInfo
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass
                        .FungusFighterV2SettleInfo
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass
                        .FungusFighterV2SettleInfo
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass
                        .FungusFighterV2SettleInfo
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass
                        .FungusFighterV2SettleInfo
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass
                        .FungusFighterV2SettleInfo
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass
                        .FungusFighterV2SettleInfo
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass
                        .FungusFighterV2SettleInfo
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass
                        .FungusFighterV2SettleInfo
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass
                        .FungusFighterV2SettleInfo
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass
                        .FungusFighterV2SettleInfo
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
                emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo
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
         * Name: JKLPFKCFBHM
         * </pre>
         *
         * Protobuf type {@code FungusFighterV2SettleInfo}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:FungusFighterV2SettleInfo)
                emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass
                        .FungusFighterV2SettleInfoOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass
                        .internal_static_FungusFighterV2SettleInfo_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass
                        .internal_static_FungusFighterV2SettleInfo_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass
                                        .FungusFighterV2SettleInfo.class,
                                emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass
                                        .FungusFighterV2SettleInfo.Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo.newBuilder()
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
                lJLPPLECIJK_ = 0;

                pFEJLBFPMGF_ = 0;

                costTime_ = 0;

                hMEKPCPLCDG_ = 0;

                levelId_ = 0;

                isNewRecord_ = false;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass
                        .internal_static_FungusFighterV2SettleInfo_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass
                        .FungusFighterV2SettleInfo.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo
                    build() {
                emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo
                        result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo
                    buildPartial() {
                emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo
                        result =
                                new emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass
                                        .FungusFighterV2SettleInfo(this);
                result.lJLPPLECIJK_ = lJLPPLECIJK_;
                result.pFEJLBFPMGF_ = pFEJLBFPMGF_;
                result.costTime_ = costTime_;
                result.hMEKPCPLCDG_ = hMEKPCPLCDG_;
                result.levelId_ = levelId_;
                result.isNewRecord_ = isNewRecord_;
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
                        emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass
                                .FungusFighterV2SettleInfo) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass
                                            .FungusFighterV2SettleInfo)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo
                            other) {
                if (other
                        == emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass
                                .FungusFighterV2SettleInfo.getDefaultInstance()) return this;
                if (other.getLJLPPLECIJK() != 0) {
                    setLJLPPLECIJK(other.getLJLPPLECIJK());
                }
                if (other.getPFEJLBFPMGF() != 0) {
                    setPFEJLBFPMGF(other.getPFEJLBFPMGF());
                }
                if (other.getCostTime() != 0) {
                    setCostTime(other.getCostTime());
                }
                if (other.getHMEKPCPLCDG() != 0) {
                    setHMEKPCPLCDG(other.getHMEKPCPLCDG());
                }
                if (other.getLevelId() != 0) {
                    setLevelId(other.getLevelId());
                }
                if (other.getIsNewRecord() != false) {
                    setIsNewRecord(other.getIsNewRecord());
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
                emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass
                                            .FungusFighterV2SettleInfo)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int lJLPPLECIJK_;
            /**
             * <code>uint32 LJLPPLECIJK = 9;</code>
             *
             * @return The lJLPPLECIJK.
             */
            @java.lang.Override
            public int getLJLPPLECIJK() {
                return lJLPPLECIJK_;
            }
            /**
             * <code>uint32 LJLPPLECIJK = 9;</code>
             *
             * @param value The lJLPPLECIJK to set.
             * @return This builder for chaining.
             */
            public Builder setLJLPPLECIJK(int value) {

                lJLPPLECIJK_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 LJLPPLECIJK = 9;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearLJLPPLECIJK() {

                lJLPPLECIJK_ = 0;
                onChanged();
                return this;
            }

            private int pFEJLBFPMGF_;
            /**
             * <code>uint32 PFEJLBFPMGF = 2;</code>
             *
             * @return The pFEJLBFPMGF.
             */
            @java.lang.Override
            public int getPFEJLBFPMGF() {
                return pFEJLBFPMGF_;
            }
            /**
             * <code>uint32 PFEJLBFPMGF = 2;</code>
             *
             * @param value The pFEJLBFPMGF to set.
             * @return This builder for chaining.
             */
            public Builder setPFEJLBFPMGF(int value) {

                pFEJLBFPMGF_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 PFEJLBFPMGF = 2;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearPFEJLBFPMGF() {

                pFEJLBFPMGF_ = 0;
                onChanged();
                return this;
            }

            private int costTime_;
            /**
             * <code>uint32 cost_time = 3;</code>
             *
             * @return The costTime.
             */
            @java.lang.Override
            public int getCostTime() {
                return costTime_;
            }
            /**
             * <code>uint32 cost_time = 3;</code>
             *
             * @param value The costTime to set.
             * @return This builder for chaining.
             */
            public Builder setCostTime(int value) {

                costTime_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 cost_time = 3;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearCostTime() {

                costTime_ = 0;
                onChanged();
                return this;
            }

            private int hMEKPCPLCDG_;
            /**
             * <code>uint32 HMEKPCPLCDG = 6;</code>
             *
             * @return The hMEKPCPLCDG.
             */
            @java.lang.Override
            public int getHMEKPCPLCDG() {
                return hMEKPCPLCDG_;
            }
            /**
             * <code>uint32 HMEKPCPLCDG = 6;</code>
             *
             * @param value The hMEKPCPLCDG to set.
             * @return This builder for chaining.
             */
            public Builder setHMEKPCPLCDG(int value) {

                hMEKPCPLCDG_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 HMEKPCPLCDG = 6;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearHMEKPCPLCDG() {

                hMEKPCPLCDG_ = 0;
                onChanged();
                return this;
            }

            private int levelId_;
            /**
             * <code>uint32 level_id = 8;</code>
             *
             * @return The levelId.
             */
            @java.lang.Override
            public int getLevelId() {
                return levelId_;
            }
            /**
             * <code>uint32 level_id = 8;</code>
             *
             * @param value The levelId to set.
             * @return This builder for chaining.
             */
            public Builder setLevelId(int value) {

                levelId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 level_id = 8;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearLevelId() {

                levelId_ = 0;
                onChanged();
                return this;
            }

            private boolean isNewRecord_;
            /**
             * <code>bool is_new_record = 1;</code>
             *
             * @return The isNewRecord.
             */
            @java.lang.Override
            public boolean getIsNewRecord() {
                return isNewRecord_;
            }
            /**
             * <code>bool is_new_record = 1;</code>
             *
             * @param value The isNewRecord to set.
             * @return This builder for chaining.
             */
            public Builder setIsNewRecord(boolean value) {

                isNewRecord_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool is_new_record = 1;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIsNewRecord() {

                isNewRecord_ = false;
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

            // @@protoc_insertion_point(builder_scope:FungusFighterV2SettleInfo)
        }

        // @@protoc_insertion_point(class_scope:FungusFighterV2SettleInfo)
        private static final emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass
                        .FungusFighterV2SettleInfo
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass
                            .FungusFighterV2SettleInfo();
        }

        public static emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass
                        .FungusFighterV2SettleInfo
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<FungusFighterV2SettleInfo> PARSER =
                new com.google.protobuf.AbstractParser<FungusFighterV2SettleInfo>() {
                    @java.lang.Override
                    public FungusFighterV2SettleInfo parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new FungusFighterV2SettleInfo(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<FungusFighterV2SettleInfo> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<FungusFighterV2SettleInfo> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.FungusFighterV2SettleInfoOuterClass.FungusFighterV2SettleInfo
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_FungusFighterV2SettleInfo_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_FungusFighterV2SettleInfo_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\037FungusFighterV2SettleInfo.proto\"\226\001\n\031Fu"
                    + "ngusFighterV2SettleInfo\022\023\n\013LJLPPLECIJK\030\t"
                    + " \001(\r\022\023\n\013PFEJLBFPMGF\030\002 \001(\r\022\021\n\tcost_time\030\003"
                    + " \001(\r\022\023\n\013HMEKPCPLCDG\030\006 \001(\r\022\020\n\010level_id\030\010 "
                    + "\001(\r\022\025\n\ris_new_record\030\001 \001(\010B!\n\031emu.grassc"
                    + "utter.net.protoZ\004/genb\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_FungusFighterV2SettleInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_FungusFighterV2SettleInfo_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_FungusFighterV2SettleInfo_descriptor,
                        new java.lang.String[] {
                            "LJLPPLECIJK", "PFEJLBFPMGF", "CostTime", "HMEKPCPLCDG", "LevelId", "IsNewRecord",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
