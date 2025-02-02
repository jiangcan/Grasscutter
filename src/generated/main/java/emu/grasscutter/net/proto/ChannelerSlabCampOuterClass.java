// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChannelerSlabCamp.proto

package emu.grasscutter.net.proto;

public final class ChannelerSlabCampOuterClass {
    private ChannelerSlabCampOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface ChannelerSlabCampOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:ChannelerSlabCamp)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 buff_num = 5;</code>
         *
         * @return The buffNum.
         */
        int getBuffNum();

        /**
         * <code>uint32 group_id = 10;</code>
         *
         * @return The groupId.
         */
        int getGroupId();

        /**
         * <code>uint32 reward_id = 8;</code>
         *
         * @return The rewardId.
         */
        int getRewardId();

        /**
         * <code>.Vector pos = 11;</code>
         *
         * @return Whether the pos field is set.
         */
        boolean hasPos();
        /**
         * <code>.Vector pos = 11;</code>
         *
         * @return The pos.
         */
        emu.grasscutter.net.proto.VectorOuterClass.Vector getPos();
        /** <code>.Vector pos = 11;</code> */
        emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder();
    }
    /**
     *
     *
     * <pre>
     * Name: IBJHFINBAHB
     * </pre>
     *
     * Protobuf type {@code ChannelerSlabCamp}
     */
    public static final class ChannelerSlabCamp extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:ChannelerSlabCamp)
            ChannelerSlabCampOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use ChannelerSlabCamp.newBuilder() to construct.
        private ChannelerSlabCamp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private ChannelerSlabCamp() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new ChannelerSlabCamp();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ChannelerSlabCamp(
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
                        case 40:
                            {
                                buffNum_ = input.readUInt32();
                                break;
                            }
                        case 64:
                            {
                                rewardId_ = input.readUInt32();
                                break;
                            }
                        case 80:
                            {
                                groupId_ = input.readUInt32();
                                break;
                            }
                        case 90:
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
            return emu.grasscutter.net.proto.ChannelerSlabCampOuterClass
                    .internal_static_ChannelerSlabCamp_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.ChannelerSlabCampOuterClass
                    .internal_static_ChannelerSlabCamp_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp.class,
                            emu.grasscutter.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp.Builder
                                    .class);
        }

        public static final int BUFF_NUM_FIELD_NUMBER = 5;
        private int buffNum_;
        /**
         * <code>uint32 buff_num = 5;</code>
         *
         * @return The buffNum.
         */
        @java.lang.Override
        public int getBuffNum() {
            return buffNum_;
        }

        public static final int GROUP_ID_FIELD_NUMBER = 10;
        private int groupId_;
        /**
         * <code>uint32 group_id = 10;</code>
         *
         * @return The groupId.
         */
        @java.lang.Override
        public int getGroupId() {
            return groupId_;
        }

        public static final int REWARD_ID_FIELD_NUMBER = 8;
        private int rewardId_;
        /**
         * <code>uint32 reward_id = 8;</code>
         *
         * @return The rewardId.
         */
        @java.lang.Override
        public int getRewardId() {
            return rewardId_;
        }

        public static final int POS_FIELD_NUMBER = 11;
        private emu.grasscutter.net.proto.VectorOuterClass.Vector pos_;
        /**
         * <code>.Vector pos = 11;</code>
         *
         * @return Whether the pos field is set.
         */
        @java.lang.Override
        public boolean hasPos() {
            return pos_ != null;
        }
        /**
         * <code>.Vector pos = 11;</code>
         *
         * @return The pos.
         */
        @java.lang.Override
        public emu.grasscutter.net.proto.VectorOuterClass.Vector getPos() {
            return pos_ == null
                    ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance()
                    : pos_;
        }
        /** <code>.Vector pos = 11;</code> */
        @java.lang.Override
        public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
            return getPos();
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
            if (buffNum_ != 0) {
                output.writeUInt32(5, buffNum_);
            }
            if (rewardId_ != 0) {
                output.writeUInt32(8, rewardId_);
            }
            if (groupId_ != 0) {
                output.writeUInt32(10, groupId_);
            }
            if (pos_ != null) {
                output.writeMessage(11, getPos());
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (buffNum_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(5, buffNum_);
            }
            if (rewardId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(8, rewardId_);
            }
            if (groupId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(10, groupId_);
            }
            if (pos_ != null) {
                size += com.google.protobuf.CodedOutputStream.computeMessageSize(11, getPos());
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
                    instanceof emu.grasscutter.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp other =
                    (emu.grasscutter.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp) obj;

            if (getBuffNum() != other.getBuffNum()) return false;
            if (getGroupId() != other.getGroupId()) return false;
            if (getRewardId() != other.getRewardId()) return false;
            if (hasPos() != other.hasPos()) return false;
            if (hasPos()) {
                if (!getPos().equals(other.getPos())) return false;
            }
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
            hash = (37 * hash) + BUFF_NUM_FIELD_NUMBER;
            hash = (53 * hash) + getBuffNum();
            hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
            hash = (53 * hash) + getGroupId();
            hash = (37 * hash) + REWARD_ID_FIELD_NUMBER;
            hash = (53 * hash) + getRewardId();
            if (hasPos()) {
                hash = (37 * hash) + POS_FIELD_NUMBER;
                hash = (53 * hash) + getPos().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp parseFrom(
                java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp parseFrom(
                java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp parseFrom(
                byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp parseFrom(
                byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp parseFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp parseFrom(
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
                emu.grasscutter.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp prototype) {
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
         * Name: IBJHFINBAHB
         * </pre>
         *
         * Protobuf type {@code ChannelerSlabCamp}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:ChannelerSlabCamp)
                emu.grasscutter.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCampOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.ChannelerSlabCampOuterClass
                        .internal_static_ChannelerSlabCamp_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.ChannelerSlabCampOuterClass
                        .internal_static_ChannelerSlabCamp_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp.class,
                                emu.grasscutter.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp.Builder
                                        .class);
            }

            // Construct using
            // emu.grasscutter.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp.newBuilder()
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
                buffNum_ = 0;

                groupId_ = 0;

                rewardId_ = 0;

                if (posBuilder_ == null) {
                    pos_ = null;
                } else {
                    pos_ = null;
                    posBuilder_ = null;
                }
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.ChannelerSlabCampOuterClass
                        .internal_static_ChannelerSlabCamp_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp build() {
                emu.grasscutter.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp result =
                        buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp
                    buildPartial() {
                emu.grasscutter.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp result =
                        new emu.grasscutter.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp(this);
                result.buffNum_ = buffNum_;
                result.groupId_ = groupId_;
                result.rewardId_ = rewardId_;
                if (posBuilder_ == null) {
                    result.pos_ = pos_;
                } else {
                    result.pos_ = posBuilder_.build();
                }
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
                        instanceof emu.grasscutter.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp other) {
                if (other
                        == emu.grasscutter.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp
                                .getDefaultInstance()) return this;
                if (other.getBuffNum() != 0) {
                    setBuffNum(other.getBuffNum());
                }
                if (other.getGroupId() != 0) {
                    setGroupId(other.getGroupId());
                }
                if (other.getRewardId() != 0) {
                    setRewardId(other.getRewardId());
                }
                if (other.hasPos()) {
                    mergePos(other.getPos());
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
                emu.grasscutter.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp parsedMessage =
                        null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int buffNum_;
            /**
             * <code>uint32 buff_num = 5;</code>
             *
             * @return The buffNum.
             */
            @java.lang.Override
            public int getBuffNum() {
                return buffNum_;
            }
            /**
             * <code>uint32 buff_num = 5;</code>
             *
             * @param value The buffNum to set.
             * @return This builder for chaining.
             */
            public Builder setBuffNum(int value) {

                buffNum_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 buff_num = 5;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearBuffNum() {

                buffNum_ = 0;
                onChanged();
                return this;
            }

            private int groupId_;
            /**
             * <code>uint32 group_id = 10;</code>
             *
             * @return The groupId.
             */
            @java.lang.Override
            public int getGroupId() {
                return groupId_;
            }
            /**
             * <code>uint32 group_id = 10;</code>
             *
             * @param value The groupId to set.
             * @return This builder for chaining.
             */
            public Builder setGroupId(int value) {

                groupId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 group_id = 10;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearGroupId() {

                groupId_ = 0;
                onChanged();
                return this;
            }

            private int rewardId_;
            /**
             * <code>uint32 reward_id = 8;</code>
             *
             * @return The rewardId.
             */
            @java.lang.Override
            public int getRewardId() {
                return rewardId_;
            }
            /**
             * <code>uint32 reward_id = 8;</code>
             *
             * @param value The rewardId to set.
             * @return This builder for chaining.
             */
            public Builder setRewardId(int value) {

                rewardId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 reward_id = 8;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearRewardId() {

                rewardId_ = 0;
                onChanged();
                return this;
            }

            private emu.grasscutter.net.proto.VectorOuterClass.Vector pos_;
            private com.google.protobuf.SingleFieldBuilderV3<
                            emu.grasscutter.net.proto.VectorOuterClass.Vector,
                            emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder,
                            emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>
                    posBuilder_;
            /**
             * <code>.Vector pos = 11;</code>
             *
             * @return Whether the pos field is set.
             */
            public boolean hasPos() {
                return posBuilder_ != null || pos_ != null;
            }
            /**
             * <code>.Vector pos = 11;</code>
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
            /** <code>.Vector pos = 11;</code> */
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
            /** <code>.Vector pos = 11;</code> */
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
            /** <code>.Vector pos = 11;</code> */
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
            /** <code>.Vector pos = 11;</code> */
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
            /** <code>.Vector pos = 11;</code> */
            public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getPosBuilder() {

                onChanged();
                return getPosFieldBuilder().getBuilder();
            }
            /** <code>.Vector pos = 11;</code> */
            public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
                if (posBuilder_ != null) {
                    return posBuilder_.getMessageOrBuilder();
                } else {
                    return pos_ == null
                            ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance()
                            : pos_;
                }
            }
            /** <code>.Vector pos = 11;</code> */
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

            // @@protoc_insertion_point(builder_scope:ChannelerSlabCamp)
        }

        // @@protoc_insertion_point(class_scope:ChannelerSlabCamp)
        private static final emu.grasscutter.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp();
        }

        public static emu.grasscutter.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<ChannelerSlabCamp> PARSER =
                new com.google.protobuf.AbstractParser<ChannelerSlabCamp>() {
                    @java.lang.Override
                    public ChannelerSlabCamp parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new ChannelerSlabCamp(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<ChannelerSlabCamp> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<ChannelerSlabCamp> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_ChannelerSlabCamp_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_ChannelerSlabCamp_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\027ChannelerSlabCamp.proto\032\014Vector.proto\""
                    + "`\n\021ChannelerSlabCamp\022\020\n\010buff_num\030\005 \001(\r\022\020"
                    + "\n\010group_id\030\n \001(\r\022\021\n\treward_id\030\010 \001(\r\022\024\n\003p"
                    + "os\030\013 \001(\0132\007.VectorB!\n\031emu.grasscutter.net"
                    + ".protoZ\004/genb\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[] {
                            emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
                        });
        internal_static_ChannelerSlabCamp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ChannelerSlabCamp_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_ChannelerSlabCamp_descriptor,
                        new java.lang.String[] {
                            "BuffNum", "GroupId", "RewardId", "Pos",
                        });
        emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
    }

    // @@protoc_insertion_point(outer_class_scope)
}
