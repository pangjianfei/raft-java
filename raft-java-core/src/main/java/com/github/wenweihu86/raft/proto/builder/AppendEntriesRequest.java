package com.github.wenweihu86.raft.proto.builder;

import com.github.wenweihu86.raft.proto.RaftProto;

import static com.github.wenweihu86.raft.proto.RaftProto.internal_static_raft_AppendEntriesRequest_descriptor;
import static com.github.wenweihu86.raft.proto.RaftProto.internal_static_raft_AppendEntriesRequest_fieldAccessorTable;

/**
 * Protobuf type {@code raft.AppendEntriesRequest}
 */
public final class AppendEntriesRequest extends
        com.google.protobuf.GeneratedMessage
        implements AppendEntriesRequestOrBuilder {
    // Use AppendEntriesRequest.newBuilder() to construct.
    private AppendEntriesRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
        super(builder);
        this.unknownFields = builder.getUnknownFields();
    }
    private AppendEntriesRequest(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final AppendEntriesRequest defaultInstance;
    public static AppendEntriesRequest getDefaultInstance() {
        return defaultInstance;
    }

    public AppendEntriesRequest getDefaultInstanceForType() {
        return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return this.unknownFields;
    }
    private AppendEntriesRequest(
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
                        prevLogIndex_ = input.readUInt64();
                        break;
                    }
                    case 32: {
                        bitField0_ |= 0x00000008;
                        prevLogTerm_ = input.readUInt64();
                        break;
                    }
                    case 40: {
                        bitField0_ |= 0x00000010;
                        commitIndex_ = input.readUInt64();
                        break;
                    }
                    case 50: {
                        if (!((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
                            entries_ = new java.util.ArrayList<LogEntry>();
                            mutable_bitField0_ |= 0x00000020;
                        }
                        entries_.add(input.readMessage(LogEntry.PARSER, extensionRegistry));
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
            if (((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
                entries_ = java.util.Collections.unmodifiableList(entries_);
            }
            this.unknownFields = unknownFields.build();
            makeExtensionsImmutable();
        }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
        return internal_static_raft_AppendEntriesRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return internal_static_raft_AppendEntriesRequest_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        AppendEntriesRequest.class, AppendEntriesRequest.Builder.class);
    }

    public static com.google.protobuf.Parser<AppendEntriesRequest> PARSER =
            new com.google.protobuf.AbstractParser<AppendEntriesRequest>() {
                public AppendEntriesRequest parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new AppendEntriesRequest(input, extensionRegistry);
                }
            };

    @java.lang.Override
    public com.google.protobuf.Parser<AppendEntriesRequest> getParserForType() {
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
     * 领导人的Id
     * </pre>
     */
    public boolean hasServerId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional uint32 server_id = 1;</code>
     *
     * <pre>
     * 领导人的Id
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
     * 领导人的任期号
     * </pre>
     */
    public boolean hasTerm() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional uint64 term = 2;</code>
     *
     * <pre>
     * 领导人的任期号
     * </pre>
     */
    public long getTerm() {
        return term_;
    }

    // optional uint64 prev_log_index = 3;
    public static final int PREV_LOG_INDEX_FIELD_NUMBER = 3;
    private long prevLogIndex_;
    /**
     * <code>optional uint64 prev_log_index = 3;</code>
     *
     * <pre>
     * 新的日志条目紧随之前的索引值
     * </pre>
     */
    public boolean hasPrevLogIndex() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional uint64 prev_log_index = 3;</code>
     *
     * <pre>
     * 新的日志条目紧随之前的索引值
     * </pre>
     */
    public long getPrevLogIndex() {
        return prevLogIndex_;
    }

    // optional uint64 prev_log_term = 4;
    public static final int PREV_LOG_TERM_FIELD_NUMBER = 4;
    private long prevLogTerm_;
    /**
     * <code>optional uint64 prev_log_term = 4;</code>
     *
     * <pre>
     * prev_log_index条目的任期号
     * </pre>
     */
    public boolean hasPrevLogTerm() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional uint64 prev_log_term = 4;</code>
     *
     * <pre>
     * prev_log_index条目的任期号
     * </pre>
     */
    public long getPrevLogTerm() {
        return prevLogTerm_;
    }

    // optional uint64 commit_index = 5;
    public static final int COMMIT_INDEX_FIELD_NUMBER = 5;
    private long commitIndex_;
    /**
     * <code>optional uint64 commit_index = 5;</code>
     *
     * <pre>
     * 领导人已经提交的日志的索引值
     * </pre>
     */
    public boolean hasCommitIndex() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional uint64 commit_index = 5;</code>
     *
     * <pre>
     * 领导人已经提交的日志的索引值
     * </pre>
     */
    public long getCommitIndex() {
        return commitIndex_;
    }

    // repeated .raft.LogEntry entries = 6;
    public static final int ENTRIES_FIELD_NUMBER = 6;
    private java.util.List<LogEntry> entries_;
    /**
     * <code>repeated .raft.LogEntry entries = 6;</code>
     *
     * <pre>
     * 准备存储的日志条目（表示心跳时为空）
     * </pre>
     */
    public java.util.List<LogEntry> getEntriesList() {
        return entries_;
    }
    /**
     * <code>repeated .raft.LogEntry entries = 6;</code>
     *
     * <pre>
     * 准备存储的日志条目（表示心跳时为空）
     * </pre>
     */
    public java.util.List<? extends LogEntryOrBuilder>
    getEntriesOrBuilderList() {
        return entries_;
    }
    /**
     * <code>repeated .raft.LogEntry entries = 6;</code>
     *
     * <pre>
     * 准备存储的日志条目（表示心跳时为空）
     * </pre>
     */
    public int getEntriesCount() {
        return entries_.size();
    }
    /**
     * <code>repeated .raft.LogEntry entries = 6;</code>
     *
     * <pre>
     * 准备存储的日志条目（表示心跳时为空）
     * </pre>
     */
    public LogEntry getEntries(int index) {
        return entries_.get(index);
    }
    /**
     * <code>repeated .raft.LogEntry entries = 6;</code>
     *
     * <pre>
     * 准备存储的日志条目（表示心跳时为空）
     * </pre>
     */
    public LogEntryOrBuilder getEntriesOrBuilder(
            int index) {
        return entries_.get(index);
    }

    private void initFields() {
        serverId_ = 0;
        term_ = 0L;
        prevLogIndex_ = 0L;
        prevLogTerm_ = 0L;
        commitIndex_ = 0L;
        entries_ = java.util.Collections.emptyList();
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
            output.writeUInt64(3, prevLogIndex_);
        }
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
            output.writeUInt64(4, prevLogTerm_);
        }
        if (((bitField0_ & 0x00000010) == 0x00000010)) {
            output.writeUInt64(5, commitIndex_);
        }
        for (int i = 0; i < entries_.size(); i++) {
            output.writeMessage(6, entries_.get(i));
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
                    .computeUInt64Size(3, prevLogIndex_);
        }
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
            size += com.google.protobuf.CodedOutputStream
                    .computeUInt64Size(4, prevLogTerm_);
        }
        if (((bitField0_ & 0x00000010) == 0x00000010)) {
            size += com.google.protobuf.CodedOutputStream
                    .computeUInt64Size(5, commitIndex_);
        }
        for (int i = 0; i < entries_.size(); i++) {
            size += com.google.protobuf.CodedOutputStream
                    .computeMessageSize(6, entries_.get(i));
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

    public static AppendEntriesRequest parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }
    public static AppendEntriesRequest parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AppendEntriesRequest parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }
    public static AppendEntriesRequest parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AppendEntriesRequest parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return PARSER.parseFrom(input);
    }
    public static AppendEntriesRequest parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
    }
    public static AppendEntriesRequest parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input);
    }
    public static AppendEntriesRequest parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static AppendEntriesRequest parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return PARSER.parseFrom(input);
    }
    public static AppendEntriesRequest parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(AppendEntriesRequest prototype) {
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
     * Protobuf type {@code raft.AppendEntriesRequest}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessage.Builder<Builder>
            implements AppendEntriesRequestOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return internal_static_raft_AppendEntriesRequest_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return internal_static_raft_AppendEntriesRequest_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            AppendEntriesRequest.class, AppendEntriesRequest.Builder.class);
        }

        // Construct using AppendEntriesRequest.newBuilder()
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
                getEntriesFieldBuilder();
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
            prevLogIndex_ = 0L;
            bitField0_ = (bitField0_ & ~0x00000004);
            prevLogTerm_ = 0L;
            bitField0_ = (bitField0_ & ~0x00000008);
            commitIndex_ = 0L;
            bitField0_ = (bitField0_ & ~0x00000010);
            if (entriesBuilder_ == null) {
                entries_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000020);
            } else {
                entriesBuilder_.clear();
            }
            return this;
        }

        public Builder clone() {
            return create().mergeFrom(buildPartial());
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return internal_static_raft_AppendEntriesRequest_descriptor;
        }

        public AppendEntriesRequest getDefaultInstanceForType() {
            return AppendEntriesRequest.getDefaultInstance();
        }

        public AppendEntriesRequest build() {
            AppendEntriesRequest result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public AppendEntriesRequest buildPartial() {
            AppendEntriesRequest result = new AppendEntriesRequest(this);
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
            result.prevLogIndex_ = prevLogIndex_;
            if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                to_bitField0_ |= 0x00000008;
            }
            result.prevLogTerm_ = prevLogTerm_;
            if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
                to_bitField0_ |= 0x00000010;
            }
            result.commitIndex_ = commitIndex_;
            if (entriesBuilder_ == null) {
                if (((bitField0_ & 0x00000020) == 0x00000020)) {
                    entries_ = java.util.Collections.unmodifiableList(entries_);
                    bitField0_ = (bitField0_ & ~0x00000020);
                }
                result.entries_ = entries_;
            } else {
                result.entries_ = entriesBuilder_.build();
            }
            result.bitField0_ = to_bitField0_;
            onBuilt();
            return result;
        }

        public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof AppendEntriesRequest) {
                return mergeFrom((AppendEntriesRequest)other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(AppendEntriesRequest other) {
            if (other == AppendEntriesRequest.getDefaultInstance()) return this;
            if (other.hasServerId()) {
                setServerId(other.getServerId());
            }
            if (other.hasTerm()) {
                setTerm(other.getTerm());
            }
            if (other.hasPrevLogIndex()) {
                setPrevLogIndex(other.getPrevLogIndex());
            }
            if (other.hasPrevLogTerm()) {
                setPrevLogTerm(other.getPrevLogTerm());
            }
            if (other.hasCommitIndex()) {
                setCommitIndex(other.getCommitIndex());
            }
            if (entriesBuilder_ == null) {
                if (!other.entries_.isEmpty()) {
                    if (entries_.isEmpty()) {
                        entries_ = other.entries_;
                        bitField0_ = (bitField0_ & ~0x00000020);
                    } else {
                        ensureEntriesIsMutable();
                        entries_.addAll(other.entries_);
                    }
                    onChanged();
                }
            } else {
                if (!other.entries_.isEmpty()) {
                    if (entriesBuilder_.isEmpty()) {
                        entriesBuilder_.dispose();
                        entriesBuilder_ = null;
                        entries_ = other.entries_;
                        bitField0_ = (bitField0_ & ~0x00000020);
                        entriesBuilder_ =
                                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                                        getEntriesFieldBuilder() : null;
                    } else {
                        entriesBuilder_.addAllMessages(other.entries_);
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
            AppendEntriesRequest parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (AppendEntriesRequest) e.getUnfinishedMessage();
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
         * 领导人的Id
         * </pre>
         */
        public boolean hasServerId() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional uint32 server_id = 1;</code>
         *
         * <pre>
         * 领导人的Id
         * </pre>
         */
        public int getServerId() {
            return serverId_;
        }
        /**
         * <code>optional uint32 server_id = 1;</code>
         *
         * <pre>
         * 领导人的Id
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
         * 领导人的Id
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
         * 领导人的任期号
         * </pre>
         */
        public boolean hasTerm() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional uint64 term = 2;</code>
         *
         * <pre>
         * 领导人的任期号
         * </pre>
         */
        public long getTerm() {
            return term_;
        }
        /**
         * <code>optional uint64 term = 2;</code>
         *
         * <pre>
         * 领导人的任期号
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
         * 领导人的任期号
         * </pre>
         */
        public Builder clearTerm() {
            bitField0_ = (bitField0_ & ~0x00000002);
            term_ = 0L;
            onChanged();
            return this;
        }

        // optional uint64 prev_log_index = 3;
        private long prevLogIndex_ ;
        /**
         * <code>optional uint64 prev_log_index = 3;</code>
         *
         * <pre>
         * 新的日志条目紧随之前的索引值
         * </pre>
         */
        public boolean hasPrevLogIndex() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <code>optional uint64 prev_log_index = 3;</code>
         *
         * <pre>
         * 新的日志条目紧随之前的索引值
         * </pre>
         */
        public long getPrevLogIndex() {
            return prevLogIndex_;
        }
        /**
         * <code>optional uint64 prev_log_index = 3;</code>
         *
         * <pre>
         * 新的日志条目紧随之前的索引值
         * </pre>
         */
        public Builder setPrevLogIndex(long value) {
            bitField0_ |= 0x00000004;
            prevLogIndex_ = value;
            onChanged();
            return this;
        }
        /**
         * <code>optional uint64 prev_log_index = 3;</code>
         *
         * <pre>
         * 新的日志条目紧随之前的索引值
         * </pre>
         */
        public Builder clearPrevLogIndex() {
            bitField0_ = (bitField0_ & ~0x00000004);
            prevLogIndex_ = 0L;
            onChanged();
            return this;
        }

        // optional uint64 prev_log_term = 4;
        private long prevLogTerm_ ;
        /**
         * <code>optional uint64 prev_log_term = 4;</code>
         *
         * <pre>
         * prev_log_index条目的任期号
         * </pre>
         */
        public boolean hasPrevLogTerm() {
            return ((bitField0_ & 0x00000008) == 0x00000008);
        }
        /**
         * <code>optional uint64 prev_log_term = 4;</code>
         *
         * <pre>
         * prev_log_index条目的任期号
         * </pre>
         */
        public long getPrevLogTerm() {
            return prevLogTerm_;
        }
        /**
         * <code>optional uint64 prev_log_term = 4;</code>
         *
         * <pre>
         * prev_log_index条目的任期号
         * </pre>
         */
        public Builder setPrevLogTerm(long value) {
            bitField0_ |= 0x00000008;
            prevLogTerm_ = value;
            onChanged();
            return this;
        }
        /**
         * <code>optional uint64 prev_log_term = 4;</code>
         *
         * <pre>
         * prev_log_index条目的任期号
         * </pre>
         */
        public Builder clearPrevLogTerm() {
            bitField0_ = (bitField0_ & ~0x00000008);
            prevLogTerm_ = 0L;
            onChanged();
            return this;
        }

        // optional uint64 commit_index = 5;
        private long commitIndex_ ;
        /**
         * <code>optional uint64 commit_index = 5;</code>
         *
         * <pre>
         * 领导人已经提交的日志的索引值
         * </pre>
         */
        public boolean hasCommitIndex() {
            return ((bitField0_ & 0x00000010) == 0x00000010);
        }
        /**
         * <code>optional uint64 commit_index = 5;</code>
         *
         * <pre>
         * 领导人已经提交的日志的索引值
         * </pre>
         */
        public long getCommitIndex() {
            return commitIndex_;
        }
        /**
         * <code>optional uint64 commit_index = 5;</code>
         *
         * <pre>
         * 领导人已经提交的日志的索引值
         * </pre>
         */
        public Builder setCommitIndex(long value) {
            bitField0_ |= 0x00000010;
            commitIndex_ = value;
            onChanged();
            return this;
        }
        /**
         * <code>optional uint64 commit_index = 5;</code>
         *
         * <pre>
         * 领导人已经提交的日志的索引值
         * </pre>
         */
        public Builder clearCommitIndex() {
            bitField0_ = (bitField0_ & ~0x00000010);
            commitIndex_ = 0L;
            onChanged();
            return this;
        }

        // repeated .raft.LogEntry entries = 6;
        private java.util.List<LogEntry> entries_ =
                java.util.Collections.emptyList();
        private void ensureEntriesIsMutable() {
            if (!((bitField0_ & 0x00000020) == 0x00000020)) {
                entries_ = new java.util.ArrayList<LogEntry>(entries_);
                bitField0_ |= 0x00000020;
            }
        }

        private com.google.protobuf.RepeatedFieldBuilder<
                LogEntry, LogEntry.Builder, LogEntryOrBuilder> entriesBuilder_;

        /**
         * <code>repeated .raft.LogEntry entries = 6;</code>
         *
         * <pre>
         * 准备存储的日志条目（表示心跳时为空）
         * </pre>
         */
        public java.util.List<LogEntry> getEntriesList() {
            if (entriesBuilder_ == null) {
                return java.util.Collections.unmodifiableList(entries_);
            } else {
                return entriesBuilder_.getMessageList();
            }
        }
        /**
         * <code>repeated .raft.LogEntry entries = 6;</code>
         *
         * <pre>
         * 准备存储的日志条目（表示心跳时为空）
         * </pre>
         */
        public int getEntriesCount() {
            if (entriesBuilder_ == null) {
                return entries_.size();
            } else {
                return entriesBuilder_.getCount();
            }
        }
        /**
         * <code>repeated .raft.LogEntry entries = 6;</code>
         *
         * <pre>
         * 准备存储的日志条目（表示心跳时为空）
         * </pre>
         */
        public LogEntry getEntries(int index) {
            if (entriesBuilder_ == null) {
                return entries_.get(index);
            } else {
                return entriesBuilder_.getMessage(index);
            }
        }
        /**
         * <code>repeated .raft.LogEntry entries = 6;</code>
         *
         * <pre>
         * 准备存储的日志条目（表示心跳时为空）
         * </pre>
         */
        public Builder setEntries(
                int index, LogEntry value) {
            if (entriesBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureEntriesIsMutable();
                entries_.set(index, value);
                onChanged();
            } else {
                entriesBuilder_.setMessage(index, value);
            }
            return this;
        }
        /**
         * <code>repeated .raft.LogEntry entries = 6;</code>
         *
         * <pre>
         * 准备存储的日志条目（表示心跳时为空）
         * </pre>
         */
        public Builder setEntries(
                int index, LogEntry.Builder builderForValue) {
            if (entriesBuilder_ == null) {
                ensureEntriesIsMutable();
                entries_.set(index, builderForValue.build());
                onChanged();
            } else {
                entriesBuilder_.setMessage(index, builderForValue.build());
            }
            return this;
        }
        /**
         * <code>repeated .raft.LogEntry entries = 6;</code>
         *
         * <pre>
         * 准备存储的日志条目（表示心跳时为空）
         * </pre>
         */
        public Builder addEntries(LogEntry value) {
            if (entriesBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureEntriesIsMutable();
                entries_.add(value);
                onChanged();
            } else {
                entriesBuilder_.addMessage(value);
            }
            return this;
        }
        /**
         * <code>repeated .raft.LogEntry entries = 6;</code>
         *
         * <pre>
         * 准备存储的日志条目（表示心跳时为空）
         * </pre>
         */
        public Builder addEntries(
                int index, LogEntry value) {
            if (entriesBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureEntriesIsMutable();
                entries_.add(index, value);
                onChanged();
            } else {
                entriesBuilder_.addMessage(index, value);
            }
            return this;
        }
        /**
         * <code>repeated .raft.LogEntry entries = 6;</code>
         *
         * <pre>
         * 准备存储的日志条目（表示心跳时为空）
         * </pre>
         */
        public Builder addEntries(
                LogEntry.Builder builderForValue) {
            if (entriesBuilder_ == null) {
                ensureEntriesIsMutable();
                entries_.add(builderForValue.build());
                onChanged();
            } else {
                entriesBuilder_.addMessage(builderForValue.build());
            }
            return this;
        }
        /**
         * <code>repeated .raft.LogEntry entries = 6;</code>
         *
         * <pre>
         * 准备存储的日志条目（表示心跳时为空）
         * </pre>
         */
        public Builder addEntries(
                int index, LogEntry.Builder builderForValue) {
            if (entriesBuilder_ == null) {
                ensureEntriesIsMutable();
                entries_.add(index, builderForValue.build());
                onChanged();
            } else {
                entriesBuilder_.addMessage(index, builderForValue.build());
            }
            return this;
        }
        /**
         * <code>repeated .raft.LogEntry entries = 6;</code>
         *
         * <pre>
         * 准备存储的日志条目（表示心跳时为空）
         * </pre>
         */
        public Builder addAllEntries(
                java.lang.Iterable<? extends LogEntry> values) {
            if (entriesBuilder_ == null) {
                ensureEntriesIsMutable();
                super.addAll(values, entries_);
                onChanged();
            } else {
                entriesBuilder_.addAllMessages(values);
            }
            return this;
        }
        /**
         * <code>repeated .raft.LogEntry entries = 6;</code>
         *
         * <pre>
         * 准备存储的日志条目（表示心跳时为空）
         * </pre>
         */
        public Builder clearEntries() {
            if (entriesBuilder_ == null) {
                entries_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000020);
                onChanged();
            } else {
                entriesBuilder_.clear();
            }
            return this;
        }
        /**
         * <code>repeated .raft.LogEntry entries = 6;</code>
         *
         * <pre>
         * 准备存储的日志条目（表示心跳时为空）
         * </pre>
         */
        public Builder removeEntries(int index) {
            if (entriesBuilder_ == null) {
                ensureEntriesIsMutable();
                entries_.remove(index);
                onChanged();
            } else {
                entriesBuilder_.remove(index);
            }
            return this;
        }
        /**
         * <code>repeated .raft.LogEntry entries = 6;</code>
         *
         * <pre>
         * 准备存储的日志条目（表示心跳时为空）
         * </pre>
         */
        public LogEntry.Builder getEntriesBuilder(
                int index) {
            return getEntriesFieldBuilder().getBuilder(index);
        }
        /**
         * <code>repeated .raft.LogEntry entries = 6;</code>
         *
         * <pre>
         * 准备存储的日志条目（表示心跳时为空）
         * </pre>
         */
        public LogEntryOrBuilder getEntriesOrBuilder(
                int index) {
            if (entriesBuilder_ == null) {
                return entries_.get(index);  } else {
                return entriesBuilder_.getMessageOrBuilder(index);
            }
        }
        /**
         * <code>repeated .raft.LogEntry entries = 6;</code>
         *
         * <pre>
         * 准备存储的日志条目（表示心跳时为空）
         * </pre>
         */
        public java.util.List<? extends LogEntryOrBuilder>
        getEntriesOrBuilderList() {
            if (entriesBuilder_ != null) {
                return entriesBuilder_.getMessageOrBuilderList();
            } else {
                return java.util.Collections.unmodifiableList(entries_);
            }
        }
        /**
         * <code>repeated .raft.LogEntry entries = 6;</code>
         *
         * <pre>
         * 准备存储的日志条目（表示心跳时为空）
         * </pre>
         */
        public LogEntry.Builder addEntriesBuilder() {
            return getEntriesFieldBuilder().addBuilder(
                    LogEntry.getDefaultInstance());
        }
        /**
         * <code>repeated .raft.LogEntry entries = 6;</code>
         *
         * <pre>
         * 准备存储的日志条目（表示心跳时为空）
         * </pre>
         */
        public LogEntry.Builder addEntriesBuilder(
                int index) {
            return getEntriesFieldBuilder().addBuilder(
                    index, LogEntry.getDefaultInstance());
        }
        /**
         * <code>repeated .raft.LogEntry entries = 6;</code>
         *
         * <pre>
         * 准备存储的日志条目（表示心跳时为空）
         * </pre>
         */
        public java.util.List<LogEntry.Builder>
        getEntriesBuilderList() {
            return getEntriesFieldBuilder().getBuilderList();
        }
        private com.google.protobuf.RepeatedFieldBuilder<
                LogEntry, LogEntry.Builder, LogEntryOrBuilder>
        getEntriesFieldBuilder() {
            if (entriesBuilder_ == null) {
                entriesBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
                        LogEntry, LogEntry.Builder, LogEntryOrBuilder>(
                        entries_,
                        ((bitField0_ & 0x00000020) == 0x00000020),
                        getParentForChildren(),
                        isClean());
                entries_ = null;
            }
            return entriesBuilder_;
        }

        // @@protoc_insertion_point(builder_scope:raft.AppendEntriesRequest)
    }

    static {
        defaultInstance = new AppendEntriesRequest(true);
        defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:raft.AppendEntriesRequest)
}
