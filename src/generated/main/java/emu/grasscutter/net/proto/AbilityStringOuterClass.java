// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AbilityString.proto

package emu.grasscutter.net.proto;

public final class AbilityStringOuterClass {
    private AbilityStringOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface AbilityStringOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:AbilityString)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>string str = 1;</code>
         *
         * @return Whether the str field is set.
         */
        boolean hasStr();
        /**
         * <code>string str = 1;</code>
         *
         * @return The str.
         */
        java.lang.String getStr();
        /**
         * <code>string str = 1;</code>
         *
         * @return The bytes for str.
         */
        com.google.protobuf.ByteString getStrBytes();

        /**
         * <code>uint32 hash = 2;</code>
         *
         * @return Whether the hash field is set.
         */
        boolean hasHash();
        /**
         * <code>uint32 hash = 2;</code>
         *
         * @return The hash.
         */
        int getHash();

        public emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.TypeCase getTypeCase();
    }
    /**
     *
     *
     * <pre>
     * Name: CPMJBNHKIEA
     * </pre>
     *
     * Protobuf type {@code AbilityString}
     */
    public static final class AbilityString extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:AbilityString)
            AbilityStringOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use AbilityString.newBuilder() to construct.
        private AbilityString(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private AbilityString() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new AbilityString();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private AbilityString(
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
                        case 10:
                            {
                                java.lang.String s = input.readStringRequireUtf8();
                                typeCase_ = 1;
                                type_ = s;
                                break;
                            }
                        case 16:
                            {
                                typeCase_ = 2;
                                type_ = input.readUInt32();
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
            return emu.grasscutter.net.proto.AbilityStringOuterClass
                    .internal_static_AbilityString_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.AbilityStringOuterClass
                    .internal_static_AbilityString_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.class,
                            emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.Builder.class);
        }

        private int typeCase_ = 0;
        private java.lang.Object type_;

        public enum TypeCase
                implements
                        com.google.protobuf.Internal.EnumLite,
                        com.google.protobuf.AbstractMessage.InternalOneOfEnum {
            STR(1),
            HASH(2),
            TYPE_NOT_SET(0);
            private final int value;

            private TypeCase(int value) {
                this.value = value;
            }
            /**
             * @param value The number of the enum to look for.
             * @return The enum associated with the given number.
             * @deprecated Use {@link #forNumber(int)} instead.
             */
            @java.lang.Deprecated
            public static TypeCase valueOf(int value) {
                return forNumber(value);
            }

            public static TypeCase forNumber(int value) {
                switch (value) {
                    case 1:
                        return STR;
                    case 2:
                        return HASH;
                    case 0:
                        return TYPE_NOT_SET;
                    default:
                        return null;
                }
            }

            public int getNumber() {
                return this.value;
            }
        };

        public TypeCase getTypeCase() {
            return TypeCase.forNumber(typeCase_);
        }

        public static final int STR_FIELD_NUMBER = 1;
        /**
         * <code>string str = 1;</code>
         *
         * @return Whether the str field is set.
         */
        public boolean hasStr() {
            return typeCase_ == 1;
        }
        /**
         * <code>string str = 1;</code>
         *
         * @return The str.
         */
        public java.lang.String getStr() {
            java.lang.Object ref = "";
            if (typeCase_ == 1) {
                ref = type_;
            }
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (typeCase_ == 1) {
                    type_ = s;
                }
                return s;
            }
        }
        /**
         * <code>string str = 1;</code>
         *
         * @return The bytes for str.
         */
        public com.google.protobuf.ByteString getStrBytes() {
            java.lang.Object ref = "";
            if (typeCase_ == 1) {
                ref = type_;
            }
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
                if (typeCase_ == 1) {
                    type_ = b;
                }
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int HASH_FIELD_NUMBER = 2;
        /**
         * <code>uint32 hash = 2;</code>
         *
         * @return Whether the hash field is set.
         */
        @java.lang.Override
        public boolean hasHash() {
            return typeCase_ == 2;
        }
        /**
         * <code>uint32 hash = 2;</code>
         *
         * @return The hash.
         */
        @java.lang.Override
        public int getHash() {
            if (typeCase_ == 2) {
                return (java.lang.Integer) type_;
            }
            return 0;
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
            if (typeCase_ == 1) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, type_);
            }
            if (typeCase_ == 2) {
                output.writeUInt32(2, (int) ((java.lang.Integer) type_));
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (typeCase_ == 1) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, type_);
            }
            if (typeCase_ == 2) {
                size +=
                        com.google.protobuf.CodedOutputStream.computeUInt32Size(
                                2, (int) ((java.lang.Integer) type_));
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
            if (!(obj instanceof emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString other =
                    (emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString) obj;

            if (!getTypeCase().equals(other.getTypeCase())) return false;
            switch (typeCase_) {
                case 1:
                    if (!getStr().equals(other.getStr())) return false;
                    break;
                case 2:
                    if (getHash() != other.getHash()) return false;
                    break;
                case 0:
                default:
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
            switch (typeCase_) {
                case 1:
                    hash = (37 * hash) + STR_FIELD_NUMBER;
                    hash = (53 * hash) + getStr().hashCode();
                    break;
                case 2:
                    hash = (37 * hash) + HASH_FIELD_NUMBER;
                    hash = (53 * hash) + getHash();
                    break;
                case 0:
                default:
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString parseFrom(
                java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString parseFrom(
                java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString parseFrom(
                byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString parseFrom(
                byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString parseFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString parseFrom(
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
                emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString prototype) {
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
         * Name: CPMJBNHKIEA
         * </pre>
         *
         * Protobuf type {@code AbilityString}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:AbilityString)
                emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityStringOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.AbilityStringOuterClass
                        .internal_static_AbilityString_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.AbilityStringOuterClass
                        .internal_static_AbilityString_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.class,
                                emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.newBuilder()
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
                typeCase_ = 0;
                type_ = null;
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.AbilityStringOuterClass
                        .internal_static_AbilityString_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString build() {
                emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString buildPartial() {
                emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString result =
                        new emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString(this);
                if (typeCase_ == 1) {
                    result.type_ = type_;
                }
                if (typeCase_ == 2) {
                    result.type_ = type_;
                }
                result.typeCase_ = typeCase_;
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
                if (other instanceof emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString) {
                    return mergeFrom((emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString other) {
                if (other
                        == emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString.getDefaultInstance())
                    return this;
                switch (other.getTypeCase()) {
                    case STR:
                        {
                            typeCase_ = 1;
                            type_ = other.type_;
                            onChanged();
                            break;
                        }
                    case HASH:
                        {
                            setHash(other.getHash());
                            break;
                        }
                    case TYPE_NOT_SET:
                        {
                            break;
                        }
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
                emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int typeCase_ = 0;
            private java.lang.Object type_;

            public TypeCase getTypeCase() {
                return TypeCase.forNumber(typeCase_);
            }

            public Builder clearType() {
                typeCase_ = 0;
                type_ = null;
                onChanged();
                return this;
            }

            /**
             * <code>string str = 1;</code>
             *
             * @return Whether the str field is set.
             */
            @java.lang.Override
            public boolean hasStr() {
                return typeCase_ == 1;
            }
            /**
             * <code>string str = 1;</code>
             *
             * @return The str.
             */
            @java.lang.Override
            public java.lang.String getStr() {
                java.lang.Object ref = "";
                if (typeCase_ == 1) {
                    ref = type_;
                }
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (typeCase_ == 1) {
                        type_ = s;
                    }
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>string str = 1;</code>
             *
             * @return The bytes for str.
             */
            @java.lang.Override
            public com.google.protobuf.ByteString getStrBytes() {
                java.lang.Object ref = "";
                if (typeCase_ == 1) {
                    ref = type_;
                }
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
                    if (typeCase_ == 1) {
                        type_ = b;
                    }
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string str = 1;</code>
             *
             * @param value The str to set.
             * @return This builder for chaining.
             */
            public Builder setStr(java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                typeCase_ = 1;
                type_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string str = 1;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearStr() {
                if (typeCase_ == 1) {
                    typeCase_ = 0;
                    type_ = null;
                    onChanged();
                }
                return this;
            }
            /**
             * <code>string str = 1;</code>
             *
             * @param value The bytes for str to set.
             * @return This builder for chaining.
             */
            public Builder setStrBytes(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);
                typeCase_ = 1;
                type_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>uint32 hash = 2;</code>
             *
             * @return Whether the hash field is set.
             */
            public boolean hasHash() {
                return typeCase_ == 2;
            }
            /**
             * <code>uint32 hash = 2;</code>
             *
             * @return The hash.
             */
            public int getHash() {
                if (typeCase_ == 2) {
                    return (java.lang.Integer) type_;
                }
                return 0;
            }
            /**
             * <code>uint32 hash = 2;</code>
             *
             * @param value The hash to set.
             * @return This builder for chaining.
             */
            public Builder setHash(int value) {
                typeCase_ = 2;
                type_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 hash = 2;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearHash() {
                if (typeCase_ == 2) {
                    typeCase_ = 0;
                    type_ = null;
                    onChanged();
                }
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

            // @@protoc_insertion_point(builder_scope:AbilityString)
        }

        // @@protoc_insertion_point(class_scope:AbilityString)
        private static final emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString();
        }

        public static emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<AbilityString> PARSER =
                new com.google.protobuf.AbstractParser<AbilityString>() {
                    @java.lang.Override
                    public AbilityString parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new AbilityString(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<AbilityString> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<AbilityString> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.AbilityStringOuterClass.AbilityString
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_AbilityString_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_AbilityString_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\023AbilityString.proto\"6\n\rAbilityString\022\r"
                    + "\n\003str\030\001 \001(\tH\000\022\016\n\004hash\030\002 \001(\rH\000B\006\n\004typeB!\n"
                    + "\031emu.grasscutter.net.protoZ\004/genb\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_AbilityString_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AbilityString_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_AbilityString_descriptor,
                        new java.lang.String[] {
                            "Str", "Hash", "Type",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
