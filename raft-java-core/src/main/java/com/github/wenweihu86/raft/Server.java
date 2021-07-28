package com.github.wenweihu86.raft;

import com.github.wenweihu86.raft.proto.Endpoint;
import com.github.wenweihu86.raft.proto.RaftProto;
import com.github.wenweihu86.raft.proto.builder.EndpointOrBuilder;
import com.github.wenweihu86.raft.proto.builder.ServerOrBuilder;

/**
 * Protobuf type {@code raft.Server}
 */
public final class Server extends com.google.protobuf.GeneratedMessage implements ServerOrBuilder {
    // Use Server.newBuilder() to construct.
    private Server(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
        super(builder);
        this.unknownFields = builder.getUnknownFields();
    }
    private Server(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Server defaultInstance;
    public static Server getDefaultInstance() {
        return defaultInstance;
    }

    public Server getDefaultInstanceForType() {
        return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return this.unknownFields;
    }
    private Server(
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
                    case 8: {
                        bitField0_ |= 0x00000001;
                        serverId_ = input.readUInt32();
                        break;
                    }
                    case 18: {
                        Endpoint.Builder subBuilder = null;
                        if (((bitField0_ & 0x00000002) == 0x00000002)) {
                            subBuilder = endpoint_.toBuilder();
                        }
                        endpoint_ = input.readMessage(Endpoint.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(endpoint_);
                            endpoint_ = subBuilder.buildPartial();
                        }
                        bitField0_ |= 0x00000002;
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
        return RaftProto.internal_static_raft_Server_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return RaftProto.internal_static_raft_Server_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        Server.class, Server.Builder.class);
    }

    public static com.google.protobuf.Parser<Server> PARSER =
            new com.google.protobuf.AbstractParser<Server>() {
                public Server parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new Server(input, extensionRegistry);
                }
            };

    @java.lang.Override
    public com.google.protobuf.Parser<Server> getParserForType() {
        return PARSER;
    }

    private int bitField0_;
    // optional uint32 server_id = 1;
    public static final int SERVER_ID_FIELD_NUMBER = 1;
    private int serverId_;
    /**
     * <code>optional uint32 server_id = 1;</code>
     */
    public boolean hasServerId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional uint32 server_id = 1;</code>
     */
    public int getServerId() {
        return serverId_;
    }

    // optional .raft.Endpoint endpoint = 2;
    public static final int ENDPOINT_FIELD_NUMBER = 2;
    private Endpoint endpoint_;
    /**
     * <code>optional .raft.Endpoint endpoint = 2;</code>
     */
    public boolean hasEndpoint() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional .raft.Endpoint endpoint = 2;</code>
     */
    public Endpoint getEndpoint() {
        return endpoint_;
    }
    /**
     * <code>optional .raft.Endpoint endpoint = 2;</code>
     */
    public EndpointOrBuilder getEndpointOrBuilder() {
        return endpoint_;
    }

    private void initFields() {
        serverId_ = 0;
        endpoint_ = Endpoint.getDefaultInstance();
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
            output.writeUInt32(1, serverId_);
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
            output.writeMessage(2, endpoint_);
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
                    .computeUInt32Size(1, serverId_);
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
            size += com.google.protobuf.CodedOutputStream
                    .computeMessageSize(2, endpoint_);
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

    public static Server parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }
    public static Server parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Server parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }
    public static Server parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Server parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return PARSER.parseFrom(input);
    }
    public static Server parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
    }
    public static Server parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input);
    }
    public static Server parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static Server parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return PARSER.parseFrom(input);
    }
    public static Server parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Server.Builder newBuilder() { return Server.Builder.create(); }
    public Server.Builder newBuilderForType() { return newBuilder(); }
    public static Server.Builder newBuilder(Server prototype) {
        return newBuilder().mergeFrom(prototype);
    }
    public Server.Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Server.Builder newBuilderForType(
            com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        Server.Builder builder = new Server.Builder(parent);
        return builder;
    }
    /**
     * Protobuf type {@code raft.Server}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessage.Builder<Server.Builder>
            implements ServerOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return RaftProto.internal_static_raft_Server_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return RaftProto.internal_static_raft_Server_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            Server.class, Server.Builder.class);
        }

        // Construct using Server.newBuilder()
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
                getEndpointFieldBuilder();
            }
        }
        private static Server.Builder create() {
            return new Server.Builder();
        }

        public Server.Builder clear() {
            super.clear();
            serverId_ = 0;
            bitField0_ = (bitField0_ & ~0x00000001);
            if (endpointBuilder_ == null) {
                endpoint_ = Endpoint.getDefaultInstance();
            } else {
                endpointBuilder_.clear();
            }
            bitField0_ = (bitField0_ & ~0x00000002);
            return this;
        }

        public Server.Builder clone() {
            return create().mergeFrom(buildPartial());
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return RaftProto.internal_static_raft_Server_descriptor;
        }

        public Server getDefaultInstanceForType() {
            return Server.getDefaultInstance();
        }

        public Server build() {
            Server result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public Server buildPartial() {
            Server result = new Server(this);
            int from_bitField0_ = bitField0_;
            int to_bitField0_ = 0;
            if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                to_bitField0_ |= 0x00000001;
            }
            result.serverId_ = serverId_;
            if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                to_bitField0_ |= 0x00000002;
            }
            if (endpointBuilder_ == null) {
                result.endpoint_ = endpoint_;
            } else {
                result.endpoint_ = endpointBuilder_.build();
            }
            result.bitField0_ = to_bitField0_;
            onBuilt();
            return result;
        }

        public Server.Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof Server) {
                return mergeFrom((Server)other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Server.Builder mergeFrom(Server other) {
            if (other == Server.getDefaultInstance()) return this;
            if (other.hasServerId()) {
                setServerId(other.getServerId());
            }
            if (other.hasEndpoint()) {
                mergeEndpoint(other.getEndpoint());
            }
            this.mergeUnknownFields(other.getUnknownFields());
            return this;
        }

        public final boolean isInitialized() {
            return true;
        }

        public Server.Builder mergeFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            Server parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (Server) e.getUnfinishedMessage();
                throw e;
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }
        private int bitField0_;

        // optional uint32 server_id = 1;
        private int serverId_ ;
        /**
         * <code>optional uint32 server_id = 1;</code>
         */
        public boolean hasServerId() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional uint32 server_id = 1;</code>
         */
        public int getServerId() {
            return serverId_;
        }
        /**
         * <code>optional uint32 server_id = 1;</code>
         */
        public Server.Builder setServerId(int value) {
            bitField0_ |= 0x00000001;
            serverId_ = value;
            onChanged();
            return this;
        }
        /**
         * <code>optional uint32 server_id = 1;</code>
         */
        public Server.Builder clearServerId() {
            bitField0_ = (bitField0_ & ~0x00000001);
            serverId_ = 0;
            onChanged();
            return this;
        }

        // optional .raft.Endpoint endpoint = 2;
        private Endpoint endpoint_ = Endpoint.getDefaultInstance();
        private com.google.protobuf.SingleFieldBuilder<
                Endpoint, Endpoint.Builder, EndpointOrBuilder> endpointBuilder_;
        /**
         * <code>optional .raft.Endpoint endpoint = 2;</code>
         */
        public boolean hasEndpoint() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional .raft.Endpoint endpoint = 2;</code>
         */
        public Endpoint getEndpoint() {
            if (endpointBuilder_ == null) {
                return endpoint_;
            } else {
                return endpointBuilder_.getMessage();
            }
        }
        /**
         * <code>optional .raft.Endpoint endpoint = 2;</code>
         */
        public Server.Builder setEndpoint(Endpoint value) {
            if (endpointBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                endpoint_ = value;
                onChanged();
            } else {
                endpointBuilder_.setMessage(value);
            }
            bitField0_ |= 0x00000002;
            return this;
        }
        /**
         * <code>optional .raft.Endpoint endpoint = 2;</code>
         */
        public Server.Builder setEndpoint(
                Endpoint.Builder builderForValue) {
            if (endpointBuilder_ == null) {
                endpoint_ = builderForValue.build();
                onChanged();
            } else {
                endpointBuilder_.setMessage(builderForValue.build());
            }
            bitField0_ |= 0x00000002;
            return this;
        }
        /**
         * <code>optional .raft.Endpoint endpoint = 2;</code>
         */
        public Server.Builder mergeEndpoint(Endpoint value) {
            if (endpointBuilder_ == null) {
                if (((bitField0_ & 0x00000002) == 0x00000002) &&
                        endpoint_ != Endpoint.getDefaultInstance()) {
                    endpoint_ =
                            Endpoint.newBuilder(endpoint_).mergeFrom(value).buildPartial();
                } else {
                    endpoint_ = value;
                }
                onChanged();
            } else {
                endpointBuilder_.mergeFrom(value);
            }
            bitField0_ |= 0x00000002;
            return this;
        }
        /**
         * <code>optional .raft.Endpoint endpoint = 2;</code>
         */
        public Server.Builder clearEndpoint() {
            if (endpointBuilder_ == null) {
                endpoint_ = Endpoint.getDefaultInstance();
                onChanged();
            } else {
                endpointBuilder_.clear();
            }
            bitField0_ = (bitField0_ & ~0x00000002);
            return this;
        }
        /**
         * <code>optional .raft.Endpoint endpoint = 2;</code>
         */
        public Endpoint.Builder getEndpointBuilder() {
            bitField0_ |= 0x00000002;
            onChanged();
            return getEndpointFieldBuilder().getBuilder();
        }
        /**
         * <code>optional .raft.Endpoint endpoint = 2;</code>
         */
        public EndpointOrBuilder getEndpointOrBuilder() {
            if (endpointBuilder_ != null) {
                return endpointBuilder_.getMessageOrBuilder();
            } else {
                return endpoint_;
            }
        }
        /**
         * <code>optional .raft.Endpoint endpoint = 2;</code>
         */
        private com.google.protobuf.SingleFieldBuilder<
                Endpoint, Endpoint.Builder, EndpointOrBuilder>
        getEndpointFieldBuilder() {
            if (endpointBuilder_ == null) {
                endpointBuilder_ = new com.google.protobuf.SingleFieldBuilder<
                        Endpoint, Endpoint.Builder, EndpointOrBuilder>(
                        endpoint_,
                        getParentForChildren(),
                        isClean());
                endpoint_ = null;
            }
            return endpointBuilder_;
        }

        // @@protoc_insertion_point(builder_scope:raft.Server)
    }

    static {
        defaultInstance = new Server(true);
        defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:raft.Server)
}
