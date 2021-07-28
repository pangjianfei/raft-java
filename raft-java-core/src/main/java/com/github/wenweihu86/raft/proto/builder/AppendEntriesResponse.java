package com.github.wenweihu86.raft.proto.builder;

import com.github.wenweihu86.raft.proto.RaftProto;
import com.github.wenweihu86.raft.proto.base.ResCode;

import static com.github.wenweihu86.raft.proto.RaftProto.internal_static_raft_AppendEntriesResponse_descriptor;
import static com.github.wenweihu86.raft.proto.RaftProto.internal_static_raft_AppendEntriesResponse_fieldAccessorTable;

/**
 * Protobuf type {@code raft.AppendEntriesResponse}
 */
public final class AppendEntriesResponse extends
        com.google.protobuf.GeneratedMessage
        implements AppendEntriesResponseOrBuilder {
    // Use AppendEntriesResponse.newBuilder() to construct.
    private AppendEntriesResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
        super(builder);
        this.unknownFields = builder.getUnknownFields();
    }
    private AppendEntriesResponse(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final AppendEntriesResponse defaultInstance;
    public static AppendEntriesResponse getDefaultInstance() {
        return defaultInstance;
    }

    public AppendEntriesResponse getDefaultInstanceForType() {
        return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return this.unknownFields;
    }
    private AppendEntriesResponse(
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
                    case 16: {
                        bitField0_ |= 0x00000002;
                        term_ = input.readUInt64();
                        break;
                    }
                    case 24: {
                        bitField0_ |= 0x00000004;
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
        return internal_static_raft_AppendEntriesResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return internal_static_raft_AppendEntriesResponse_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        AppendEntriesResponse.class, AppendEntriesResponse.Builder.class);
    }

    public static com.google.protobuf.Parser<AppendEntriesResponse> PARSER =
            new com.google.protobuf.AbstractParser<AppendEntriesResponse>() {
                public AppendEntriesResponse parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new AppendEntriesResponse(input, extensionRegistry);
                }
            };

    @java.lang.Override
    public com.google.protobuf.Parser<AppendEntriesResponse> getParserForType() {
        return PARSER;
    }

    private int bitField0_;
    // optional .raft.ResCode res_code = 1;
    public static final int RES_CODE_FIELD_NUMBER = 1;
    private ResCode resCode_;
    /**
     * <code>optional .raft.ResCode res_code = 1;</code>
     *
     * <pre>
     * 跟随者包含了匹配上 prevLogIndex 和 prevLogTerm 的日志时为真
     * </pre>
     */
    public boolean hasResCode() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional .raft.ResCode res_code = 1;</code>
     *
     * <pre>
     * 跟随者包含了匹配上 prevLogIndex 和 prevLogTerm 的日志时为真
     * </pre>
     */
    public ResCode getResCode() {
        return resCode_;
    }

    // optional uint64 term = 2;
    public static final int TERM_FIELD_NUMBER = 2;
    private long term_;
    /**
     * <code>optional uint64 term = 2;</code>
     *
     * <pre>
     * 当前的任期号，用于领导人去更新自己
     * </pre>
     */
    public boolean hasTerm() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional uint64 term = 2;</code>
     *
     * <pre>
     * 当前的任期号，用于领导人去更新自己
     * </pre>
     */
    public long getTerm() {
        return term_;
    }

    // optional uint64 last_log_index = 3;
    public static final int LAST_LOG_INDEX_FIELD_NUMBER = 3;
    private long lastLogIndex_;
    /**
     * <code>optional uint64 last_log_index = 3;</code>
     */
    public boolean hasLastLogIndex() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional uint64 last_log_index = 3;</code>
     */
    public long getLastLogIndex() {
        return lastLogIndex_;
    }

    private void initFields() {
        resCode_ = ResCode.RES_CODE_SUCCESS;
        term_ = 0L;
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
            output.writeEnum(1, resCode_.getNumber());
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
            output.writeUInt64(2, term_);
        }
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
            output.writeUInt64(3, lastLogIndex_);
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
                    .computeUInt64Size(2, term_);
        }
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
            size += com.google.protobuf.CodedOutputStream
                    .computeUInt64Size(3, lastLogIndex_);
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

    public static AppendEntriesResponse parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }
    public static AppendEntriesResponse parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AppendEntriesResponse parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }
    public static AppendEntriesResponse parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AppendEntriesResponse parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return PARSER.parseFrom(input);
    }
    public static AppendEntriesResponse parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
    }
    public static AppendEntriesResponse parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input);
    }
    public static AppendEntriesResponse parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static AppendEntriesResponse parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return PARSER.parseFrom(input);
    }
    public static AppendEntriesResponse parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(AppendEntriesResponse prototype) {
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
     * Protobuf type {@code raft.AppendEntriesResponse}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessage.Builder<Builder>
            implements AppendEntriesResponseOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return internal_static_raft_AppendEntriesResponse_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return internal_static_raft_AppendEntriesResponse_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            AppendEntriesResponse.class, AppendEntriesResponse.Builder.class);
        }

        // Construct using AppendEntriesResponse.newBuilder()
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
            resCode_ = ResCode.RES_CODE_SUCCESS;
            bitField0_ = (bitField0_ & ~0x00000001);
            term_ = 0L;
            bitField0_ = (bitField0_ & ~0x00000002);
            lastLogIndex_ = 0L;
            bitField0_ = (bitField0_ & ~0x00000004);
            return this;
        }

        public Builder clone() {
            return create().mergeFrom(buildPartial());
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return internal_static_raft_AppendEntriesResponse_descriptor;
        }

        public AppendEntriesResponse getDefaultInstanceForType() {
            return AppendEntriesResponse.getDefaultInstance();
        }

        public AppendEntriesResponse build() {
            AppendEntriesResponse result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public AppendEntriesResponse buildPartial() {
            AppendEntriesResponse result = new AppendEntriesResponse(this);
            int from_bitField0_ = bitField0_;
            int to_bitField0_ = 0;
            if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                to_bitField0_ |= 0x00000001;
            }
            result.resCode_ = resCode_;
            if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                to_bitField0_ |= 0x00000002;
            }
            result.term_ = term_;
            if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                to_bitField0_ |= 0x00000004;
            }
            result.lastLogIndex_ = lastLogIndex_;
            result.bitField0_ = to_bitField0_;
            onBuilt();
            return result;
        }

        public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof AppendEntriesResponse) {
                return mergeFrom((AppendEntriesResponse)other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(AppendEntriesResponse other) {
            if (other == AppendEntriesResponse.getDefaultInstance()) return this;
            if (other.hasResCode()) {
                setResCode(other.getResCode());
            }
            if (other.hasTerm()) {
                setTerm(other.getTerm());
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
            AppendEntriesResponse parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (AppendEntriesResponse) e.getUnfinishedMessage();
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
         *
         * <pre>
         * 跟随者包含了匹配上 prevLogIndex 和 prevLogTerm 的日志时为真
         * </pre>
         */
        public boolean hasResCode() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional .raft.ResCode res_code = 1;</code>
         *
         * <pre>
         * 跟随者包含了匹配上 prevLogIndex 和 prevLogTerm 的日志时为真
         * </pre>
         */
        public ResCode getResCode() {
            return resCode_;
        }
        /**
         * <code>optional .raft.ResCode res_code = 1;</code>
         *
         * <pre>
         * 跟随者包含了匹配上 prevLogIndex 和 prevLogTerm 的日志时为真
         * </pre>
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
         *
         * <pre>
         * 跟随者包含了匹配上 prevLogIndex 和 prevLogTerm 的日志时为真
         * </pre>
         */
        public Builder clearResCode() {
            bitField0_ = (bitField0_ & ~0x00000001);
            resCode_ = ResCode.RES_CODE_SUCCESS;
            onChanged();
            return this;
        }

        // optional uint64 term = 2;
        private long term_ ;
        /**
         * <code>optional uint64 term = 2;</code>
         *
         * <pre>
         * 当前的任期号，用于领导人去更新自己
         * </pre>
         */
        public boolean hasTerm() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional uint64 term = 2;</code>
         *
         * <pre>
         * 当前的任期号，用于领导人去更新自己
         * </pre>
         */
        public long getTerm() {
            return term_;
        }
        /**
         * <code>optional uint64 term = 2;</code>
         *
         * <pre>
         * 当前的任期号，用于领导人去更新自己
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
         * 当前的任期号，用于领导人去更新自己
         * </pre>
         */
        public Builder clearTerm() {
            bitField0_ = (bitField0_ & ~0x00000002);
            term_ = 0L;
            onChanged();
            return this;
        }

        // optional uint64 last_log_index = 3;
        private long lastLogIndex_ ;
        /**
         * <code>optional uint64 last_log_index = 3;</code>
         */
        public boolean hasLastLogIndex() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <code>optional uint64 last_log_index = 3;</code>
         */
        public long getLastLogIndex() {
            return lastLogIndex_;
        }
        /**
         * <code>optional uint64 last_log_index = 3;</code>
         */
        public Builder setLastLogIndex(long value) {
            bitField0_ |= 0x00000004;
            lastLogIndex_ = value;
            onChanged();
            return this;
        }
        /**
         * <code>optional uint64 last_log_index = 3;</code>
         */
        public Builder clearLastLogIndex() {
            bitField0_ = (bitField0_ & ~0x00000004);
            lastLogIndex_ = 0L;
            onChanged();
            return this;
        }

        // @@protoc_insertion_point(builder_scope:raft.AppendEntriesResponse)
    }

    static {
        defaultInstance = new AppendEntriesResponse(true);
        defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:raft.AppendEntriesResponse)
}
