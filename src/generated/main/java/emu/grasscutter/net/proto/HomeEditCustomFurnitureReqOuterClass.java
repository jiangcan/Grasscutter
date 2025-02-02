// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeEditCustomFurnitureReq.proto

package emu.grasscutter.net.proto;

public final class HomeEditCustomFurnitureReqOuterClass {
    private HomeEditCustomFurnitureReqOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface HomeEditCustomFurnitureReqOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:HomeEditCustomFurnitureReq)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>.HomeCustomFurnitureInfo custom_furniture_info = 8;</code>
         *
         * @return Whether the customFurnitureInfo field is set.
         */
        boolean hasCustomFurnitureInfo();
        /**
         * <code>.HomeCustomFurnitureInfo custom_furniture_info = 8;</code>
         *
         * @return The customFurnitureInfo.
         */
        emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo
                getCustomFurnitureInfo();
        /** <code>.HomeCustomFurnitureInfo custom_furniture_info = 8;</code> */
        emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfoOrBuilder
                getCustomFurnitureInfoOrBuilder();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 4550
     * Name: GBLIAKFBPFI
     * </pre>
     *
     * Protobuf type {@code HomeEditCustomFurnitureReq}
     */
    public static final class HomeEditCustomFurnitureReq
            extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:HomeEditCustomFurnitureReq)
            HomeEditCustomFurnitureReqOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use HomeEditCustomFurnitureReq.newBuilder() to construct.
        private HomeEditCustomFurnitureReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private HomeEditCustomFurnitureReq() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new HomeEditCustomFurnitureReq();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private HomeEditCustomFurnitureReq(
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
                        case 66:
                            {
                                emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo
                                                .Builder
                                        subBuilder = null;
                                if (customFurnitureInfo_ != null) {
                                    subBuilder = customFurnitureInfo_.toBuilder();
                                }
                                customFurnitureInfo_ =
                                        input.readMessage(
                                                emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass
                                                        .HomeCustomFurnitureInfo.parser(),
                                                extensionRegistry);
                                if (subBuilder != null) {
                                    subBuilder.mergeFrom(customFurnitureInfo_);
                                    customFurnitureInfo_ = subBuilder.buildPartial();
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
            return emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass
                    .internal_static_HomeEditCustomFurnitureReq_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass
                    .internal_static_HomeEditCustomFurnitureReq_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass
                                    .HomeEditCustomFurnitureReq.class,
                            emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass
                                    .HomeEditCustomFurnitureReq.Builder.class);
        }

        public static final int CUSTOM_FURNITURE_INFO_FIELD_NUMBER = 8;
        private emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo
                customFurnitureInfo_;
        /**
         * <code>.HomeCustomFurnitureInfo custom_furniture_info = 8;</code>
         *
         * @return Whether the customFurnitureInfo field is set.
         */
        @java.lang.Override
        public boolean hasCustomFurnitureInfo() {
            return customFurnitureInfo_ != null;
        }
        /**
         * <code>.HomeCustomFurnitureInfo custom_furniture_info = 8;</code>
         *
         * @return The customFurnitureInfo.
         */
        @java.lang.Override
        public emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo
                getCustomFurnitureInfo() {
            return customFurnitureInfo_ == null
                    ? emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo
                            .getDefaultInstance()
                    : customFurnitureInfo_;
        }
        /** <code>.HomeCustomFurnitureInfo custom_furniture_info = 8;</code> */
        @java.lang.Override
        public emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass
                        .HomeCustomFurnitureInfoOrBuilder
                getCustomFurnitureInfoOrBuilder() {
            return getCustomFurnitureInfo();
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
            if (customFurnitureInfo_ != null) {
                output.writeMessage(8, getCustomFurnitureInfo());
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (customFurnitureInfo_ != null) {
                size +=
                        com.google.protobuf.CodedOutputStream.computeMessageSize(8, getCustomFurnitureInfo());
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
                    emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass
                            .HomeEditCustomFurnitureReq)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.HomeEditCustomFurnitureReq
                    other =
                            (emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass
                                            .HomeEditCustomFurnitureReq)
                                    obj;

            if (hasCustomFurnitureInfo() != other.hasCustomFurnitureInfo()) return false;
            if (hasCustomFurnitureInfo()) {
                if (!getCustomFurnitureInfo().equals(other.getCustomFurnitureInfo())) return false;
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
            if (hasCustomFurnitureInfo()) {
                hash = (37 * hash) + CUSTOM_FURNITURE_INFO_FIELD_NUMBER;
                hash = (53 * hash) + getCustomFurnitureInfo().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass
                        .HomeEditCustomFurnitureReq
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass
                        .HomeEditCustomFurnitureReq
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass
                        .HomeEditCustomFurnitureReq
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass
                        .HomeEditCustomFurnitureReq
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass
                        .HomeEditCustomFurnitureReq
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass
                        .HomeEditCustomFurnitureReq
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass
                        .HomeEditCustomFurnitureReq
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass
                        .HomeEditCustomFurnitureReq
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass
                        .HomeEditCustomFurnitureReq
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass
                        .HomeEditCustomFurnitureReq
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass
                        .HomeEditCustomFurnitureReq
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass
                        .HomeEditCustomFurnitureReq
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
                emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.HomeEditCustomFurnitureReq
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
         * CmdId: 4550
         * Name: GBLIAKFBPFI
         * </pre>
         *
         * Protobuf type {@code HomeEditCustomFurnitureReq}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:HomeEditCustomFurnitureReq)
                emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass
                        .HomeEditCustomFurnitureReqOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass
                        .internal_static_HomeEditCustomFurnitureReq_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass
                        .internal_static_HomeEditCustomFurnitureReq_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass
                                        .HomeEditCustomFurnitureReq.class,
                                emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass
                                        .HomeEditCustomFurnitureReq.Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.HomeEditCustomFurnitureReq.newBuilder()
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
                if (customFurnitureInfoBuilder_ == null) {
                    customFurnitureInfo_ = null;
                } else {
                    customFurnitureInfo_ = null;
                    customFurnitureInfoBuilder_ = null;
                }
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass
                        .internal_static_HomeEditCustomFurnitureReq_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass
                            .HomeEditCustomFurnitureReq
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass
                        .HomeEditCustomFurnitureReq.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass
                            .HomeEditCustomFurnitureReq
                    build() {
                emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.HomeEditCustomFurnitureReq
                        result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass
                            .HomeEditCustomFurnitureReq
                    buildPartial() {
                emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.HomeEditCustomFurnitureReq
                        result =
                                new emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass
                                        .HomeEditCustomFurnitureReq(this);
                if (customFurnitureInfoBuilder_ == null) {
                    result.customFurnitureInfo_ = customFurnitureInfo_;
                } else {
                    result.customFurnitureInfo_ = customFurnitureInfoBuilder_.build();
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
                        instanceof
                        emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass
                                .HomeEditCustomFurnitureReq) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass
                                            .HomeEditCustomFurnitureReq)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.HomeEditCustomFurnitureReq
                            other) {
                if (other
                        == emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass
                                .HomeEditCustomFurnitureReq.getDefaultInstance()) return this;
                if (other.hasCustomFurnitureInfo()) {
                    mergeCustomFurnitureInfo(other.getCustomFurnitureInfo());
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
                emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.HomeEditCustomFurnitureReq
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass
                                            .HomeEditCustomFurnitureReq)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo
                    customFurnitureInfo_;
            private com.google.protobuf.SingleFieldBuilderV3<
                            emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo,
                            emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo
                                    .Builder,
                            emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass
                                    .HomeCustomFurnitureInfoOrBuilder>
                    customFurnitureInfoBuilder_;
            /**
             * <code>.HomeCustomFurnitureInfo custom_furniture_info = 8;</code>
             *
             * @return Whether the customFurnitureInfo field is set.
             */
            public boolean hasCustomFurnitureInfo() {
                return customFurnitureInfoBuilder_ != null || customFurnitureInfo_ != null;
            }
            /**
             * <code>.HomeCustomFurnitureInfo custom_furniture_info = 8;</code>
             *
             * @return The customFurnitureInfo.
             */
            public emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo
                    getCustomFurnitureInfo() {
                if (customFurnitureInfoBuilder_ == null) {
                    return customFurnitureInfo_ == null
                            ? emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo
                                    .getDefaultInstance()
                            : customFurnitureInfo_;
                } else {
                    return customFurnitureInfoBuilder_.getMessage();
                }
            }
            /** <code>.HomeCustomFurnitureInfo custom_furniture_info = 8;</code> */
            public Builder setCustomFurnitureInfo(
                    emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo
                            value) {
                if (customFurnitureInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    customFurnitureInfo_ = value;
                    onChanged();
                } else {
                    customFurnitureInfoBuilder_.setMessage(value);
                }

                return this;
            }
            /** <code>.HomeCustomFurnitureInfo custom_furniture_info = 8;</code> */
            public Builder setCustomFurnitureInfo(
                    emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo
                                    .Builder
                            builderForValue) {
                if (customFurnitureInfoBuilder_ == null) {
                    customFurnitureInfo_ = builderForValue.build();
                    onChanged();
                } else {
                    customFurnitureInfoBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }
            /** <code>.HomeCustomFurnitureInfo custom_furniture_info = 8;</code> */
            public Builder mergeCustomFurnitureInfo(
                    emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo
                            value) {
                if (customFurnitureInfoBuilder_ == null) {
                    if (customFurnitureInfo_ != null) {
                        customFurnitureInfo_ =
                                emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo
                                        .newBuilder(customFurnitureInfo_)
                                        .mergeFrom(value)
                                        .buildPartial();
                    } else {
                        customFurnitureInfo_ = value;
                    }
                    onChanged();
                } else {
                    customFurnitureInfoBuilder_.mergeFrom(value);
                }

                return this;
            }
            /** <code>.HomeCustomFurnitureInfo custom_furniture_info = 8;</code> */
            public Builder clearCustomFurnitureInfo() {
                if (customFurnitureInfoBuilder_ == null) {
                    customFurnitureInfo_ = null;
                    onChanged();
                } else {
                    customFurnitureInfo_ = null;
                    customFurnitureInfoBuilder_ = null;
                }

                return this;
            }
            /** <code>.HomeCustomFurnitureInfo custom_furniture_info = 8;</code> */
            public emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo
                            .Builder
                    getCustomFurnitureInfoBuilder() {

                onChanged();
                return getCustomFurnitureInfoFieldBuilder().getBuilder();
            }
            /** <code>.HomeCustomFurnitureInfo custom_furniture_info = 8;</code> */
            public emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass
                            .HomeCustomFurnitureInfoOrBuilder
                    getCustomFurnitureInfoOrBuilder() {
                if (customFurnitureInfoBuilder_ != null) {
                    return customFurnitureInfoBuilder_.getMessageOrBuilder();
                } else {
                    return customFurnitureInfo_ == null
                            ? emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo
                                    .getDefaultInstance()
                            : customFurnitureInfo_;
                }
            }
            /** <code>.HomeCustomFurnitureInfo custom_furniture_info = 8;</code> */
            private com.google.protobuf.SingleFieldBuilderV3<
                            emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo,
                            emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo
                                    .Builder,
                            emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass
                                    .HomeCustomFurnitureInfoOrBuilder>
                    getCustomFurnitureInfoFieldBuilder() {
                if (customFurnitureInfoBuilder_ == null) {
                    customFurnitureInfoBuilder_ =
                            new com.google.protobuf.SingleFieldBuilderV3<
                                    emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass
                                            .HomeCustomFurnitureInfo,
                                    emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass
                                            .HomeCustomFurnitureInfo.Builder,
                                    emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass
                                            .HomeCustomFurnitureInfoOrBuilder>(
                                    getCustomFurnitureInfo(), getParentForChildren(), isClean());
                    customFurnitureInfo_ = null;
                }
                return customFurnitureInfoBuilder_;
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

            // @@protoc_insertion_point(builder_scope:HomeEditCustomFurnitureReq)
        }

        // @@protoc_insertion_point(class_scope:HomeEditCustomFurnitureReq)
        private static final emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass
                        .HomeEditCustomFurnitureReq
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass
                            .HomeEditCustomFurnitureReq();
        }

        public static emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass
                        .HomeEditCustomFurnitureReq
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<HomeEditCustomFurnitureReq> PARSER =
                new com.google.protobuf.AbstractParser<HomeEditCustomFurnitureReq>() {
                    @java.lang.Override
                    public HomeEditCustomFurnitureReq parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new HomeEditCustomFurnitureReq(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<HomeEditCustomFurnitureReq> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<HomeEditCustomFurnitureReq> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.HomeEditCustomFurnitureReq
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_HomeEditCustomFurnitureReq_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_HomeEditCustomFurnitureReq_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n HomeEditCustomFurnitureReq.proto\032\035Home"
                    + "CustomFurnitureInfo.proto\"U\n\032HomeEditCus"
                    + "tomFurnitureReq\0227\n\025custom_furniture_info"
                    + "\030\010 \001(\0132\030.HomeCustomFurnitureInfoB!\n\031emu."
                    + "grasscutter.net.protoZ\004/genb\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[] {
                            emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.getDescriptor(),
                        });
        internal_static_HomeEditCustomFurnitureReq_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_HomeEditCustomFurnitureReq_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_HomeEditCustomFurnitureReq_descriptor,
                        new java.lang.String[] {
                            "CustomFurnitureInfo",
                        });
        emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.getDescriptor();
    }

    // @@protoc_insertion_point(outer_class_scope)
}
