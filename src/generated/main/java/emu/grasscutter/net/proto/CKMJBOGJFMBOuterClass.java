// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CKMJBOGJFMB.proto

package emu.grasscutter.net.proto;

public final class CKMJBOGJFMBOuterClass {
    private CKMJBOGJFMBOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface CKMJBOGJFMBOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:CKMJBOGJFMB)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 level_id = 7;</code>
         *
         * @return The levelId.
         */
        int getLevelId();

        /**
         * <code>bool is_open = 13;</code>
         *
         * @return The isOpen.
         */
        boolean getIsOpen();

        /**
         * <code>bool is_finish = 15;</code>
         *
         * @return The isFinish.
         */
        boolean getIsFinish();

        /**
         * <code>uint32 best_score = 3;</code>
         *
         * @return The bestScore.
         */
        int getBestScore();
    }
    /**
     *
     *
     * <pre>
     * Name: CKMJBOGJFMB
     * </pre>
     *
     * Protobuf type {@code CKMJBOGJFMB}
     */
    public static final class CKMJBOGJFMB extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:CKMJBOGJFMB)
            CKMJBOGJFMBOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use CKMJBOGJFMB.newBuilder() to construct.
        private CKMJBOGJFMB(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private CKMJBOGJFMB() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new CKMJBOGJFMB();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private CKMJBOGJFMB(
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
                                bestScore_ = input.readUInt32();
                                break;
                            }
                        case 56:
                            {
                                levelId_ = input.readUInt32();
                                break;
                            }
                        case 104:
                            {
                                isOpen_ = input.readBool();
                                break;
                            }
                        case 120:
                            {
                                isFinish_ = input.readBool();
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
            return emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.internal_static_CKMJBOGJFMB_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass
                    .internal_static_CKMJBOGJFMB_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB.class,
                            emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB.Builder.class);
        }

        public static final int LEVEL_ID_FIELD_NUMBER = 7;
        private int levelId_;
        /**
         * <code>uint32 level_id = 7;</code>
         *
         * @return The levelId.
         */
        @java.lang.Override
        public int getLevelId() {
            return levelId_;
        }

        public static final int IS_OPEN_FIELD_NUMBER = 13;
        private boolean isOpen_;
        /**
         * <code>bool is_open = 13;</code>
         *
         * @return The isOpen.
         */
        @java.lang.Override
        public boolean getIsOpen() {
            return isOpen_;
        }

        public static final int IS_FINISH_FIELD_NUMBER = 15;
        private boolean isFinish_;
        /**
         * <code>bool is_finish = 15;</code>
         *
         * @return The isFinish.
         */
        @java.lang.Override
        public boolean getIsFinish() {
            return isFinish_;
        }

        public static final int BEST_SCORE_FIELD_NUMBER = 3;
        private int bestScore_;
        /**
         * <code>uint32 best_score = 3;</code>
         *
         * @return The bestScore.
         */
        @java.lang.Override
        public int getBestScore() {
            return bestScore_;
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
            if (bestScore_ != 0) {
                output.writeUInt32(3, bestScore_);
            }
            if (levelId_ != 0) {
                output.writeUInt32(7, levelId_);
            }
            if (isOpen_ != false) {
                output.writeBool(13, isOpen_);
            }
            if (isFinish_ != false) {
                output.writeBool(15, isFinish_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (bestScore_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(3, bestScore_);
            }
            if (levelId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(7, levelId_);
            }
            if (isOpen_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(13, isOpen_);
            }
            if (isFinish_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(15, isFinish_);
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
            if (!(obj instanceof emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB other =
                    (emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB) obj;

            if (getLevelId() != other.getLevelId()) return false;
            if (getIsOpen() != other.getIsOpen()) return false;
            if (getIsFinish() != other.getIsFinish()) return false;
            if (getBestScore() != other.getBestScore()) return false;
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
            hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
            hash = (53 * hash) + getLevelId();
            hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsOpen());
            hash = (37 * hash) + IS_FINISH_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsFinish());
            hash = (37 * hash) + BEST_SCORE_FIELD_NUMBER;
            hash = (53 * hash) + getBestScore();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB parseFrom(
                java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB parseFrom(
                java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB parseFrom(
                byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB parseFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB parseDelimitedFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB parseDelimitedFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB parseFrom(
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
                emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB prototype) {
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
         * Name: CKMJBOGJFMB
         * </pre>
         *
         * Protobuf type {@code CKMJBOGJFMB}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:CKMJBOGJFMB)
                emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMBOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass
                        .internal_static_CKMJBOGJFMB_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass
                        .internal_static_CKMJBOGJFMB_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB.class,
                                emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB.Builder.class);
            }

            // Construct using emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB.newBuilder()
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
                levelId_ = 0;

                isOpen_ = false;

                isFinish_ = false;

                bestScore_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass
                        .internal_static_CKMJBOGJFMB_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB build() {
                emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB buildPartial() {
                emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB result =
                        new emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB(this);
                result.levelId_ = levelId_;
                result.isOpen_ = isOpen_;
                result.isFinish_ = isFinish_;
                result.bestScore_ = bestScore_;
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
                if (other instanceof emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB) {
                    return mergeFrom((emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB other) {
                if (other
                        == emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB.getDefaultInstance())
                    return this;
                if (other.getLevelId() != 0) {
                    setLevelId(other.getLevelId());
                }
                if (other.getIsOpen() != false) {
                    setIsOpen(other.getIsOpen());
                }
                if (other.getIsFinish() != false) {
                    setIsFinish(other.getIsFinish());
                }
                if (other.getBestScore() != 0) {
                    setBestScore(other.getBestScore());
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
                emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int levelId_;
            /**
             * <code>uint32 level_id = 7;</code>
             *
             * @return The levelId.
             */
            @java.lang.Override
            public int getLevelId() {
                return levelId_;
            }
            /**
             * <code>uint32 level_id = 7;</code>
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
             * <code>uint32 level_id = 7;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearLevelId() {

                levelId_ = 0;
                onChanged();
                return this;
            }

            private boolean isOpen_;
            /**
             * <code>bool is_open = 13;</code>
             *
             * @return The isOpen.
             */
            @java.lang.Override
            public boolean getIsOpen() {
                return isOpen_;
            }
            /**
             * <code>bool is_open = 13;</code>
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
             * <code>bool is_open = 13;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIsOpen() {

                isOpen_ = false;
                onChanged();
                return this;
            }

            private boolean isFinish_;
            /**
             * <code>bool is_finish = 15;</code>
             *
             * @return The isFinish.
             */
            @java.lang.Override
            public boolean getIsFinish() {
                return isFinish_;
            }
            /**
             * <code>bool is_finish = 15;</code>
             *
             * @param value The isFinish to set.
             * @return This builder for chaining.
             */
            public Builder setIsFinish(boolean value) {

                isFinish_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool is_finish = 15;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIsFinish() {

                isFinish_ = false;
                onChanged();
                return this;
            }

            private int bestScore_;
            /**
             * <code>uint32 best_score = 3;</code>
             *
             * @return The bestScore.
             */
            @java.lang.Override
            public int getBestScore() {
                return bestScore_;
            }
            /**
             * <code>uint32 best_score = 3;</code>
             *
             * @param value The bestScore to set.
             * @return This builder for chaining.
             */
            public Builder setBestScore(int value) {

                bestScore_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 best_score = 3;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearBestScore() {

                bestScore_ = 0;
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

            // @@protoc_insertion_point(builder_scope:CKMJBOGJFMB)
        }

        // @@protoc_insertion_point(class_scope:CKMJBOGJFMB)
        private static final emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB();
        }

        public static emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<CKMJBOGJFMB> PARSER =
                new com.google.protobuf.AbstractParser<CKMJBOGJFMB>() {
                    @java.lang.Override
                    public CKMJBOGJFMB parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new CKMJBOGJFMB(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<CKMJBOGJFMB> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<CKMJBOGJFMB> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.CKMJBOGJFMBOuterClass.CKMJBOGJFMB getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_CKMJBOGJFMB_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_CKMJBOGJFMB_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\021CKMJBOGJFMB.proto\"W\n\013CKMJBOGJFMB\022\020\n\010le"
                    + "vel_id\030\007 \001(\r\022\017\n\007is_open\030\r \001(\010\022\021\n\tis_fini"
                    + "sh\030\017 \001(\010\022\022\n\nbest_score\030\003 \001(\rB!\n\031emu.gras"
                    + "scutter.net.protoZ\004/genb\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_CKMJBOGJFMB_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_CKMJBOGJFMB_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_CKMJBOGJFMB_descriptor,
                        new java.lang.String[] {
                            "LevelId", "IsOpen", "IsFinish", "BestScore",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
