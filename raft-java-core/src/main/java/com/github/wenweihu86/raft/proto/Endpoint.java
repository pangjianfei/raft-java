package com.github.wenweihu86.raft.proto;

import com.github.wenweihu86.raft.proto.builder.EndpointOrBuilder;

/**
 * Protobuf type {@code raft.Endpoint}
 */
public final class Endpoint extends
        com.google.protobuf.GeneratedMessage
        implements EndpointOrBuilder {
    // Use Endpoint.newBuilder() to construct.
    private Endpoint(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
        super(builder);
        this.unknownFields = builder.getUnknownFields();
    }
    private Endpoint(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Endpoint defaultInstance;
    public static Endpoint getDefaultInstance() {
        return defaultInstance;
    }

    public Endpoint getDefaultInstanceForType() {
        return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return this.unknownFields;
    }
    public Endpoint(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        initFields();
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
                    default: {
                        if (!parseUnknownField(input, unknownFields,
                                extensionRegistry, tag)) {
                            done = true;
                        }
                        break;
                    }
                    case 10: {
                        bitField0_ |= 0x00000001;
                        host_ = input.readBytes();
                        break;
                    }
                    case 16: {
                        bitField0_ |= 0x00000002;
                        port_ = input.readUInt32();
                        break;
                    }
                }
            }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(this);
        } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this);
        } finally {
            this.unknownFields = unknownFields.build();
            makeExtensionsImmutable();
        }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
        return RaftProto.internal_static_raft_Endpoint_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return RaftProto.internal_static_raft_Endpoint_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        Endpoint.class, Endpoint.Builder.class);
    }

    public static com.google.protobuf.Parser<Endpoint> PARSER =
            new com.google.protobuf.AbstractParser<Endpoint>() {
                public Endpoint parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new Endpoint(input, extensionRegistry);
                }
            };

    @java.lang.Override
    public com.google.protobuf.Parser<Endpoint> getParserForType() {
        return PARSER;
    }

    private int bitField0_;
    // optional string host = 1;
    public static final int HOST_FIELD_NUMBER = 1;
    private java.lang.Object host_;
    /**
     * <code>optional string host = 1;</code>
     */
    public boolean hasHost() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string host = 1;</code>
     */
    public java.lang.String getHost() {
        java.lang.Object ref = host_;
        if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
        } else {
            com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                host_ = s;
            }
            return s;
        }
    }
    /**
     * <code>optional string host = 1;</code>
     */
    public com.google.protobuf.ByteString
    getHostBytes() {
        java.lang.Object ref = host_;
        if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b =
                    com.google.protobuf.ByteString.copyFromUtf8(
                            (java.lang.String) ref);
            host_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    // optional uint32 port = 2;
    public static final int PORT_FIELD_NUMBER = 2;
    private int port_;
    /**
     * <code>optional uint32 port = 2;</code>
     */
    public boolean hasPort() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional uint32 port = 2;</code>
     */
    public int getPort() {
        return port_;
    }

    private void initFields() {
        host_ = "";
        port_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized != -1) return isInitialized == 1;

        memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
            throws java.io.IOException {
        getSerializedSize();
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
            output.writeBytes(1, getHostBytes());
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
            output.writeUInt32(2, port_);
        }
        getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
        int size = memoizedSerializedSize;
        if (size != -1) return size;

        size = 0;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
            size += com.google.protobuf.CodedOutputStream
                    .computeBytesSize(1, getHostBytes());
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
            size += com.google.protobuf.CodedOutputStream
                    .computeUInt32Size(2, port_);
        }
        size += getUnknownFields().getSerializedSize();
        memoizedSerializedSize = size;
        return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
            throws java.io.ObjectStreamException {
        return super.writeReplace();
    }

    public static Endpoint parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }
    public static Endpoint parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Endpoint parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }
    public static Endpoint parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Endpoint parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return PARSER.parseFrom(input);
    }
    public static Endpoint parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
    }
    public static Endpoint parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input);
    }
    public static Endpoint parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static Endpoint parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return PARSER.parseFrom(input);
    }
    public static Endpoint parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(Endpoint prototype) {
        return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
            com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }
    /**
     * Protobuf type {@code raft.Endpoint}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessage.Builder<Builder>
            implements EndpointOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return RaftProto.internal_static_raft_Endpoint_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return RaftProto.internal_static_raft_Endpoint_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            Endpoint.class, Endpoint.Builder.class);
        }

        // Construct using Endpoint.newBuilder()
        private Builder() {
            maybeForceBuilderInitialization();
        }

        private Builder(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            super(parent);
            maybeForceBuilderInitialization();
        }
        private void maybeForceBuilderInitialization() {
            if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
            }
        }
        private static Builder create() {
            return new Builder();
        }

        public Builder clear() {
            super.clear();
            host_ = "";
            bitField0_ = (bitField0_ & ~0x00000001);
            port_ = 0;
            bitField0_ = (bitField0_ & ~0x00000002);
            return this;
        }

        public Builder clone() {
            return create().mergeFrom(buildPartial());
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return RaftProto.internal_static_raft_Endpoint_descriptor;
        }

        public Endpoint getDefaultInstanceForType() {
            return Endpoint.getDefaultInstance();
        }

        public Endpoint build() {
            Endpoint result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public Endpoint buildPartial() {
            Endpoint result = new Endpoint(this);
            int from_bitField0_ = bitField0_;
            int to_bitField0_ = 0;
            if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                to_bitField0_ |= 0x00000001;
            }
            result.host_ = host_;
            if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                to_bitField0_ |= 0x00000002;
            }
            result.port_ = port_;
            result.bitField0_ = to_bitField0_;
            onBuilt();
            return result;
        }

        public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof Endpoint) {
                return mergeFrom((Endpoint)other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(Endpoint other) {
            if (other == Endpoint.getDefaultInstance()) return this;
            if (other.hasHost()) {
                bitField0_ |= 0x00000001;
                host_ = other.host_;
                onChanged();
            }
            if (other.hasPort()) {
                setPort(other.getPort());
            }
            this.mergeUnknownFields(other.getUnknownFields());
            return this;
        }

        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            Endpoint parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (Endpoint) e.getUnfinishedMessage();
                throw e;
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }
        private int bitField0_;

        // optional string host = 1;
        private java.lang.Object host_ = "";
        /**
         * <code>optional string host = 1;</code>
         */
        public boolean hasHost() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional string host = 1;</code>
         */
        public java.lang.String getHost() {
            java.lang.Object ref = host_;
            if (!(ref instanceof java.lang.String)) {
                java.lang.String s = ((com.google.protobuf.ByteString) ref)
                        .toStringUtf8();
                host_ = s;
                return s;
            } else {
                return (java.lang.String) ref;
            }
        }
        /**
         * <code>optional string host = 1;</code>
         */
        public com.google.protobuf.ByteString
        getHostBytes() {
            java.lang.Object ref = host_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                host_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }
        /**
         * <code>optional string host = 1;</code>
         */
        public Builder setHost(
                java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            bitField0_ |= 0x00000001;
            host_ = value;
            onChanged();
            return this;
        }
        /**
         * <code>optional string host = 1;</code>
         */
        public Builder clearHost() {
            bitField0_ = (bitField0_ & ~0x00000001);
            host_ = getDefaultInstance().getHost();
            onChanged();
            return this;
        }
        /**
         * <code>optional string host = 1;</code>
         */
        public Builder setHostBytes(
                com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            bitField0_ |= 0x00000001;
            host_ = value;
            onChanged();
            return this;
        }

        // optional uint32 port = 2;
        private int port_ ;
        /**
         * <code>optional uint32 port = 2;</code>
         */
        public boolean hasPort() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional uint32 port = 2;</code>
         */
        public int getPort() {
            return port_;
        }
        /**
         * <code>optional uint32 port = 2;</code>
         */
        public Builder setPort(int value) {
            bitField0_ |= 0x00000002;
            port_ = value;
            onChanged();
            return this;
        }
        /**
         * <code>optional uint32 port = 2;</code>
         */
        public Builder clearPort() {
            bitField0_ = (bitField0_ & ~0x00000002);
            port_ = 0;
            onChanged();
            return this;
        }

        // @@protoc_insertion_point(builder_scope:raft.Endpoint)
    }

    static {
        defaultInstance = new Endpoint(true);
        defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:raft.Endpoint)
}

