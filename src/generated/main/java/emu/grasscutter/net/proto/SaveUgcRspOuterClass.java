// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SaveUgcRsp.proto

package emu.grasscutter.net.proto;

public final class SaveUgcRspOuterClass {
    private SaveUgcRspOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface SaveUgcRspOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:SaveUgcRsp)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>.UgcType ugc_type = 3;</code>
         *
         * @return The enum numeric value on the wire for ugcType.
         */
        int getUgcTypeValue();
        /**
         * <code>.UgcType ugc_type = 3;</code>
         *
         * @return The ugcType.
         */
        emu.grasscutter.net.proto.UgcTypeOuterClass.UgcType getUgcType();

        /**
         * <code>uint64 ugc_guid = 6;</code>
         *
         * @return The ugcGuid.
         */
        long getUgcGuid();

        /**
         * <code>int32 retcode = 14;</code>
         *
         * @return The retcode.
         */
        int getRetcode();

        /**
         * <code>bool JGBHEMIDGCJ = 11;</code>
         *
         * @return The jGBHEMIDGCJ.
         */
        boolean getJGBHEMIDGCJ();
    }
    /**
     *
     *
     * <pre>
     * Name: JKPCEIOLHFA
     * CmdId: 6332
     * </pre>
     *
     * Protobuf type {@code SaveUgcRsp}
     */
    public static final class SaveUgcRsp extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:SaveUgcRsp)
            SaveUgcRspOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use SaveUgcRsp.newBuilder() to construct.
        private SaveUgcRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private SaveUgcRsp() {
            ugcType_ = 0;
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new SaveUgcRsp();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private SaveUgcRsp(
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
                                int rawValue = input.readEnum();

                                ugcType_ = rawValue;
                                break;
                            }
                        case 48:
                            {
                                ugcGuid_ = input.readUInt64();
                                break;
                            }
                        case 88:
                            {
                                jGBHEMIDGCJ_ = input.readBool();
                                break;
                            }
                        case 112:
                            {
                                retcode_ = input.readInt32();
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
            return emu.grasscutter.net.proto.SaveUgcRspOuterClass.internal_static_SaveUgcRsp_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.SaveUgcRspOuterClass
                    .internal_static_SaveUgcRsp_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.SaveUgcRspOuterClass.SaveUgcRsp.class,
                            emu.grasscutter.net.proto.SaveUgcRspOuterClass.SaveUgcRsp.Builder.class);
        }

        public static final int UGC_TYPE_FIELD_NUMBER = 3;
        private int ugcType_;
        /**
         * <code>.UgcType ugc_type = 3;</code>
         *
         * @return The enum numeric value on the wire for ugcType.
         */
        @java.lang.Override
        public int getUgcTypeValue() {
            return ugcType_;
        }
        /**
         * <code>.UgcType ugc_type = 3;</code>
         *
         * @return The ugcType.
         */
        @java.lang.Override
        public emu.grasscutter.net.proto.UgcTypeOuterClass.UgcType getUgcType() {
            @SuppressWarnings("deprecation")
            emu.grasscutter.net.proto.UgcTypeOuterClass.UgcType result =
                    emu.grasscutter.net.proto.UgcTypeOuterClass.UgcType.valueOf(ugcType_);
            return result == null
                    ? emu.grasscutter.net.proto.UgcTypeOuterClass.UgcType.UNRECOGNIZED
                    : result;
        }

        public static final int UGC_GUID_FIELD_NUMBER = 6;
        private long ugcGuid_;
        /**
         * <code>uint64 ugc_guid = 6;</code>
         *
         * @return The ugcGuid.
         */
        @java.lang.Override
        public long getUgcGuid() {
            return ugcGuid_;
        }

        public static final int RETCODE_FIELD_NUMBER = 14;
        private int retcode_;
        /**
         * <code>int32 retcode = 14;</code>
         *
         * @return The retcode.
         */
        @java.lang.Override
        public int getRetcode() {
            return retcode_;
        }

        public static final int JGBHEMIDGCJ_FIELD_NUMBER = 11;
        private boolean jGBHEMIDGCJ_;
        /**
         * <code>bool JGBHEMIDGCJ = 11;</code>
         *
         * @return The jGBHEMIDGCJ.
         */
        @java.lang.Override
        public boolean getJGBHEMIDGCJ() {
            return jGBHEMIDGCJ_;
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
            if (ugcType_
                    != emu.grasscutter.net.proto.UgcTypeOuterClass.UgcType.UGC_TYPE_NONE.getNumber()) {
                output.writeEnum(3, ugcType_);
            }
            if (ugcGuid_ != 0L) {
                output.writeUInt64(6, ugcGuid_);
            }
            if (jGBHEMIDGCJ_ != false) {
                output.writeBool(11, jGBHEMIDGCJ_);
            }
            if (retcode_ != 0) {
                output.writeInt32(14, retcode_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (ugcType_
                    != emu.grasscutter.net.proto.UgcTypeOuterClass.UgcType.UGC_TYPE_NONE.getNumber()) {
                size += com.google.protobuf.CodedOutputStream.computeEnumSize(3, ugcType_);
            }
            if (ugcGuid_ != 0L) {
                size += com.google.protobuf.CodedOutputStream.computeUInt64Size(6, ugcGuid_);
            }
            if (jGBHEMIDGCJ_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(11, jGBHEMIDGCJ_);
            }
            if (retcode_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeInt32Size(14, retcode_);
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
            if (!(obj instanceof emu.grasscutter.net.proto.SaveUgcRspOuterClass.SaveUgcRsp)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.SaveUgcRspOuterClass.SaveUgcRsp other =
                    (emu.grasscutter.net.proto.SaveUgcRspOuterClass.SaveUgcRsp) obj;

            if (ugcType_ != other.ugcType_) return false;
            if (getUgcGuid() != other.getUgcGuid()) return false;
            if (getRetcode() != other.getRetcode()) return false;
            if (getJGBHEMIDGCJ() != other.getJGBHEMIDGCJ()) return false;
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
            hash = (37 * hash) + UGC_TYPE_FIELD_NUMBER;
            hash = (53 * hash) + ugcType_;
            hash = (37 * hash) + UGC_GUID_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getUgcGuid());
            hash = (37 * hash) + RETCODE_FIELD_NUMBER;
            hash = (53 * hash) + getRetcode();
            hash = (37 * hash) + JGBHEMIDGCJ_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getJGBHEMIDGCJ());
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.SaveUgcRspOuterClass.SaveUgcRsp parseFrom(
                java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.SaveUgcRspOuterClass.SaveUgcRsp parseFrom(
                java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.SaveUgcRspOuterClass.SaveUgcRsp parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.SaveUgcRspOuterClass.SaveUgcRsp parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.SaveUgcRspOuterClass.SaveUgcRsp parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.SaveUgcRspOuterClass.SaveUgcRsp parseFrom(
                byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.SaveUgcRspOuterClass.SaveUgcRsp parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.SaveUgcRspOuterClass.SaveUgcRsp parseFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.SaveUgcRspOuterClass.SaveUgcRsp parseDelimitedFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.SaveUgcRspOuterClass.SaveUgcRsp parseDelimitedFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.SaveUgcRspOuterClass.SaveUgcRsp parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.SaveUgcRspOuterClass.SaveUgcRsp parseFrom(
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
                emu.grasscutter.net.proto.SaveUgcRspOuterClass.SaveUgcRsp prototype) {
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
         * Name: JKPCEIOLHFA
         * CmdId: 6332
         * </pre>
         *
         * Protobuf type {@code SaveUgcRsp}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:SaveUgcRsp)
                emu.grasscutter.net.proto.SaveUgcRspOuterClass.SaveUgcRspOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.SaveUgcRspOuterClass.internal_static_SaveUgcRsp_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.SaveUgcRspOuterClass
                        .internal_static_SaveUgcRsp_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.SaveUgcRspOuterClass.SaveUgcRsp.class,
                                emu.grasscutter.net.proto.SaveUgcRspOuterClass.SaveUgcRsp.Builder.class);
            }

            // Construct using emu.grasscutter.net.proto.SaveUgcRspOuterClass.SaveUgcRsp.newBuilder()
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
                ugcType_ = 0;

                ugcGuid_ = 0L;

                retcode_ = 0;

                jGBHEMIDGCJ_ = false;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.SaveUgcRspOuterClass.internal_static_SaveUgcRsp_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.SaveUgcRspOuterClass.SaveUgcRsp getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.SaveUgcRspOuterClass.SaveUgcRsp.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.SaveUgcRspOuterClass.SaveUgcRsp build() {
                emu.grasscutter.net.proto.SaveUgcRspOuterClass.SaveUgcRsp result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.SaveUgcRspOuterClass.SaveUgcRsp buildPartial() {
                emu.grasscutter.net.proto.SaveUgcRspOuterClass.SaveUgcRsp result =
                        new emu.grasscutter.net.proto.SaveUgcRspOuterClass.SaveUgcRsp(this);
                result.ugcType_ = ugcType_;
                result.ugcGuid_ = ugcGuid_;
                result.retcode_ = retcode_;
                result.jGBHEMIDGCJ_ = jGBHEMIDGCJ_;
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
                if (other instanceof emu.grasscutter.net.proto.SaveUgcRspOuterClass.SaveUgcRsp) {
                    return mergeFrom((emu.grasscutter.net.proto.SaveUgcRspOuterClass.SaveUgcRsp) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(emu.grasscutter.net.proto.SaveUgcRspOuterClass.SaveUgcRsp other) {
                if (other == emu.grasscutter.net.proto.SaveUgcRspOuterClass.SaveUgcRsp.getDefaultInstance())
                    return this;
                if (other.ugcType_ != 0) {
                    setUgcTypeValue(other.getUgcTypeValue());
                }
                if (other.getUgcGuid() != 0L) {
                    setUgcGuid(other.getUgcGuid());
                }
                if (other.getRetcode() != 0) {
                    setRetcode(other.getRetcode());
                }
                if (other.getJGBHEMIDGCJ() != false) {
                    setJGBHEMIDGCJ(other.getJGBHEMIDGCJ());
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
                emu.grasscutter.net.proto.SaveUgcRspOuterClass.SaveUgcRsp parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.SaveUgcRspOuterClass.SaveUgcRsp) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int ugcType_ = 0;
            /**
             * <code>.UgcType ugc_type = 3;</code>
             *
             * @return The enum numeric value on the wire for ugcType.
             */
            @java.lang.Override
            public int getUgcTypeValue() {
                return ugcType_;
            }
            /**
             * <code>.UgcType ugc_type = 3;</code>
             *
             * @param value The enum numeric value on the wire for ugcType to set.
             * @return This builder for chaining.
             */
            public Builder setUgcTypeValue(int value) {

                ugcType_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>.UgcType ugc_type = 3;</code>
             *
             * @return The ugcType.
             */
            @java.lang.Override
            public emu.grasscutter.net.proto.UgcTypeOuterClass.UgcType getUgcType() {
                @SuppressWarnings("deprecation")
                emu.grasscutter.net.proto.UgcTypeOuterClass.UgcType result =
                        emu.grasscutter.net.proto.UgcTypeOuterClass.UgcType.valueOf(ugcType_);
                return result == null
                        ? emu.grasscutter.net.proto.UgcTypeOuterClass.UgcType.UNRECOGNIZED
                        : result;
            }
            /**
             * <code>.UgcType ugc_type = 3;</code>
             *
             * @param value The ugcType to set.
             * @return This builder for chaining.
             */
            public Builder setUgcType(emu.grasscutter.net.proto.UgcTypeOuterClass.UgcType value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                ugcType_ = value.getNumber();
                onChanged();
                return this;
            }
            /**
             * <code>.UgcType ugc_type = 3;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearUgcType() {

                ugcType_ = 0;
                onChanged();
                return this;
            }

            private long ugcGuid_;
            /**
             * <code>uint64 ugc_guid = 6;</code>
             *
             * @return The ugcGuid.
             */
            @java.lang.Override
            public long getUgcGuid() {
                return ugcGuid_;
            }
            /**
             * <code>uint64 ugc_guid = 6;</code>
             *
             * @param value The ugcGuid to set.
             * @return This builder for chaining.
             */
            public Builder setUgcGuid(long value) {

                ugcGuid_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint64 ugc_guid = 6;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearUgcGuid() {

                ugcGuid_ = 0L;
                onChanged();
                return this;
            }

            private int retcode_;
            /**
             * <code>int32 retcode = 14;</code>
             *
             * @return The retcode.
             */
            @java.lang.Override
            public int getRetcode() {
                return retcode_;
            }
            /**
             * <code>int32 retcode = 14;</code>
             *
             * @param value The retcode to set.
             * @return This builder for chaining.
             */
            public Builder setRetcode(int value) {

                retcode_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int32 retcode = 14;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearRetcode() {

                retcode_ = 0;
                onChanged();
                return this;
            }

            private boolean jGBHEMIDGCJ_;
            /**
             * <code>bool JGBHEMIDGCJ = 11;</code>
             *
             * @return The jGBHEMIDGCJ.
             */
            @java.lang.Override
            public boolean getJGBHEMIDGCJ() {
                return jGBHEMIDGCJ_;
            }
            /**
             * <code>bool JGBHEMIDGCJ = 11;</code>
             *
             * @param value The jGBHEMIDGCJ to set.
             * @return This builder for chaining.
             */
            public Builder setJGBHEMIDGCJ(boolean value) {

                jGBHEMIDGCJ_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool JGBHEMIDGCJ = 11;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearJGBHEMIDGCJ() {

                jGBHEMIDGCJ_ = false;
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

            // @@protoc_insertion_point(builder_scope:SaveUgcRsp)
        }

        // @@protoc_insertion_point(class_scope:SaveUgcRsp)
        private static final emu.grasscutter.net.proto.SaveUgcRspOuterClass.SaveUgcRsp DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SaveUgcRspOuterClass.SaveUgcRsp();
        }

        public static emu.grasscutter.net.proto.SaveUgcRspOuterClass.SaveUgcRsp getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<SaveUgcRsp> PARSER =
                new com.google.protobuf.AbstractParser<SaveUgcRsp>() {
                    @java.lang.Override
                    public SaveUgcRsp parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new SaveUgcRsp(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<SaveUgcRsp> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<SaveUgcRsp> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.SaveUgcRspOuterClass.SaveUgcRsp getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_SaveUgcRsp_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_SaveUgcRsp_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\020SaveUgcRsp.proto\032\rUgcType.proto\"`\n\nSav"
                    + "eUgcRsp\022\032\n\010ugc_type\030\003 \001(\0162\010.UgcType\022\020\n\010u"
                    + "gc_guid\030\006 \001(\004\022\017\n\007retcode\030\016 \001(\005\022\023\n\013JGBHEM"
                    + "IDGCJ\030\013 \001(\010B\033\n\031emu.grasscutter.net.proto"
                    + "b\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[] {
                            emu.grasscutter.net.proto.UgcTypeOuterClass.getDescriptor(),
                        });
        internal_static_SaveUgcRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_SaveUgcRsp_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_SaveUgcRsp_descriptor,
                        new java.lang.String[] {
                            "UgcType", "UgcGuid", "Retcode", "JGBHEMIDGCJ",
                        });
        emu.grasscutter.net.proto.UgcTypeOuterClass.getDescriptor();
    }

    // @@protoc_insertion_point(outer_class_scope)
}
