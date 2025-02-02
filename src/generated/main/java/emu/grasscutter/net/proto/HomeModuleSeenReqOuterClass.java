// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeModuleSeenReq.proto

package emu.grasscutter.net.proto;

public final class HomeModuleSeenReqOuterClass {
    private HomeModuleSeenReqOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface HomeModuleSeenReqOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:HomeModuleSeenReq)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>repeated uint32 seen_module_id_list = 11;</code>
         *
         * @return A list containing the seenModuleIdList.
         */
        java.util.List<java.lang.Integer> getSeenModuleIdListList();
        /**
         * <code>repeated uint32 seen_module_id_list = 11;</code>
         *
         * @return The count of seenModuleIdList.
         */
        int getSeenModuleIdListCount();
        /**
         * <code>repeated uint32 seen_module_id_list = 11;</code>
         *
         * @param index The index of the element to return.
         * @return The seenModuleIdList at the given index.
         */
        int getSeenModuleIdList(int index);
    }
    /**
     *
     *
     * <pre>
     * CmdId: 4896
     * Name: BFJMCDIOHJH
     * </pre>
     *
     * Protobuf type {@code HomeModuleSeenReq}
     */
    public static final class HomeModuleSeenReq extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:HomeModuleSeenReq)
            HomeModuleSeenReqOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use HomeModuleSeenReq.newBuilder() to construct.
        private HomeModuleSeenReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private HomeModuleSeenReq() {
            seenModuleIdList_ = emptyIntList();
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new HomeModuleSeenReq();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private HomeModuleSeenReq(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            int mutable_bitField0_ = 0;
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
                                if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                                    seenModuleIdList_ = newIntList();
                                    mutable_bitField0_ |= 0x00000001;
                                }
                                seenModuleIdList_.addInt(input.readUInt32());
                                break;
                            }
                        case 90:
                            {
                                int length = input.readRawVarint32();
                                int limit = input.pushLimit(length);
                                if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                                    seenModuleIdList_ = newIntList();
                                    mutable_bitField0_ |= 0x00000001;
                                }
                                while (input.getBytesUntilLimit() > 0) {
                                    seenModuleIdList_.addInt(input.readUInt32());
                                }
                                input.popLimit(limit);
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
                if (((mutable_bitField0_ & 0x00000001) != 0)) {
                    seenModuleIdList_.makeImmutable(); // C
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return emu.grasscutter.net.proto.HomeModuleSeenReqOuterClass
                    .internal_static_HomeModuleSeenReq_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.HomeModuleSeenReqOuterClass
                    .internal_static_HomeModuleSeenReq_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq.class,
                            emu.grasscutter.net.proto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq.Builder
                                    .class);
        }

        public static final int SEEN_MODULE_ID_LIST_FIELD_NUMBER = 11;
        private com.google.protobuf.Internal.IntList seenModuleIdList_;
        /**
         * <code>repeated uint32 seen_module_id_list = 11;</code>
         *
         * @return A list containing the seenModuleIdList.
         */
        @java.lang.Override
        public java.util.List<java.lang.Integer> getSeenModuleIdListList() {
            return seenModuleIdList_;
        }
        /**
         * <code>repeated uint32 seen_module_id_list = 11;</code>
         *
         * @return The count of seenModuleIdList.
         */
        public int getSeenModuleIdListCount() {
            return seenModuleIdList_.size();
        }
        /**
         * <code>repeated uint32 seen_module_id_list = 11;</code>
         *
         * @param index The index of the element to return.
         * @return The seenModuleIdList at the given index.
         */
        public int getSeenModuleIdList(int index) {
            return seenModuleIdList_.getInt(index);
        }

        private int seenModuleIdListMemoizedSerializedSize = -1;

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
            getSerializedSize();
            if (getSeenModuleIdListList().size() > 0) {
                output.writeUInt32NoTag(90);
                output.writeUInt32NoTag(seenModuleIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < seenModuleIdList_.size(); i++) {
                output.writeUInt32NoTag(seenModuleIdList_.getInt(i));
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            {
                int dataSize = 0;
                for (int i = 0; i < seenModuleIdList_.size(); i++) {
                    dataSize +=
                            com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(
                                    seenModuleIdList_.getInt(i));
                }
                size += dataSize;
                if (!getSeenModuleIdListList().isEmpty()) {
                    size += 1;
                    size += com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(dataSize);
                }
                seenModuleIdListMemoizedSerializedSize = dataSize;
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
                    instanceof emu.grasscutter.net.proto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq other =
                    (emu.grasscutter.net.proto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq) obj;

            if (!getSeenModuleIdListList().equals(other.getSeenModuleIdListList())) return false;
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
            if (getSeenModuleIdListCount() > 0) {
                hash = (37 * hash) + SEEN_MODULE_ID_LIST_FIELD_NUMBER;
                hash = (53 * hash) + getSeenModuleIdListList().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq parseFrom(
                java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq parseFrom(
                java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq parseFrom(
                byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq parseFrom(
                byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq parseFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq parseFrom(
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
                emu.grasscutter.net.proto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq prototype) {
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
         * CmdId: 4896
         * Name: BFJMCDIOHJH
         * </pre>
         *
         * Protobuf type {@code HomeModuleSeenReq}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:HomeModuleSeenReq)
                emu.grasscutter.net.proto.HomeModuleSeenReqOuterClass.HomeModuleSeenReqOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.HomeModuleSeenReqOuterClass
                        .internal_static_HomeModuleSeenReq_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.HomeModuleSeenReqOuterClass
                        .internal_static_HomeModuleSeenReq_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq.class,
                                emu.grasscutter.net.proto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq.Builder
                                        .class);
            }

            // Construct using
            // emu.grasscutter.net.proto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq.newBuilder()
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
                seenModuleIdList_ = emptyIntList();
                bitField0_ = (bitField0_ & ~0x00000001);
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.HomeModuleSeenReqOuterClass
                        .internal_static_HomeModuleSeenReq_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq build() {
                emu.grasscutter.net.proto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq result =
                        buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq
                    buildPartial() {
                emu.grasscutter.net.proto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq result =
                        new emu.grasscutter.net.proto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq(this);
                int from_bitField0_ = bitField0_;
                if (((bitField0_ & 0x00000001) != 0)) {
                    seenModuleIdList_.makeImmutable();
                    bitField0_ = (bitField0_ & ~0x00000001);
                }
                result.seenModuleIdList_ = seenModuleIdList_;
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
                        instanceof emu.grasscutter.net.proto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq other) {
                if (other
                        == emu.grasscutter.net.proto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq
                                .getDefaultInstance()) return this;
                if (!other.seenModuleIdList_.isEmpty()) {
                    if (seenModuleIdList_.isEmpty()) {
                        seenModuleIdList_ = other.seenModuleIdList_;
                        bitField0_ = (bitField0_ & ~0x00000001);
                    } else {
                        ensureSeenModuleIdListIsMutable();
                        seenModuleIdList_.addAll(other.seenModuleIdList_);
                    }
                    onChanged();
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
                emu.grasscutter.net.proto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq parsedMessage =
                        null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int bitField0_;

            private com.google.protobuf.Internal.IntList seenModuleIdList_ = emptyIntList();

            private void ensureSeenModuleIdListIsMutable() {
                if (!((bitField0_ & 0x00000001) != 0)) {
                    seenModuleIdList_ = mutableCopy(seenModuleIdList_);
                    bitField0_ |= 0x00000001;
                }
            }
            /**
             * <code>repeated uint32 seen_module_id_list = 11;</code>
             *
             * @return A list containing the seenModuleIdList.
             */
            public java.util.List<java.lang.Integer> getSeenModuleIdListList() {
                return ((bitField0_ & 0x00000001) != 0)
                        ? java.util.Collections.unmodifiableList(seenModuleIdList_)
                        : seenModuleIdList_;
            }
            /**
             * <code>repeated uint32 seen_module_id_list = 11;</code>
             *
             * @return The count of seenModuleIdList.
             */
            public int getSeenModuleIdListCount() {
                return seenModuleIdList_.size();
            }
            /**
             * <code>repeated uint32 seen_module_id_list = 11;</code>
             *
             * @param index The index of the element to return.
             * @return The seenModuleIdList at the given index.
             */
            public int getSeenModuleIdList(int index) {
                return seenModuleIdList_.getInt(index);
            }
            /**
             * <code>repeated uint32 seen_module_id_list = 11;</code>
             *
             * @param index The index to set the value at.
             * @param value The seenModuleIdList to set.
             * @return This builder for chaining.
             */
            public Builder setSeenModuleIdList(int index, int value) {
                ensureSeenModuleIdListIsMutable();
                seenModuleIdList_.setInt(index, value);
                onChanged();
                return this;
            }
            /**
             * <code>repeated uint32 seen_module_id_list = 11;</code>
             *
             * @param value The seenModuleIdList to add.
             * @return This builder for chaining.
             */
            public Builder addSeenModuleIdList(int value) {
                ensureSeenModuleIdListIsMutable();
                seenModuleIdList_.addInt(value);
                onChanged();
                return this;
            }
            /**
             * <code>repeated uint32 seen_module_id_list = 11;</code>
             *
             * @param values The seenModuleIdList to add.
             * @return This builder for chaining.
             */
            public Builder addAllSeenModuleIdList(
                    java.lang.Iterable<? extends java.lang.Integer> values) {
                ensureSeenModuleIdListIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll(values, seenModuleIdList_);
                onChanged();
                return this;
            }
            /**
             * <code>repeated uint32 seen_module_id_list = 11;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearSeenModuleIdList() {
                seenModuleIdList_ = emptyIntList();
                bitField0_ = (bitField0_ & ~0x00000001);
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

            // @@protoc_insertion_point(builder_scope:HomeModuleSeenReq)
        }

        // @@protoc_insertion_point(class_scope:HomeModuleSeenReq)
        private static final emu.grasscutter.net.proto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq();
        }

        public static emu.grasscutter.net.proto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<HomeModuleSeenReq> PARSER =
                new com.google.protobuf.AbstractParser<HomeModuleSeenReq>() {
                    @java.lang.Override
                    public HomeModuleSeenReq parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new HomeModuleSeenReq(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<HomeModuleSeenReq> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<HomeModuleSeenReq> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_HomeModuleSeenReq_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_HomeModuleSeenReq_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\027HomeModuleSeenReq.proto\"0\n\021HomeModuleS"
                    + "eenReq\022\033\n\023seen_module_id_list\030\013 \003(\rB!\n\031e"
                    + "mu.grasscutter.net.protoZ\004/genb\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_HomeModuleSeenReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_HomeModuleSeenReq_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_HomeModuleSeenReq_descriptor,
                        new java.lang.String[] {
                            "SeenModuleIdList",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
