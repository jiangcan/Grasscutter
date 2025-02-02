// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ParkourLevelInfo.proto

package emu.grasscutter.net.proto;

public final class ParkourLevelInfoOuterClass {
    private ParkourLevelInfoOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface ParkourLevelInfoOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:ParkourLevelInfo)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>.Vector pos = 12;</code>
         *
         * @return Whether the pos field is set.
         */
        boolean hasPos();
        /**
         * <code>.Vector pos = 12;</code>
         *
         * @return The pos.
         */
        emu.grasscutter.net.proto.VectorOuterClass.Vector getPos();
        /** <code>.Vector pos = 12;</code> */
        emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder();

        /**
         * <code>uint32 open_time = 4;</code>
         *
         * @return The openTime.
         */
        int getOpenTime();

        /**
         * <code>bool is_open = 3;</code>
         *
         * @return The isOpen.
         */
        boolean getIsOpen();

        /**
         * <code>uint32 best_record = 7;</code>
         *
         * @return The bestRecord.
         */
        int getBestRecord();
    }
    /**
     *
     *
     * <pre>
     * Name: AKBAFAOBLBO
     * </pre>
     *
     * Protobuf type {@code ParkourLevelInfo}
     */
    public static final class ParkourLevelInfo extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:ParkourLevelInfo)
            ParkourLevelInfoOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use ParkourLevelInfo.newBuilder() to construct.
        private ParkourLevelInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private ParkourLevelInfo() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new ParkourLevelInfo();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ParkourLevelInfo(
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
                        case 24:
                            {
                                isOpen_ = input.readBool();
                                break;
                            }
                        case 32:
                            {
                                openTime_ = input.readUInt32();
                                break;
                            }
                        case 56:
                            {
                                bestRecord_ = input.readUInt32();
                                break;
                            }
                        case 98:
                            {
                                emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
                                if (pos_ != null) {
                                    subBuilder = pos_.toBuilder();
                                }
                                pos_ =
                                        input.readMessage(
                                                emu.grasscutter.net.proto.VectorOuterClass.Vector.parser(),
                                                extensionRegistry);
                                if (subBuilder != null) {
                                    subBuilder.mergeFrom(pos_);
                                    pos_ = subBuilder.buildPartial();
                                }

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
            return emu.grasscutter.net.proto.ParkourLevelInfoOuterClass
                    .internal_static_ParkourLevelInfo_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.ParkourLevelInfoOuterClass
                    .internal_static_ParkourLevelInfo_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.ParkourLevelInfoOuterClass.ParkourLevelInfo.class,
                            emu.grasscutter.net.proto.ParkourLevelInfoOuterClass.ParkourLevelInfo.Builder.class);
        }

        public static final int POS_FIELD_NUMBER = 12;
        private emu.grasscutter.net.proto.VectorOuterClass.Vector pos_;
        /**
         * <code>.Vector pos = 12;</code>
         *
         * @return Whether the pos field is set.
         */
        @java.lang.Override
        public boolean hasPos() {
            return pos_ != null;
        }
        /**
         * <code>.Vector pos = 12;</code>
         *
         * @return The pos.
         */
        @java.lang.Override
        public emu.grasscutter.net.proto.VectorOuterClass.Vector getPos() {
            return pos_ == null
                    ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance()
                    : pos_;
        }
        /** <code>.Vector pos = 12;</code> */
        @java.lang.Override
        public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
            return getPos();
        }

        public static final int OPEN_TIME_FIELD_NUMBER = 4;
        private int openTime_;
        /**
         * <code>uint32 open_time = 4;</code>
         *
         * @return The openTime.
         */
        @java.lang.Override
        public int getOpenTime() {
            return openTime_;
        }

        public static final int IS_OPEN_FIELD_NUMBER = 3;
        private boolean isOpen_;
        /**
         * <code>bool is_open = 3;</code>
         *
         * @return The isOpen.
         */
        @java.lang.Override
        public boolean getIsOpen() {
            return isOpen_;
        }

        public static final int BEST_RECORD_FIELD_NUMBER = 7;
        private int bestRecord_;
        /**
         * <code>uint32 best_record = 7;</code>
         *
         * @return The bestRecord.
         */
        @java.lang.Override
        public int getBestRecord() {
            return bestRecord_;
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
            if (isOpen_ != false) {
                output.writeBool(3, isOpen_);
            }
            if (openTime_ != 0) {
                output.writeUInt32(4, openTime_);
            }
            if (bestRecord_ != 0) {
                output.writeUInt32(7, bestRecord_);
            }
            if (pos_ != null) {
                output.writeMessage(12, getPos());
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (isOpen_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, isOpen_);
            }
            if (openTime_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(4, openTime_);
            }
            if (bestRecord_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(7, bestRecord_);
            }
            if (pos_ != null) {
                size += com.google.protobuf.CodedOutputStream.computeMessageSize(12, getPos());
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
            if (!(obj instanceof emu.grasscutter.net.proto.ParkourLevelInfoOuterClass.ParkourLevelInfo)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.ParkourLevelInfoOuterClass.ParkourLevelInfo other =
                    (emu.grasscutter.net.proto.ParkourLevelInfoOuterClass.ParkourLevelInfo) obj;

            if (hasPos() != other.hasPos()) return false;
            if (hasPos()) {
                if (!getPos().equals(other.getPos())) return false;
            }
            if (getOpenTime() != other.getOpenTime()) return false;
            if (getIsOpen() != other.getIsOpen()) return false;
            if (getBestRecord() != other.getBestRecord()) return false;
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
            if (hasPos()) {
                hash = (37 * hash) + POS_FIELD_NUMBER;
                hash = (53 * hash) + getPos().hashCode();
            }
            hash = (37 * hash) + OPEN_TIME_FIELD_NUMBER;
            hash = (53 * hash) + getOpenTime();
            hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsOpen());
            hash = (37 * hash) + BEST_RECORD_FIELD_NUMBER;
            hash = (53 * hash) + getBestRecord();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.ParkourLevelInfoOuterClass.ParkourLevelInfo parseFrom(
                java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.ParkourLevelInfoOuterClass.ParkourLevelInfo parseFrom(
                java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ParkourLevelInfoOuterClass.ParkourLevelInfo parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.ParkourLevelInfoOuterClass.ParkourLevelInfo parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ParkourLevelInfoOuterClass.ParkourLevelInfo parseFrom(
                byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.ParkourLevelInfoOuterClass.ParkourLevelInfo parseFrom(
                byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ParkourLevelInfoOuterClass.ParkourLevelInfo parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.ParkourLevelInfoOuterClass.ParkourLevelInfo parseFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ParkourLevelInfoOuterClass.ParkourLevelInfo
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.ParkourLevelInfoOuterClass.ParkourLevelInfo
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ParkourLevelInfoOuterClass.ParkourLevelInfo parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.ParkourLevelInfoOuterClass.ParkourLevelInfo parseFrom(
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
                emu.grasscutter.net.proto.ParkourLevelInfoOuterClass.ParkourLevelInfo prototype) {
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
         * Name: AKBAFAOBLBO
         * </pre>
         *
         * Protobuf type {@code ParkourLevelInfo}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:ParkourLevelInfo)
                emu.grasscutter.net.proto.ParkourLevelInfoOuterClass.ParkourLevelInfoOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.ParkourLevelInfoOuterClass
                        .internal_static_ParkourLevelInfo_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.ParkourLevelInfoOuterClass
                        .internal_static_ParkourLevelInfo_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.ParkourLevelInfoOuterClass.ParkourLevelInfo.class,
                                emu.grasscutter.net.proto.ParkourLevelInfoOuterClass.ParkourLevelInfo.Builder
                                        .class);
            }

            // Construct using
            // emu.grasscutter.net.proto.ParkourLevelInfoOuterClass.ParkourLevelInfo.newBuilder()
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
                if (posBuilder_ == null) {
                    pos_ = null;
                } else {
                    pos_ = null;
                    posBuilder_ = null;
                }
                openTime_ = 0;

                isOpen_ = false;

                bestRecord_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.ParkourLevelInfoOuterClass
                        .internal_static_ParkourLevelInfo_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.ParkourLevelInfoOuterClass.ParkourLevelInfo
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.ParkourLevelInfoOuterClass.ParkourLevelInfo
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.ParkourLevelInfoOuterClass.ParkourLevelInfo build() {
                emu.grasscutter.net.proto.ParkourLevelInfoOuterClass.ParkourLevelInfo result =
                        buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.ParkourLevelInfoOuterClass.ParkourLevelInfo buildPartial() {
                emu.grasscutter.net.proto.ParkourLevelInfoOuterClass.ParkourLevelInfo result =
                        new emu.grasscutter.net.proto.ParkourLevelInfoOuterClass.ParkourLevelInfo(this);
                if (posBuilder_ == null) {
                    result.pos_ = pos_;
                } else {
                    result.pos_ = posBuilder_.build();
                }
                result.openTime_ = openTime_;
                result.isOpen_ = isOpen_;
                result.bestRecord_ = bestRecord_;
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
                        instanceof emu.grasscutter.net.proto.ParkourLevelInfoOuterClass.ParkourLevelInfo) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.ParkourLevelInfoOuterClass.ParkourLevelInfo) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.ParkourLevelInfoOuterClass.ParkourLevelInfo other) {
                if (other
                        == emu.grasscutter.net.proto.ParkourLevelInfoOuterClass.ParkourLevelInfo
                                .getDefaultInstance()) return this;
                if (other.hasPos()) {
                    mergePos(other.getPos());
                }
                if (other.getOpenTime() != 0) {
                    setOpenTime(other.getOpenTime());
                }
                if (other.getIsOpen() != false) {
                    setIsOpen(other.getIsOpen());
                }
                if (other.getBestRecord() != 0) {
                    setBestRecord(other.getBestRecord());
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
                emu.grasscutter.net.proto.ParkourLevelInfoOuterClass.ParkourLevelInfo parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.ParkourLevelInfoOuterClass.ParkourLevelInfo)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private emu.grasscutter.net.proto.VectorOuterClass.Vector pos_;
            private com.google.protobuf.SingleFieldBuilderV3<
                            emu.grasscutter.net.proto.VectorOuterClass.Vector,
                            emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder,
                            emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>
                    posBuilder_;
            /**
             * <code>.Vector pos = 12;</code>
             *
             * @return Whether the pos field is set.
             */
            public boolean hasPos() {
                return posBuilder_ != null || pos_ != null;
            }
            /**
             * <code>.Vector pos = 12;</code>
             *
             * @return The pos.
             */
            public emu.grasscutter.net.proto.VectorOuterClass.Vector getPos() {
                if (posBuilder_ == null) {
                    return pos_ == null
                            ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance()
                            : pos_;
                } else {
                    return posBuilder_.getMessage();
                }
            }
            /** <code>.Vector pos = 12;</code> */
            public Builder setPos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
                if (posBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    pos_ = value;
                    onChanged();
                } else {
                    posBuilder_.setMessage(value);
                }

                return this;
            }
            /** <code>.Vector pos = 12;</code> */
            public Builder setPos(
                    emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
                if (posBuilder_ == null) {
                    pos_ = builderForValue.build();
                    onChanged();
                } else {
                    posBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }
            /** <code>.Vector pos = 12;</code> */
            public Builder mergePos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
                if (posBuilder_ == null) {
                    if (pos_ != null) {
                        pos_ =
                                emu.grasscutter.net.proto.VectorOuterClass.Vector.newBuilder(pos_)
                                        .mergeFrom(value)
                                        .buildPartial();
                    } else {
                        pos_ = value;
                    }
                    onChanged();
                } else {
                    posBuilder_.mergeFrom(value);
                }

                return this;
            }
            /** <code>.Vector pos = 12;</code> */
            public Builder clearPos() {
                if (posBuilder_ == null) {
                    pos_ = null;
                    onChanged();
                } else {
                    pos_ = null;
                    posBuilder_ = null;
                }

                return this;
            }
            /** <code>.Vector pos = 12;</code> */
            public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getPosBuilder() {

                onChanged();
                return getPosFieldBuilder().getBuilder();
            }
            /** <code>.Vector pos = 12;</code> */
            public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
                if (posBuilder_ != null) {
                    return posBuilder_.getMessageOrBuilder();
                } else {
                    return pos_ == null
                            ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance()
                            : pos_;
                }
            }
            /** <code>.Vector pos = 12;</code> */
            private com.google.protobuf.SingleFieldBuilderV3<
                            emu.grasscutter.net.proto.VectorOuterClass.Vector,
                            emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder,
                            emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>
                    getPosFieldBuilder() {
                if (posBuilder_ == null) {
                    posBuilder_ =
                            new com.google.protobuf.SingleFieldBuilderV3<
                                    emu.grasscutter.net.proto.VectorOuterClass.Vector,
                                    emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder,
                                    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                                    getPos(), getParentForChildren(), isClean());
                    pos_ = null;
                }
                return posBuilder_;
            }

            private int openTime_;
            /**
             * <code>uint32 open_time = 4;</code>
             *
             * @return The openTime.
             */
            @java.lang.Override
            public int getOpenTime() {
                return openTime_;
            }
            /**
             * <code>uint32 open_time = 4;</code>
             *
             * @param value The openTime to set.
             * @return This builder for chaining.
             */
            public Builder setOpenTime(int value) {

                openTime_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 open_time = 4;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearOpenTime() {

                openTime_ = 0;
                onChanged();
                return this;
            }

            private boolean isOpen_;
            /**
             * <code>bool is_open = 3;</code>
             *
             * @return The isOpen.
             */
            @java.lang.Override
            public boolean getIsOpen() {
                return isOpen_;
            }
            /**
             * <code>bool is_open = 3;</code>
             *
             * @param value The isOpen to set.
             * @return This builder for chaining.
             */
            public Builder setIsOpen(boolean value) {

                isOpen_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool is_open = 3;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIsOpen() {

                isOpen_ = false;
                onChanged();
                return this;
            }

            private int bestRecord_;
            /**
             * <code>uint32 best_record = 7;</code>
             *
             * @return The bestRecord.
             */
            @java.lang.Override
            public int getBestRecord() {
                return bestRecord_;
            }
            /**
             * <code>uint32 best_record = 7;</code>
             *
             * @param value The bestRecord to set.
             * @return This builder for chaining.
             */
            public Builder setBestRecord(int value) {

                bestRecord_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 best_record = 7;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearBestRecord() {

                bestRecord_ = 0;
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

            // @@protoc_insertion_point(builder_scope:ParkourLevelInfo)
        }

        // @@protoc_insertion_point(class_scope:ParkourLevelInfo)
        private static final emu.grasscutter.net.proto.ParkourLevelInfoOuterClass.ParkourLevelInfo
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.ParkourLevelInfoOuterClass.ParkourLevelInfo();
        }

        public static emu.grasscutter.net.proto.ParkourLevelInfoOuterClass.ParkourLevelInfo
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<ParkourLevelInfo> PARSER =
                new com.google.protobuf.AbstractParser<ParkourLevelInfo>() {
                    @java.lang.Override
                    public ParkourLevelInfo parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new ParkourLevelInfo(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<ParkourLevelInfo> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<ParkourLevelInfo> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.ParkourLevelInfoOuterClass.ParkourLevelInfo
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_ParkourLevelInfo_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_ParkourLevelInfo_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\026ParkourLevelInfo.proto\032\014Vector.proto\"a"
                    + "\n\020ParkourLevelInfo\022\024\n\003pos\030\014 \001(\0132\007.Vector"
                    + "\022\021\n\topen_time\030\004 \001(\r\022\017\n\007is_open\030\003 \001(\010\022\023\n\013"
                    + "best_record\030\007 \001(\rB!\n\031emu.grasscutter.net"
                    + ".protoZ\004/genb\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[] {
                            emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
                        });
        internal_static_ParkourLevelInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ParkourLevelInfo_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_ParkourLevelInfo_descriptor,
                        new java.lang.String[] {
                            "Pos", "OpenTime", "IsOpen", "BestRecord",
                        });
        emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
    }

    // @@protoc_insertion_point(outer_class_scope)
}
