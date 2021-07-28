package com.github.wenweihu86.raft.proto;

import com.github.wenweihu86.raft.Server;
import com.github.wenweihu86.raft.proto.base.ResCode;
import com.github.wenweihu86.raft.proto.builder.GetConfigurationResponseOrBuilder;
import com.github.wenweihu86.raft.proto.builder.ServerOrBuilder;

import static com.github.wenweihu86.raft.proto.RaftProto.internal_static_raft_GetConfigurationResponse_descriptor;
import static com.github.wenweihu86.raft.proto.RaftProto.internal_static_raft_GetConfigurationResponse_fieldAccessorTable;

/**
 * Protobuf type {@code raft.GetConfigurationResponse}
 */
public final class GetConfigurationResponse extends
        com.google.protobuf.GeneratedMessage
        implements GetConfigurationResponseOrBuilder {
    // Use GetConfigurationResponse.newBuilder() to construct.
    private GetConfigurationResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
        super(builder);
        this.unknownFields = builder.getUnknownFields();
    }
    private GetConfigurationResponse(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final GetConfigurationResponse defaultInstance;
    public static GetConfigurationResponse getDefaultInstance() {
        return defaultInstance;
    }

    public GetConfigurationResponse getDefaultInstanceForType() {
        return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return this.unknownFields;
    }
    private GetConfigurationResponse(
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
                        int rawValue = input.readEnum();
                        ResCode value = ResCode.valueOf(rawValue);
                        if (value == null) {
                            unknownFields.mergeVarintField(1, rawValue);
                        } else {
                            bitField0_ |= 0x00000001;
                            resCode_ = value;
                        }
                        break;
                    }
                    case 18: {
                        bitField0_ |= 0x00000002;
                        resMsg_ = input.readBytes();
                        break;
                    }
                    case 26: {
                        Server.Builder subBuilder = null;
                        if (((bitField0_ & 0x00000004) == 0x00000004)) {
                            subBuilder = leader_.toBuilder();
                        }
                        leader_ = input.readMessage(Server.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(leader_);
                            leader_ = subBuilder.buildPartial();
                        }
                        bitField0_ |= 0x00000004;
                        break;
                    }
                    case 34: {
                        if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                            servers_ = new java.util.ArrayList<Server>();
                            mutable_bitField0_ |= 0x00000008;
                        }
                        servers_.add(input.readMessage(Server.PARSER, extensionRegistry));
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
            if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                servers_ = java.util.Collections.unmodifiableList(servers_);
            }
            this.unknownFields = unknownFields.build();
            makeExtensionsImmutable();
        }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
        return internal_static_raft_GetConfigurationResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return internal_static_raft_GetConfigurationResponse_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        GetConfigurationResponse.class, GetConfigurationResponse.Builder.class);
    }

    public static com.google.protobuf.Parser<GetConfigurationResponse> PARSER =
            new com.google.protobuf.AbstractParser<GetConfigurationResponse>() {
                public GetConfigurationResponse parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new GetConfigurationResponse(input, extensionRegistry);
                }
            };

    @java.lang.Override
    public com.google.protobuf.Parser<GetConfigurationResponse> getParserForType() {
        return PARSER;
    }

    private int bitField0_;
    // optional .raft.ResCode res_code = 1;
    public static final int RES_CODE_FIELD_NUMBER = 1;
    private ResCode resCode_;
    /**
     * <code>optional .raft.ResCode res_code = 1;</code>
     */
    public boolean hasResCode() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional .raft.ResCode res_code = 1;</code>
     */
    public ResCode getResCode() {
        return resCode_;
    }

    // optional string res_msg = 2;
    public static final int RES_MSG_FIELD_NUMBER = 2;
    private java.lang.Object resMsg_;
    /**
     * <code>optional string res_msg = 2;</code>
     */
    public boolean hasResMsg() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string res_msg = 2;</code>
     */
    public java.lang.String getResMsg() {
        java.lang.Object ref = resMsg_;
        if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
        } else {
            com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                resMsg_ = s;
            }
            return s;
        }
    }
    /**
     * <code>optional string res_msg = 2;</code>
     */
    public com.google.protobuf.ByteString
    getResMsgBytes() {
        java.lang.Object ref = resMsg_;
        if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b =
                    com.google.protobuf.ByteString.copyFromUtf8(
                            (java.lang.String) ref);
            resMsg_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    // optional .raft.Server leader = 3;
    public static final int LEADER_FIELD_NUMBER = 3;
    private Server leader_;
    /**
     * <code>optional .raft.Server leader = 3;</code>
     */
    public boolean hasLeader() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional .raft.Server leader = 3;</code>
     */
    public Server getLeader() {
        return leader_;
    }
    /**
     * <code>optional .raft.Server leader = 3;</code>
     */
    public ServerOrBuilder getLeaderOrBuilder() {
        return leader_;
    }

    // repeated .raft.Server servers = 4;
    public static final int SERVERS_FIELD_NUMBER = 4;
    private java.util.List<Server> servers_;
    /**
     * <code>repeated .raft.Server servers = 4;</code>
     */
    public java.util.List<Server> getServersList() {
        return servers_;
    }
    /**
     * <code>repeated .raft.Server servers = 4;</code>
     */
    public java.util.List<? extends ServerOrBuilder>
    getServersOrBuilderList() {
        return servers_;
    }
    /**
     * <code>repeated .raft.Server servers = 4;</code>
     */
    public int getServersCount() {
        return servers_.size();
    }
    /**
     * <code>repeated .raft.Server servers = 4;</code>
     */
    public Server getServers(int index) {
        return servers_.get(index);
    }
    /**
     * <code>repeated .raft.Server servers = 4;</code>
     */
    public ServerOrBuilder getServersOrBuilder(
            int index) {
        return servers_.get(index);
    }

    private void initFields() {
        resCode_ = ResCode.RES_CODE_SUCCESS;
        resMsg_ = "";
        leader_ = Server.getDefaultInstance();
        servers_ = java.util.Collections.emptyList();
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
            output.writeEnum(1, resCode_.getNumber());
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
            output.writeBytes(2, getResMsgBytes());
        }
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
            output.writeMessage(3, leader_);
        }
        for (int i = 0; i < servers_.size(); i++) {
            output.writeMessage(4, servers_.get(i));
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
                    .computeEnumSize(1, resCode_.getNumber());
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
            size += com.google.protobuf.CodedOutputStream
                    .computeBytesSize(2, getResMsgBytes());
        }
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
            size += com.google.protobuf.CodedOutputStream
                    .computeMessageSize(3, leader_);
        }
        for (int i = 0; i < servers_.size(); i++) {
            size += com.google.protobuf.CodedOutputStream
                    .computeMessageSize(4, servers_.get(i));
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

    public static GetConfigurationResponse parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }
    public static GetConfigurationResponse parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GetConfigurationResponse parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }
    public static GetConfigurationResponse parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GetConfigurationResponse parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return PARSER.parseFrom(input);
    }
    public static GetConfigurationResponse parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
    }
    public static GetConfigurationResponse parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input);
    }
    public static GetConfigurationResponse parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static GetConfigurationResponse parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return PARSER.parseFrom(input);
    }
    public static GetConfigurationResponse parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(GetConfigurationResponse prototype) {
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
     * Protobuf type {@code raft.GetConfigurationResponse}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessage.Builder<Builder>
            implements GetConfigurationResponseOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return internal_static_raft_GetConfigurationResponse_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return internal_static_raft_GetConfigurationResponse_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            GetConfigurationResponse.class, GetConfigurationResponse.Builder.class);
        }

        // Construct using GetConfigurationResponse.newBuilder()
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
                getLeaderFieldBuilder();
                getServersFieldBuilder();
            }
        }
        private static Builder create() {
            return new Builder();
        }

        public Builder clear() {
            super.clear();
            resCode_ = ResCode.RES_CODE_SUCCESS;
            bitField0_ = (bitField0_ & ~0x00000001);
            resMsg_ = "";
            bitField0_ = (bitField0_ & ~0x00000002);
            if (leaderBuilder_ == null) {
                leader_ = Server.getDefaultInstance();
            } else {
                leaderBuilder_.clear();
            }
            bitField0_ = (bitField0_ & ~0x00000004);
            if (serversBuilder_ == null) {
                servers_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000008);
            } else {
                serversBuilder_.clear();
            }
            return this;
        }

        public Builder clone() {
            return create().mergeFrom(buildPartial());
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return internal_static_raft_GetConfigurationResponse_descriptor;
        }

        public GetConfigurationResponse getDefaultInstanceForType() {
            return GetConfigurationResponse.getDefaultInstance();
        }

        public GetConfigurationResponse build() {
            GetConfigurationResponse result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public GetConfigurationResponse buildPartial() {
            GetConfigurationResponse result = new GetConfigurationResponse(this);
            int from_bitField0_ = bitField0_;
            int to_bitField0_ = 0;
            if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                to_bitField0_ |= 0x00000001;
            }
            result.resCode_ = resCode_;
            if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                to_bitField0_ |= 0x00000002;
            }
            result.resMsg_ = resMsg_;
            if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                to_bitField0_ |= 0x00000004;
            }
            if (leaderBuilder_ == null) {
                result.leader_ = leader_;
            } else {
                result.leader_ = leaderBuilder_.build();
            }
            if (serversBuilder_ == null) {
                if (((bitField0_ & 0x00000008) == 0x00000008)) {
                    servers_ = java.util.Collections.unmodifiableList(servers_);
                    bitField0_ = (bitField0_ & ~0x00000008);
                }
                result.servers_ = servers_;
            } else {
                result.servers_ = serversBuilder_.build();
            }
            result.bitField0_ = to_bitField0_;
            onBuilt();
            return result;
        }

        public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof GetConfigurationResponse) {
                return mergeFrom((GetConfigurationResponse)other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(GetConfigurationResponse other) {
            if (other == GetConfigurationResponse.getDefaultInstance()) return this;
            if (other.hasResCode()) {
                setResCode(other.getResCode());
            }
            if (other.hasResMsg()) {
                bitField0_ |= 0x00000002;
                resMsg_ = other.resMsg_;
                onChanged();
            }
            if (other.hasLeader()) {
                mergeLeader(other.getLeader());
            }
            if (serversBuilder_ == null) {
                if (!other.servers_.isEmpty()) {
                    if (servers_.isEmpty()) {
                        servers_ = other.servers_;
                        bitField0_ = (bitField0_ & ~0x00000008);
                    } else {
                        ensureServersIsMutable();
                        servers_.addAll(other.servers_);
                    }
                    onChanged();
                }
            } else {
                if (!other.servers_.isEmpty()) {
                    if (serversBuilder_.isEmpty()) {
                        serversBuilder_.dispose();
                        serversBuilder_ = null;
                        servers_ = other.servers_;
                        bitField0_ = (bitField0_ & ~0x00000008);
                        serversBuilder_ =
                                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                                        getServersFieldBuilder() : null;
                    } else {
                        serversBuilder_.addAllMessages(other.servers_);
                    }
                }
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
            GetConfigurationResponse parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (GetConfigurationResponse) e.getUnfinishedMessage();
                throw e;
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }
        private int bitField0_;

        // optional .raft.ResCode res_code = 1;
        private ResCode resCode_ = ResCode.RES_CODE_SUCCESS;
        /**
         * <code>optional .raft.ResCode res_code = 1;</code>
         */
        public boolean hasResCode() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional .raft.ResCode res_code = 1;</code>
         */
        public ResCode getResCode() {
            return resCode_;
        }
        /**
         * <code>optional .raft.ResCode res_code = 1;</code>
         */
        public Builder setResCode(ResCode value) {
            if (value == null) {
                throw new NullPointerException();
            }
            bitField0_ |= 0x00000001;
            resCode_ = value;
            onChanged();
            return this;
        }
        /**
         * <code>optional .raft.ResCode res_code = 1;</code>
         */
        public Builder clearResCode() {
            bitField0_ = (bitField0_ & ~0x00000001);
            resCode_ = ResCode.RES_CODE_SUCCESS;
            onChanged();
            return this;
        }

        // optional string res_msg = 2;
        private java.lang.Object resMsg_ = "";
        /**
         * <code>optional string res_msg = 2;</code>
         */
        public boolean hasResMsg() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional string res_msg = 2;</code>
         */
        public java.lang.String getResMsg() {
            java.lang.Object ref = resMsg_;
            if (!(ref instanceof java.lang.String)) {
                java.lang.String s = ((com.google.protobuf.ByteString) ref)
                        .toStringUtf8();
                resMsg_ = s;
                return s;
            } else {
                return (java.lang.String) ref;
            }
        }
        /**
         * <code>optional string res_msg = 2;</code>
         */
        public com.google.protobuf.ByteString
        getResMsgBytes() {
            java.lang.Object ref = resMsg_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                resMsg_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }
        /**
         * <code>optional string res_msg = 2;</code>
         */
        public Builder setResMsg(
                java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            bitField0_ |= 0x00000002;
            resMsg_ = value;
            onChanged();
            return this;
        }
        /**
         * <code>optional string res_msg = 2;</code>
         */
        public Builder clearResMsg() {
            bitField0_ = (bitField0_ & ~0x00000002);
            resMsg_ = getDefaultInstance().getResMsg();
            onChanged();
            return this;
        }
        /**
         * <code>optional string res_msg = 2;</code>
         */
        public Builder setResMsgBytes(
                com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            bitField0_ |= 0x00000002;
            resMsg_ = value;
            onChanged();
            return this;
        }

        // optional .raft.Server leader = 3;
        private Server leader_ = Server.getDefaultInstance();
        private com.google.protobuf.SingleFieldBuilder<
                Server, Server.Builder, ServerOrBuilder> leaderBuilder_;
        /**
         * <code>optional .raft.Server leader = 3;</code>
         */
        public boolean hasLeader() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <code>optional .raft.Server leader = 3;</code>
         */
        public Server getLeader() {
            if (leaderBuilder_ == null) {
                return leader_;
            } else {
                return leaderBuilder_.getMessage();
            }
        }
        /**
         * <code>optional .raft.Server leader = 3;</code>
         */
        public Builder setLeader(Server value) {
            if (leaderBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                leader_ = value;
                onChanged();
            } else {
                leaderBuilder_.setMessage(value);
            }
            bitField0_ |= 0x00000004;
            return this;
        }
        /**
         * <code>optional .raft.Server leader = 3;</code>
         */
        public Builder setLeader(
                Server.Builder builderForValue) {
            if (leaderBuilder_ == null) {
                leader_ = builderForValue.build();
                onChanged();
            } else {
                leaderBuilder_.setMessage(builderForValue.build());
            }
            bitField0_ |= 0x00000004;
            return this;
        }
        /**
         * <code>optional .raft.Server leader = 3;</code>
         */
        public Builder mergeLeader(Server value) {
            if (leaderBuilder_ == null) {
                if (((bitField0_ & 0x00000004) == 0x00000004) &&
                        leader_ != Server.getDefaultInstance()) {
                    leader_ =
                            Server.newBuilder(leader_).mergeFrom(value).buildPartial();
                } else {
                    leader_ = value;
                }
                onChanged();
            } else {
                leaderBuilder_.mergeFrom(value);
            }
            bitField0_ |= 0x00000004;
            return this;
        }
        /**
         * <code>optional .raft.Server leader = 3;</code>
         */
        public Builder clearLeader() {
            if (leaderBuilder_ == null) {
                leader_ = Server.getDefaultInstance();
                onChanged();
            } else {
                leaderBuilder_.clear();
            }
            bitField0_ = (bitField0_ & ~0x00000004);
            return this;
        }
        /**
         * <code>optional .raft.Server leader = 3;</code>
         */
        public Server.Builder getLeaderBuilder() {
            bitField0_ |= 0x00000004;
            onChanged();
            return getLeaderFieldBuilder().getBuilder();
        }
        /**
         * <code>optional .raft.Server leader = 3;</code>
         */
        public ServerOrBuilder getLeaderOrBuilder() {
            if (leaderBuilder_ != null) {
                return leaderBuilder_.getMessageOrBuilder();
            } else {
                return leader_;
            }
        }
        /**
         * <code>optional .raft.Server leader = 3;</code>
         */
        private com.google.protobuf.SingleFieldBuilder<
                Server, Server.Builder, ServerOrBuilder>
        getLeaderFieldBuilder() {
            if (leaderBuilder_ == null) {
                leaderBuilder_ = new com.google.protobuf.SingleFieldBuilder<
                        Server, Server.Builder, ServerOrBuilder>(
                        leader_,
                        getParentForChildren(),
                        isClean());
                leader_ = null;
            }
            return leaderBuilder_;
        }

        // repeated .raft.Server servers = 4;
        private java.util.List<Server> servers_ =
                java.util.Collections.emptyList();
        private void ensureServersIsMutable() {
            if (!((bitField0_ & 0x00000008) == 0x00000008)) {
                servers_ = new java.util.ArrayList<Server>(servers_);
                bitField0_ |= 0x00000008;
            }
        }

        private com.google.protobuf.RepeatedFieldBuilder<
                Server, Server.Builder, ServerOrBuilder> serversBuilder_;

        /**
         * <code>repeated .raft.Server servers = 4;</code>
         */
        public java.util.List<Server> getServersList() {
            if (serversBuilder_ == null) {
                return java.util.Collections.unmodifiableList(servers_);
            } else {
                return serversBuilder_.getMessageList();
            }
        }
        /**
         * <code>repeated .raft.Server servers = 4;</code>
         */
        public int getServersCount() {
            if (serversBuilder_ == null) {
                return servers_.size();
            } else {
                return serversBuilder_.getCount();
            }
        }
        /**
         * <code>repeated .raft.Server servers = 4;</code>
         */
        public Server getServers(int index) {
            if (serversBuilder_ == null) {
                return servers_.get(index);
            } else {
                return serversBuilder_.getMessage(index);
            }
        }
        /**
         * <code>repeated .raft.Server servers = 4;</code>
         */
        public Builder setServers(
                int index, Server value) {
            if (serversBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureServersIsMutable();
                servers_.set(index, value);
                onChanged();
            } else {
                serversBuilder_.setMessage(index, value);
            }
            return this;
        }
        /**
         * <code>repeated .raft.Server servers = 4;</code>
         */
        public Builder setServers(
                int index, Server.Builder builderForValue) {
            if (serversBuilder_ == null) {
                ensureServersIsMutable();
                servers_.set(index, builderForValue.build());
                onChanged();
            } else {
                serversBuilder_.setMessage(index, builderForValue.build());
            }
            return this;
        }
        /**
         * <code>repeated .raft.Server servers = 4;</code>
         */
        public Builder addServers(Server value) {
            if (serversBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureServersIsMutable();
                servers_.add(value);
                onChanged();
            } else {
                serversBuilder_.addMessage(value);
            }
            return this;
        }
        /**
         * <code>repeated .raft.Server servers = 4;</code>
         */
        public Builder addServers(
                int index, Server value) {
            if (serversBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureServersIsMutable();
                servers_.add(index, value);
                onChanged();
            } else {
                serversBuilder_.addMessage(index, value);
            }
            return this;
        }
        /**
         * <code>repeated .raft.Server servers = 4;</code>
         */
        public Builder addServers(
                Server.Builder builderForValue) {
            if (serversBuilder_ == null) {
                ensureServersIsMutable();
                servers_.add(builderForValue.build());
                onChanged();
            } else {
                serversBuilder_.addMessage(builderForValue.build());
            }
            return this;
        }
        /**
         * <code>repeated .raft.Server servers = 4;</code>
         */
        public Builder addServers(
                int index, Server.Builder builderForValue) {
            if (serversBuilder_ == null) {
                ensureServersIsMutable();
                servers_.add(index, builderForValue.build());
                onChanged();
            } else {
                serversBuilder_.addMessage(index, builderForValue.build());
            }
            return this;
        }
        /**
         * <code>repeated .raft.Server servers = 4;</code>
         */
        public Builder addAllServers(
                java.lang.Iterable<? extends Server> values) {
            if (serversBuilder_ == null) {
                ensureServersIsMutable();
                super.addAll(values, servers_);
                onChanged();
            } else {
                serversBuilder_.addAllMessages(values);
            }
            return this;
        }
        /**
         * <code>repeated .raft.Server servers = 4;</code>
         */
        public Builder clearServers() {
            if (serversBuilder_ == null) {
                servers_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000008);
                onChanged();
            } else {
                serversBuilder_.clear();
            }
            return this;
        }
        /**
         * <code>repeated .raft.Server servers = 4;</code>
         */
        public Builder removeServers(int index) {
            if (serversBuilder_ == null) {
                ensureServersIsMutable();
                servers_.remove(index);
                onChanged();
            } else {
                serversBuilder_.remove(index);
            }
            return this;
        }
        /**
         * <code>repeated .raft.Server servers = 4;</code>
         */
        public Server.Builder getServersBuilder(
                int index) {
            return getServersFieldBuilder().getBuilder(index);
        }
        /**
         * <code>repeated .raft.Server servers = 4;</code>
         */
        public ServerOrBuilder getServersOrBuilder(
                int index) {
            if (serversBuilder_ == null) {
                return servers_.get(index);  } else {
                return serversBuilder_.getMessageOrBuilder(index);
            }
        }
        /**
         * <code>repeated .raft.Server servers = 4;</code>
         */
        public java.util.List<? extends ServerOrBuilder>
        getServersOrBuilderList() {
            if (serversBuilder_ != null) {
                return serversBuilder_.getMessageOrBuilderList();
            } else {
                return java.util.Collections.unmodifiableList(servers_);
            }
        }
        /**
         * <code>repeated .raft.Server servers = 4;</code>
         */
        public Server.Builder addServersBuilder() {
            return getServersFieldBuilder().addBuilder(
                    Server.getDefaultInstance());
        }
        /**
         * <code>repeated .raft.Server servers = 4;</code>
         */
        public Server.Builder addServersBuilder(
                int index) {
            return getServersFieldBuilder().addBuilder(
                    index, Server.getDefaultInstance());
        }
        /**
         * <code>repeated .raft.Server servers = 4;</code>
         */
        public java.util.List<Server.Builder>
        getServersBuilderList() {
            return getServersFieldBuilder().getBuilderList();
        }
        private com.google.protobuf.RepeatedFieldBuilder<
                Server, Server.Builder, ServerOrBuilder>
        getServersFieldBuilder() {
            if (serversBuilder_ == null) {
                serversBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
                        Server, Server.Builder, ServerOrBuilder>(
                        servers_,
                        ((bitField0_ & 0x00000008) == 0x00000008),
                        getParentForChildren(),
                        isClean());
                servers_ = null;
            }
            return serversBuilder_;
        }

        // @@protoc_insertion_point(builder_scope:raft.GetConfigurationResponse)
    }

    static {
        defaultInstance = new GetConfigurationResponse(true);
        defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:raft.GetConfigurationResponse)
}
