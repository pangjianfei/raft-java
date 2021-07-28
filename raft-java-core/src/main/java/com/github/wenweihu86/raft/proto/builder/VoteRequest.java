package com.github.wenweihu86.raft.proto.builder;

import com.github.wenweihu86.raft.proto.RaftProto;

/**
 * Protobuf type {@code raft.VoteRequest}
 */
public final class VoteRequest extends
        com.google.protobuf.GeneratedMessage
        implements VoteRequestOrBuilder {
    // Use VoteRequest.newBuilder() to construct.
    private VoteRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
        super(builder);
        this.unknownFields = builder.getUnknownFields();
    }
    private VoteRequest(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final VoteRequest defaultInstance;
    public static VoteRequest getDefaultInstance() {
        return defaultInstance;
    }

    public VoteRequest getDefaultInstanceForType() {
        return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return this.unknownFields;
    }
    private VoteRequest(
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
                    case 16: {
                        bitField0_ |= 0x00000002;
                        term_ = input.readUInt64();
                        break;
                    }
                    case 24: {
                        bitField0_ |= 0x00000004;
                        lastLogTerm_ = input.readUInt64();
                        break;
                    }
                    case 32: {
                        bitField0_ |= 0x00000008;
                        lastLogIndex_ = input.readUInt64();
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
        return RaftProto.internal_static_raft_VoteRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return RaftProto.internal_static_raft_VoteRequest_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        VoteRequest.class, VoteRequest.Builder.class);
    }

    public static com.google.protobuf.Parser<VoteRequest> PARSER =
            new com.google.protobuf.AbstractParser<VoteRequest>() {
                public VoteRequest parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new VoteRequest(input, extensionRegistry);
                }
            };

    @java.lang.Override
    public com.google.protobuf.Parser<VoteRequest> getParserForType() {
        return PARSER;
    }

    private int bitField0_;
    // optional uint32 server_id = 1;
    public static final int SERVER_ID_FIELD_NUMBER = 1;
    private int serverId_;
    /**
     * <code>optional uint32 server_id = 1;</code>
     *
     * <pre>
     * 请求选票的候选人的 Id
     * </pre>
     */
    public boolean hasServerId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional uint32 server_id = 1;</code>
     *
     * <pre>
     * 请求选票的候选人的 Id
     * </pre>
     */
    public int getServerId() {
        return serverId_;
    }

    // optional uint64 term = 2;
    public static final int TERM_FIELD_NUMBER = 2;
    private long term_;
    /**
     * <code>optional uint64 term = 2;</code>
     *
     * <pre>
     * 候选人的任期号
     * </pre>
     */
    public boolean hasTerm() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional uint64 term = 2;</code>
     *
     * <pre>
     * 候选人的任期号
     * </pre>
     */
    public long getTerm() {
        return term_;
    }

    // optional uint64 last_log_term = 3;
    public static final int LAST_LOG_TERM_FIELD_NUMBER = 3;
    private long lastLogTerm_;
    /**
     * <code>optional uint64 last_log_term = 3;</code>
     *
     * <pre>
     * 候选人的最后日志条目的任期号
     * </pre>
     */
    public boolean hasLastLogTerm() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional uint64 last_log_term = 3;</code>
     *
     * <pre>
     * 候选人的最后日志条目的任期号
     * </pre>
     */
    public long getLastLogTerm() {
        return lastLogTerm_;
    }

    // optional uint64 last_log_index = 4;
    public static final int LAST_LOG_INDEX_FIELD_NUMBER = 4;
    private long lastLogIndex_;
    /**
     * <code>optional uint64 last_log_index = 4;</code>
     *
     * <pre>
     * 候选人最后日志条目的索引值
     * </pre>
     */
    public boolean hasLastLogIndex() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional uint64 last_log_index = 4;</code>
     *
     * <pre>
     * 候选人最后日志条目的索引值
     * </pre>
     */
    public long getLastLogIndex() {
        return lastLogIndex_;
    }

    private void initFields() {
        serverId_ = 0;
        term_ = 0L;
        lastLogTerm_ = 0L;
        lastLogIndex_ = 0L;
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
            output.writeUInt64(2, term_);
        }
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
            output.writeUInt64(3, lastLogTerm_);
        }
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
            output.writeUInt64(4, lastLogIndex_);
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
                    .computeUInt64Size(2, term_);
        }
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
            size += com.google.protobuf.CodedOutputStream
                    .computeUInt64Size(3, lastLogTerm_);
        }
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
            size += com.google.protobuf.CodedOutputStream
                    .computeUInt64Size(4, lastLogIndex_);
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

    public static VoteRequest parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }
    public static VoteRequest parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }
    public static VoteRequest parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }
    public static VoteRequest parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }
    public static VoteRequest parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return PARSER.parseFrom(input);
    }
    public static VoteRequest parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
    }
    public static VoteRequest parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input);
    }
    public static VoteRequest parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static VoteRequest parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return PARSER.parseFrom(input);
    }
    public static VoteRequest parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(VoteRequest prototype) {
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
     * Protobuf type {@code raft.VoteRequest}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessage.Builder<Builder>
            implements VoteRequestOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return RaftProto.internal_static_raft_VoteRequest_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return RaftProto.internal_static_raft_VoteRequest_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            VoteRequest.class, VoteRequest.Builder.class);
        }

        // Construct using VoteRequest.newBuilder()
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
            serverId_ = 0;
            bitField0_ = (bitField0_ & ~0x00000001);
            term_ = 0L;
            bitField0_ = (bitField0_ & ~0x00000002);
            lastLogTerm_ = 0L;
            bitField0_ = (bitField0_ & ~0x00000004);
            lastLogIndex_ = 0L;
            bitField0_ = (bitField0_ & ~0x00000008);
            return this;
        }

        public Builder clone() {
            return create().mergeFrom(buildPartial());
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return RaftProto.internal_static_raft_VoteRequest_descriptor;
        }

        public VoteRequest getDefaultInstanceForType() {
            return VoteRequest.getDefaultInstance();
        }

        public VoteRequest build() {
            VoteRequest result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public VoteRequest buildPartial() {
            VoteRequest result = new VoteRequest(this);
            int from_bitField0_ = bitField0_;
            int to_bitField0_ = 0;
            if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                to_bitField0_ |= 0x00000001;
            }
            result.serverId_ = serverId_;
            if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                to_bitField0_ |= 0x00000002;
            }
            result.term_ = term_;
            if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                to_bitField0_ |= 0x00000004;
            }
            result.lastLogTerm_ = lastLogTerm_;
            if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                to_bitField0_ |= 0x00000008;
            }
            result.lastLogIndex_ = lastLogIndex_;
            result.bitField0_ = to_bitField0_;
            onBuilt();
            return result;
        }

        public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof VoteRequest) {
                return mergeFrom((VoteRequest)other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(VoteRequest other) {
            if (other == VoteRequest.getDefaultInstance()) return this;
            if (other.hasServerId()) {
                setServerId(other.getServerId());
            }
            if (other.hasTerm()) {
                setTerm(other.getTerm());
            }
            if (other.hasLastLogTerm()) {
                setLastLogTerm(other.getLastLogTerm());
            }
            if (other.hasLastLogIndex()) {
                setLastLogIndex(other.getLastLogIndex());
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
            VoteRequest parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (VoteRequest) e.getUnfinishedMessage();
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
         *
         * <pre>
         * 请求选票的候选人的 Id
         * </pre>
         */
        public boolean hasServerId() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional uint32 server_id = 1;</code>
         *
         * <pre>
         * 请求选票的候选人的 Id
         * </pre>
         */
        public int getServerId() {
            return serverId_;
        }
        /**
         * <code>optional uint32 server_id = 1;</code>
         *
         * <pre>
         * 请求选票的候选人的 Id
         * </pre>
         */
        public Builder setServerId(int value) {
            bitField0_ |= 0x00000001;
            serverId_ = value;
            onChanged();
            return this;
        }
        /**
         * <code>optional uint32 server_id = 1;</code>
         *
         * <pre>
         * 请求选票的候选人的 Id
         * </pre>
         */
        public Builder clearServerId() {
            bitField0_ = (bitField0_ & ~0x00000001);
            serverId_ = 0;
            onChanged();
            return this;
        }

        // optional uint64 term = 2;
        private long term_ ;
        /**
         * <code>optional uint64 term = 2;</code>
         *
         * <pre>
         * 候选人的任期号
         * </pre>
         */
        public boolean hasTerm() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional uint64 term = 2;</code>
         *
         * <pre>
         * 候选人的任期号
         * </pre>
         */
        public long getTerm() {
            return term_;
        }
        /**
         * <code>optional uint64 term = 2;</code>
         *
         * <pre>
         * 候选人的任期号
         * </pre>
         */
        public Builder setTerm(long value) {
            bitField0_ |= 0x00000002;
            term_ = value;
            onChanged();
            return this;
        }
        /**
         * <code>optional uint64 term = 2;</code>
         *
         * <pre>
         * 候选人的任期号
         * </pre>
         */
        public Builder clearTerm() {
            bitField0_ = (bitField0_ & ~0x00000002);
            term_ = 0L;
            onChanged();
            return this;
        }

        // optional uint64 last_log_term = 3;
        private long lastLogTerm_ ;
        /**
         * <code>optional uint64 last_log_term = 3;</code>
         *
         * <pre>
         * 候选人的最后日志条目的任期号
         * </pre>
         */
        public boolean hasLastLogTerm() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <code>optional uint64 last_log_term = 3;</code>
         *
         * <pre>
         * 候选人的最后日志条目的任期号
         * </pre>
         */
        public long getLastLogTerm() {
            return lastLogTerm_;
        }
        /**
         * <code>optional uint64 last_log_term = 3;</code>
         *
         * <pre>
         * 候选人的最后日志条目的任期号
         * </pre>
         */
        public Builder setLastLogTerm(long value) {
            bitField0_ |= 0x00000004;
            lastLogTerm_ = value;
            onChanged();
            return this;
        }
        /**
         * <code>optional uint64 last_log_term = 3;</code>
         *
         * <pre>
         * 候选人的最后日志条目的任期号
         * </pre>
         */
        public Builder clearLastLogTerm() {
            bitField0_ = (bitField0_ & ~0x00000004);
            lastLogTerm_ = 0L;
            onChanged();
            return this;
        }

        // optional uint64 last_log_index = 4;
        private long lastLogIndex_ ;
        /**
         * <code>optional uint64 last_log_index = 4;</code>
         *
         * <pre>
         * 候选人最后日志条目的索引值
         * </pre>
         */
        public boolean hasLastLogIndex() {
            return ((bitField0_ & 0x00000008) == 0x00000008);
        }
        /**
         * <code>optional uint64 last_log_index = 4;</code>
         *
         * <pre>
         * 候选人最后日志条目的索引值
         * </pre>
         */
        public long getLastLogIndex() {
            return lastLogIndex_;
        }
        /**
         * <code>optional uint64 last_log_index = 4;</code>
         *
         * <pre>
         * 候选人最后日志条目的索引值
         * </pre>
         */
        public Builder setLastLogIndex(long value) {
            bitField0_ |= 0x00000008;
            lastLogIndex_ = value;
            onChanged();
            return this;
        }
        /**
         * <code>optional uint64 last_log_index = 4;</code>
         *
         * <pre>
         * 候选人最后日志条目的索引值
         * </pre>
         */
        public Builder clearLastLogIndex() {
            bitField0_ = (bitField0_ & ~0x00000008);
            lastLogIndex_ = 0L;
            onChanged();
            return this;
        }

        // @@protoc_insertion_point(builder_scope:raft.VoteRequest)
    }

    static {
        defaultInstance = new VoteRequest(true);
        defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:raft.VoteRequest)
}
