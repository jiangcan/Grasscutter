// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TryEnterHomeReq.proto

package emu.grasscutter.net.proto;

public final class TryEnterHomeReqOuterClass {
    private TryEnterHomeReqOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface TryEnterHomeReqOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:TryEnterHomeReq)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 target_point = 7;</code>
         *
         * @return The targetPoint.
         */
        int getTargetPoint();

        /**
         * <code>bool EIEPKFHNILM = 2;</code>
         *
         * @return The eIEPKFHNILM.
         */
        boolean getEIEPKFHNILM();

        /**
         * <code>bool OJAFECKPAJE = 14;</code>
         *
         * @return The oJAFECKPAJE.
         */
        boolean getOJAFECKPAJE();

        /**
         * <code>uint32 target_uid = 13;</code>
         *
         * @return The targetUid.
         */
        int getTargetUid();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 4504
     * Name: MBLNFDMHCMM
     * </pre>
     *
     * Protobuf type {@code TryEnterHomeReq}
     */
    public static final class TryEnterHomeReq extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:TryEnterHomeReq)
            TryEnterHomeReqOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use TryEnterHomeReq.newBuilder() to construct.
        private TryEnterHomeReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private TryEnterHomeReq() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new TryEnterHomeReq();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private TryEnterHomeReq(
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
                        case 16:
                            {
                                eIEPKFHNILM_ = input.readBool();
                                break;
                            }
                        case 56:
                            {
                                targetPoint_ = input.readUInt32();
                                break;
                            }
                        case 104:
                            {
                                targetUid_ = input.readUInt32();
                                break;
                            }
                        case 112:
                            {
                                oJAFECKPAJE_ = input.readBool();
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
            return emu.grasscutter.net.proto.TryEnterHomeReqOuterClass
                    .internal_static_TryEnterHomeReq_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.TryEnterHomeReqOuterClass
                    .internal_static_TryEnterHomeReq_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq.class,
                            emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq.Builder.class);
        }

        public static final int TARGET_POINT_FIELD_NUMBER = 7;
        private int targetPoint_;
        /**
         * <code>uint32 target_point = 7;</code>
         *
         * @return The targetPoint.
         */
        @java.lang.Override
        public int getTargetPoint() {
            return targetPoint_;
        }

        public static final int EIEPKFHNILM_FIELD_NUMBER = 2;
        private boolean eIEPKFHNILM_;
        /**
         * <code>bool EIEPKFHNILM = 2;</code>
         *
         * @return The eIEPKFHNILM.
         */
        @java.lang.Override
        public boolean getEIEPKFHNILM() {
            return eIEPKFHNILM_;
        }

        public static final int OJAFECKPAJE_FIELD_NUMBER = 14;
        private boolean oJAFECKPAJE_;
        /**
         * <code>bool OJAFECKPAJE = 14;</code>
         *
         * @return The oJAFECKPAJE.
         */
        @java.lang.Override
        public boolean getOJAFECKPAJE() {
            return oJAFECKPAJE_;
        }

        public static final int TARGET_UID_FIELD_NUMBER = 13;
        private int targetUid_;
        /**
         * <code>uint32 target_uid = 13;</code>
         *
         * @return The targetUid.
         */
        @java.lang.Override
        public int getTargetUid() {
            return targetUid_;
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
            if (eIEPKFHNILM_ != false) {
                output.writeBool(2, eIEPKFHNILM_);
            }
            if (targetPoint_ != 0) {
                output.writeUInt32(7, targetPoint_);
            }
            if (targetUid_ != 0) {
                output.writeUInt32(13, targetUid_);
            }
            if (oJAFECKPAJE_ != false) {
                output.writeBool(14, oJAFECKPAJE_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (eIEPKFHNILM_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, eIEPKFHNILM_);
            }
            if (targetPoint_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(7, targetPoint_);
            }
            if (targetUid_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(13, targetUid_);
            }
            if (oJAFECKPAJE_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(14, oJAFECKPAJE_);
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
            if (!(obj instanceof emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq other =
                    (emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq) obj;

            if (getTargetPoint() != other.getTargetPoint()) return false;
            if (getEIEPKFHNILM() != other.getEIEPKFHNILM()) return false;
            if (getOJAFECKPAJE() != other.getOJAFECKPAJE()) return false;
            if (getTargetUid() != other.getTargetUid()) return false;
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
            hash = (37 * hash) + TARGET_POINT_FIELD_NUMBER;
            hash = (53 * hash) + getTargetPoint();
            hash = (37 * hash) + EIEPKFHNILM_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getEIEPKFHNILM());
            hash = (37 * hash) + OJAFECKPAJE_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getOJAFECKPAJE());
            hash = (37 * hash) + TARGET_UID_FIELD_NUMBER;
            hash = (53 * hash) + getTargetUid();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(
                java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(
                java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(
                byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(
                byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(
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
                emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq prototype) {
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
         * CmdId: 4504
         * Name: MBLNFDMHCMM
         * </pre>
         *
         * Protobuf type {@code TryEnterHomeReq}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:TryEnterHomeReq)
                emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReqOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.TryEnterHomeReqOuterClass
                        .internal_static_TryEnterHomeReq_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.TryEnterHomeReqOuterClass
                        .internal_static_TryEnterHomeReq_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq.class,
                                emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq.Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq.newBuilder()
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
                targetPoint_ = 0;

                eIEPKFHNILM_ = false;

                oJAFECKPAJE_ = false;

                targetUid_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.TryEnterHomeReqOuterClass
                        .internal_static_TryEnterHomeReq_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq build() {
                emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq buildPartial() {
                emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq result =
                        new emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq(this);
                result.targetPoint_ = targetPoint_;
                result.eIEPKFHNILM_ = eIEPKFHNILM_;
                result.oJAFECKPAJE_ = oJAFECKPAJE_;
                result.targetUid_ = targetUid_;
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
                if (other instanceof emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq other) {
                if (other
                        == emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq
                                .getDefaultInstance()) return this;
                if (other.getTargetPoint() != 0) {
                    setTargetPoint(other.getTargetPoint());
                }
                if (other.getEIEPKFHNILM() != false) {
                    setEIEPKFHNILM(other.getEIEPKFHNILM());
                }
                if (other.getOJAFECKPAJE() != false) {
                    setOJAFECKPAJE(other.getOJAFECKPAJE());
                }
                if (other.getTargetUid() != 0) {
                    setTargetUid(other.getTargetUid());
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
                emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int targetPoint_;
            /**
             * <code>uint32 target_point = 7;</code>
             *
             * @return The targetPoint.
             */
            @java.lang.Override
            public int getTargetPoint() {
                return targetPoint_;
            }
            /**
             * <code>uint32 target_point = 7;</code>
             *
             * @param value The targetPoint to set.
             * @return This builder for chaining.
             */
            public Builder setTargetPoint(int value) {

                targetPoint_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 target_point = 7;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearTargetPoint() {

                targetPoint_ = 0;
                onChanged();
                return this;
            }

            private boolean eIEPKFHNILM_;
            /**
             * <code>bool EIEPKFHNILM = 2;</code>
             *
             * @return The eIEPKFHNILM.
             */
            @java.lang.Override
            public boolean getEIEPKFHNILM() {
                return eIEPKFHNILM_;
            }
            /**
             * <code>bool EIEPKFHNILM = 2;</code>
             *
             * @param value The eIEPKFHNILM to set.
             * @return This builder for chaining.
             */
            public Builder setEIEPKFHNILM(boolean value) {

                eIEPKFHNILM_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool EIEPKFHNILM = 2;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearEIEPKFHNILM() {

                eIEPKFHNILM_ = false;
                onChanged();
                return this;
            }

            private boolean oJAFECKPAJE_;
            /**
             * <code>bool OJAFECKPAJE = 14;</code>
             *
             * @return The oJAFECKPAJE.
             */
            @java.lang.Override
            public boolean getOJAFECKPAJE() {
                return oJAFECKPAJE_;
            }
            /**
             * <code>bool OJAFECKPAJE = 14;</code>
             *
             * @param value The oJAFECKPAJE to set.
             * @return This builder for chaining.
             */
            public Builder setOJAFECKPAJE(boolean value) {

                oJAFECKPAJE_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool OJAFECKPAJE = 14;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearOJAFECKPAJE() {

                oJAFECKPAJE_ = false;
                onChanged();
                return this;
            }

            private int targetUid_;
            /**
             * <code>uint32 target_uid = 13;</code>
             *
             * @return The targetUid.
             */
            @java.lang.Override
            public int getTargetUid() {
                return targetUid_;
            }
            /**
             * <code>uint32 target_uid = 13;</code>
             *
             * @param value The targetUid to set.
             * @return This builder for chaining.
             */
            public Builder setTargetUid(int value) {

                targetUid_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 target_uid = 13;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearTargetUid() {

                targetUid_ = 0;
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

            // @@protoc_insertion_point(builder_scope:TryEnterHomeReq)
        }

        // @@protoc_insertion_point(class_scope:TryEnterHomeReq)
        private static final emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq();
        }

        public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<TryEnterHomeReq> PARSER =
                new com.google.protobuf.AbstractParser<TryEnterHomeReq>() {
                    @java.lang.Override
                    public TryEnterHomeReq parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new TryEnterHomeReq(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<TryEnterHomeReq> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<TryEnterHomeReq> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_TryEnterHomeReq_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_TryEnterHomeReq_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\025TryEnterHomeReq.proto\"e\n\017TryEnterHomeR"
                    + "eq\022\024\n\014target_point\030\007 \001(\r\022\023\n\013EIEPKFHNILM\030"
                    + "\002 \001(\010\022\023\n\013OJAFECKPAJE\030\016 \001(\010\022\022\n\ntarget_uid"
                    + "\030\r \001(\rB!\n\031emu.grasscutter.net.protoZ\004/ge"
                    + "nb\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_TryEnterHomeReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_TryEnterHomeReq_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_TryEnterHomeReq_descriptor,
                        new java.lang.String[] {
                            "TargetPoint", "EIEPKFHNILM", "OJAFECKPAJE", "TargetUid",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
