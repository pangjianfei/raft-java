package com.github.wenweihu86.raft.proto;

import com.github.wenweihu86.raft.proto.builder.LogMetaDataOrBuilder;

import static com.github.wenweihu86.raft.proto.RaftProto.internal_static_raft_LogMetaData_descriptor;
import static com.github.wenweihu86.raft.proto.RaftProto.internal_static_raft_LogMetaData_fieldAccessorTable;

/**
 * Protobuf type {@code raft.LogMetaData}
 */
public final class LogMetaData extends
        com.google.protobuf.GeneratedMessage
        implements LogMetaDataOrBuilder {
    // Use LogMetaData.newBuilder() to construct.
    private LogMetaData(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
        super(builder);
        this.unknownFields = builder.getUnknownFields();
    }
    private LogMetaData(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final LogMetaData defaultInstance;
    public static LogMetaData getDefaultInstance() {
        return defaultInstance;
    }

    public LogMetaData getDefaultInstanceForType() {
        return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return this.unknownFields;
    }
    private LogMetaData(
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
                        currentTerm_ = input.readUInt64();
                        break;
                    }
                    case 16: {
                        bitField0_ |= 0x00000002;
                        votedFor_ = input.readUInt32();
                        break;
                    }
                    case 24: {
                        bitField0_ |= 0x00000004;
                        firstLogIndex_ = input.readUInt64();
                        break;
                    }
                    case 32: {
                        bitField0_ |= 0x00000008;
                        commitIndex_ = input.readUInt64();
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
        return internal_static_raft_LogMetaData_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return internal_static_raft_LogMetaData_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        LogMetaData.class, LogMetaData.Builder.class);
    }

    public static com.google.protobuf.Parser<LogMetaData> PARSER =
            new com.google.protobuf.AbstractParser<LogMetaData>() {
                public LogMetaData parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new LogMetaData(input, extensionRegistry);
                }
            };

    @java.lang.Override
    public com.google.protobuf.Parser<LogMetaData> getParserForType() {
        return PARSER;
    }

    private int bitField0_;
    // optional uint64 current_term = 1;
    public static final int CURRENT_TERM_FIELD_NUMBER = 1;
    private long currentTerm_;
    /**
     * <code>optional uint64 current_term = 1;</code>
     */
    public boolean hasCurrentTerm() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional uint64 current_term = 1;</code>
     */
    public long getCurrentTerm() {
        return currentTerm_;
    }

    // optional uint32 voted_for = 2;
    public static final int VOTED_FOR_FIELD_NUMBER = 2;
    private int votedFor_;
    /**
     * <code>optional uint32 voted_for = 2;</code>
     */
    public boolean hasVotedFor() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional uint32 voted_for = 2;</code>
     */
    public int getVotedFor() {
        return votedFor_;
    }

    // optional uint64 first_log_index = 3;
    public static final int FIRST_LOG_INDEX_FIELD_NUMBER = 3;
    private long firstLogIndex_;
    /**
     * <code>optional uint64 first_log_index = 3;</code>
     */
    public boolean hasFirstLogIndex() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional uint64 first_log_index = 3;</code>
     */
    public long getFirstLogIndex() {
        return firstLogIndex_;
    }

    // optional uint64 commit_index = 4;
    public static final int COMMIT_INDEX_FIELD_NUMBER = 4;
    private long commitIndex_;
    /**
     * <code>optional uint64 commit_index = 4;</code>
     */
    public boolean hasCommitIndex() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional uint64 commit_index = 4;</code>
     */
    public long getCommitIndex() {
        return commitIndex_;
    }

    private void initFields() {
        currentTerm_ = 0L;
        votedFor_ = 0;
        firstLogIndex_ = 0L;
        commitIndex_ = 0L;
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
            output.writeUInt64(1, currentTerm_);
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
            output.writeUInt32(2, votedFor_);
        }
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
            output.writeUInt64(3, firstLogIndex_);
        }
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
            output.writeUInt64(4, commitIndex_);
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
                    .computeUInt64Size(1, currentTerm_);
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
            size += com.google.protobuf.CodedOutputStream
                    .computeUInt32Size(2, votedFor_);
        }
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
            size += com.google.protobuf.CodedOutputStream
                    .computeUInt64Size(3, firstLogIndex_);
        }
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
            size += com.google.protobuf.CodedOutputStream
                    .computeUInt64Size(4, commitIndex_);
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

    public static LogMetaData parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }
    public static LogMetaData parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }
    public static LogMetaData parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }
    public static LogMetaData parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }
    public static LogMetaData parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return PARSER.parseFrom(input);
    }
    public static LogMetaData parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
    }
    public static LogMetaData parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input);
    }
    public static LogMetaData parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static LogMetaData parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return PARSER.parseFrom(input);
    }
    public static LogMetaData parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(LogMetaData prototype) {
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
     * Protobuf type {@code raft.LogMetaData}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessage.Builder<Builder>
            implements LogMetaDataOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return internal_static_raft_LogMetaData_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return internal_static_raft_LogMetaData_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            LogMetaData.class, LogMetaData.Builder.class);
        }

        // Construct using LogMetaData.newBuilder()
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
            currentTerm_ = 0L;
            bitField0_ = (bitField0_ & ~0x00000001);
            votedFor_ = 0;
            bitField0_ = (bitField0_ & ~0x00000002);
            firstLogIndex_ = 0L;
            bitField0_ = (bitField0_ & ~0x00000004);
            commitIndex_ = 0L;
            bitField0_ = (bitField0_ & ~0x00000008);
            return this;
        }

        public Builder clone() {
            return create().mergeFrom(buildPartial());
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return internal_static_raft_LogMetaData_descriptor;
        }

        public LogMetaData getDefaultInstanceForType() {
            return LogMetaData.getDefaultInstance();
        }

        public LogMetaData build() {
            LogMetaData result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public LogMetaData buildPartial() {
            LogMetaData result = new LogMetaData(this);
            int from_bitField0_ = bitField0_;
            int to_bitField0_ = 0;
            if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                to_bitField0_ |= 0x00000001;
            }
            result.currentTerm_ = currentTerm_;
            if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                to_bitField0_ |= 0x00000002;
            }
            result.votedFor_ = votedFor_;
            if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                to_bitField0_ |= 0x00000004;
            }
            result.firstLogIndex_ = firstLogIndex_;
            if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                to_bitField0_ |= 0x00000008;
            }
            result.commitIndex_ = commitIndex_;
            result.bitField0_ = to_bitField0_;
            onBuilt();
            return result;
        }

        public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof LogMetaData) {
                return mergeFrom((LogMetaData)other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(LogMetaData other) {
            if (other == LogMetaData.getDefaultInstance()) return this;
            if (other.hasCurrentTerm()) {
                setCurrentTerm(other.getCurrentTerm());
            }
            if (other.hasVotedFor()) {
                setVotedFor(other.getVotedFor());
            }
            if (other.hasFirstLogIndex()) {
                setFirstLogIndex(other.getFirstLogIndex());
            }
            if (other.hasCommitIndex()) {
                setCommitIndex(other.getCommitIndex());
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
            LogMetaData parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (LogMetaData) e.getUnfinishedMessage();
                throw e;
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }
        private int bitField0_;

        // optional uint64 current_term = 1;
        private long currentTerm_ ;
        /**
         * <code>optional uint64 current_term = 1;</code>
         */
        public boolean hasCurrentTerm() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional uint64 current_term = 1;</code>
         */
        public long getCurrentTerm() {
            return currentTerm_;
        }
        /**
         * <code>optional uint64 current_term = 1;</code>
         */
        public Builder setCurrentTerm(long value) {
            bitField0_ |= 0x00000001;
            currentTerm_ = value;
            onChanged();
            return this;
        }
        /**
         * <code>optional uint64 current_term = 1;</code>
         */
        public Builder clearCurrentTerm() {
            bitField0_ = (bitField0_ & ~0x00000001);
            currentTerm_ = 0L;
            onChanged();
            return this;
        }

        // optional uint32 voted_for = 2;
        private int votedFor_ ;
        /**
         * <code>optional uint32 voted_for = 2;</code>
         */
        public boolean hasVotedFor() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional uint32 voted_for = 2;</code>
         */
        public int getVotedFor() {
            return votedFor_;
        }
        /**
         * <code>optional uint32 voted_for = 2;</code>
         */
        public Builder setVotedFor(int value) {
            bitField0_ |= 0x00000002;
            votedFor_ = value;
            onChanged();
            return this;
        }
        /**
         * <code>optional uint32 voted_for = 2;</code>
         */
        public Builder clearVotedFor() {
            bitField0_ = (bitField0_ & ~0x00000002);
            votedFor_ = 0;
            onChanged();
            return this;
        }

        // optional uint64 first_log_index = 3;
        private long firstLogIndex_ ;
        /**
         * <code>optional uint64 first_log_index = 3;</code>
         */
        public boolean hasFirstLogIndex() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <code>optional uint64 first_log_index = 3;</code>
         */
        public long getFirstLogIndex() {
            return firstLogIndex_;
        }
        /**
         * <code>optional uint64 first_log_index = 3;</code>
         */
        public Builder setFirstLogIndex(long value) {
            bitField0_ |= 0x00000004;
            firstLogIndex_ = value;
            onChanged();
            return this;
        }
        /**
         * <code>optional uint64 first_log_index = 3;</code>
         */
        public Builder clearFirstLogIndex() {
            bitField0_ = (bitField0_ & ~0x00000004);
            firstLogIndex_ = 0L;
            onChanged();
            return this;
        }

        // optional uint64 commit_index = 4;
        private long commitIndex_ ;
        /**
         * <code>optional uint64 commit_index = 4;</code>
         */
        public boolean hasCommitIndex() {
            return ((bitField0_ & 0x00000008) == 0x00000008);
        }
        /**
         * <code>optional uint64 commit_index = 4;</code>
         */
        public long getCommitIndex() {
            return commitIndex_;
        }
        /**
         * <code>optional uint64 commit_index = 4;</code>
         */
        public Builder setCommitIndex(long value) {
            bitField0_ |= 0x00000008;
            commitIndex_ = value;
            onChanged();
            return this;
        }
        /**
         * <code>optional uint64 commit_index = 4;</code>
         */
        public Builder clearCommitIndex() {
            bitField0_ = (bitField0_ & ~0x00000008);
            commitIndex_ = 0L;
            onChanged();
            return this;
        }

        // @@protoc_insertion_point(builder_scope:raft.LogMetaData)
    }

    static {
        defaultInstance = new LogMetaData(true);
        defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:raft.LogMetaData)
}
