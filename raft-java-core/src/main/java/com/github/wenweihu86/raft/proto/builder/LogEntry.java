package com.github.wenweihu86.raft.proto.builder;

import com.github.wenweihu86.raft.proto.RaftProto;
import com.github.wenweihu86.raft.proto.base.EntryType;

/**
 * Protobuf type {@code raft.LogEntry}
 */
public final class LogEntry extends
        com.google.protobuf.GeneratedMessage
        implements LogEntryOrBuilder {
    // Use LogEntry.newBuilder() to construct.
    private LogEntry(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
        super(builder);
        this.unknownFields = builder.getUnknownFields();
    }
    private LogEntry(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final LogEntry defaultInstance;
    public static LogEntry getDefaultInstance() {
        return defaultInstance;
    }

    public LogEntry getDefaultInstanceForType() {
        return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return this.unknownFields;
    }
    private LogEntry(
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
                        term_ = input.readUInt64();
                        break;
                    }
                    case 16: {
                        bitField0_ |= 0x00000002;
                        index_ = input.readUInt64();
                        break;
                    }
                    case 24: {
                        int rawValue = input.readEnum();
                        EntryType value = EntryType.valueOf(rawValue);
                        if (value == null) {
                            unknownFields.mergeVarintField(3, rawValue);
                        } else {
                            bitField0_ |= 0x00000004;
                            type_ = value;
                        }
                        break;
                    }
                    case 34: {
                        bitField0_ |= 0x00000008;
                        data_ = input.readBytes();
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
        return RaftProto.internal_static_raft_LogEntry_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return RaftProto.internal_static_raft_LogEntry_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        LogEntry.class, LogEntry.Builder.class);
    }

    public static com.google.protobuf.Parser<LogEntry> PARSER =
            new com.google.protobuf.AbstractParser<LogEntry>() {
                public LogEntry parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new LogEntry(input, extensionRegistry);
                }
            };

    @java.lang.Override
    public com.google.protobuf.Parser<LogEntry> getParserForType() {
        return PARSER;
    }

    private int bitField0_;
    // optional uint64 term = 1;
    public static final int TERM_FIELD_NUMBER = 1;
    private long term_;
    /**
     * <code>optional uint64 term = 1;</code>
     */
    public boolean hasTerm() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional uint64 term = 1;</code>
     */
    public long getTerm() {
        return term_;
    }

    // optional uint64 index = 2;
    public static final int INDEX_FIELD_NUMBER = 2;
    private long index_;
    /**
     * <code>optional uint64 index = 2;</code>
     */
    public boolean hasIndex() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional uint64 index = 2;</code>
     */
    public long getIndex() {
        return index_;
    }

    // optional .raft.EntryType type = 3;
    public static final int TYPE_FIELD_NUMBER = 3;
    private EntryType type_;
    /**
     * <code>optional .raft.EntryType type = 3;</code>
     */
    public boolean hasType() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional .raft.EntryType type = 3;</code>
     */
    public EntryType getType() {
        return type_;
    }

    // optional bytes data = 4;
    public static final int DATA_FIELD_NUMBER = 4;
    private com.google.protobuf.ByteString data_;
    /**
     * <code>optional bytes data = 4;</code>
     */
    public boolean hasData() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional bytes data = 4;</code>
     */
    public com.google.protobuf.ByteString getData() {
        return data_;
    }

    private void initFields() {
        term_ = 0L;
        index_ = 0L;
        type_ = EntryType.ENTRY_TYPE_DATA;
        data_ = com.google.protobuf.ByteString.EMPTY;
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
            output.writeUInt64(1, term_);
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
            output.writeUInt64(2, index_);
        }
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
            output.writeEnum(3, type_.getNumber());
        }
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
            output.writeBytes(4, data_);
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
                    .computeUInt64Size(1, term_);
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
            size += com.google.protobuf.CodedOutputStream
                    .computeUInt64Size(2, index_);
        }
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
            size += com.google.protobuf.CodedOutputStream
                    .computeEnumSize(3, type_.getNumber());
        }
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
            size += com.google.protobuf.CodedOutputStream
                    .computeBytesSize(4, data_);
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

    public static LogEntry parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }
    public static LogEntry parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }
    public static LogEntry parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }
    public static LogEntry parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }
    public static LogEntry parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return PARSER.parseFrom(input);
    }
    public static LogEntry parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
    }
    public static LogEntry parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input);
    }
    public static LogEntry parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static LogEntry parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return PARSER.parseFrom(input);
    }
    public static LogEntry parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(LogEntry prototype) {
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
     * Protobuf type {@code raft.LogEntry}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessage.Builder<Builder>
            implements LogEntryOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return RaftProto.internal_static_raft_LogEntry_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return RaftProto.internal_static_raft_LogEntry_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            LogEntry.class, LogEntry.Builder.class);
        }

        // Construct using LogEntry.newBuilder()
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
            term_ = 0L;
            bitField0_ = (bitField0_ & ~0x00000001);
            index_ = 0L;
            bitField0_ = (bitField0_ & ~0x00000002);
            type_ = EntryType.ENTRY_TYPE_DATA;
            bitField0_ = (bitField0_ & ~0x00000004);
            data_ = com.google.protobuf.ByteString.EMPTY;
            bitField0_ = (bitField0_ & ~0x00000008);
            return this;
        }

        public Builder clone() {
            return create().mergeFrom(buildPartial());
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return RaftProto.internal_static_raft_LogEntry_descriptor;
        }

        public LogEntry getDefaultInstanceForType() {
            return LogEntry.getDefaultInstance();
        }

        public LogEntry build() {
            LogEntry result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public LogEntry buildPartial() {
            LogEntry result = new LogEntry(this);
            int from_bitField0_ = bitField0_;
            int to_bitField0_ = 0;
            if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                to_bitField0_ |= 0x00000001;
            }
            result.term_ = term_;
            if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                to_bitField0_ |= 0x00000002;
            }
            result.index_ = index_;
            if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                to_bitField0_ |= 0x00000004;
            }
            result.type_ = type_;
            if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                to_bitField0_ |= 0x00000008;
            }
            result.data_ = data_;
            result.bitField0_ = to_bitField0_;
            onBuilt();
            return result;
        }

        public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof LogEntry) {
                return mergeFrom((LogEntry)other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(LogEntry other) {
            if (other == LogEntry.getDefaultInstance()) return this;
            if (other.hasTerm()) {
                setTerm(other.getTerm());
            }
            if (other.hasIndex()) {
                setIndex(other.getIndex());
            }
            if (other.hasType()) {
                setType(other.getType());
            }
            if (other.hasData()) {
                setData(other.getData());
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
            LogEntry parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (LogEntry) e.getUnfinishedMessage();
                throw e;
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }
        private int bitField0_;

        // optional uint64 term = 1;
        private long term_ ;
        /**
         * <code>optional uint64 term = 1;</code>
         */
        public boolean hasTerm() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional uint64 term = 1;</code>
         */
        public long getTerm() {
            return term_;
        }
        /**
         * <code>optional uint64 term = 1;</code>
         */
        public Builder setTerm(long value) {
            bitField0_ |= 0x00000001;
            term_ = value;
            onChanged();
            return this;
        }
        /**
         * <code>optional uint64 term = 1;</code>
         */
        public Builder clearTerm() {
            bitField0_ = (bitField0_ & ~0x00000001);
            term_ = 0L;
            onChanged();
            return this;
        }

        // optional uint64 index = 2;
        private long index_ ;
        /**
         * <code>optional uint64 index = 2;</code>
         */
        public boolean hasIndex() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional uint64 index = 2;</code>
         */
        public long getIndex() {
            return index_;
        }
        /**
         * <code>optional uint64 index = 2;</code>
         */
        public Builder setIndex(long value) {
            bitField0_ |= 0x00000002;
            index_ = value;
            onChanged();
            return this;
        }
        /**
         * <code>optional uint64 index = 2;</code>
         */
        public Builder clearIndex() {
            bitField0_ = (bitField0_ & ~0x00000002);
            index_ = 0L;
            onChanged();
            return this;
        }

        // optional .raft.EntryType type = 3;
        private EntryType type_ = EntryType.ENTRY_TYPE_DATA;
        /**
         * <code>optional .raft.EntryType type = 3;</code>
         */
        public boolean hasType() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <code>optional .raft.EntryType type = 3;</code>
         */
        public EntryType getType() {
            return type_;
        }
        /**
         * <code>optional .raft.EntryType type = 3;</code>
         */
        public Builder setType(EntryType value) {
            if (value == null) {
                throw new NullPointerException();
            }
            bitField0_ |= 0x00000004;
            type_ = value;
            onChanged();
            return this;
        }
        /**
         * <code>optional .raft.EntryType type = 3;</code>
         */
        public Builder clearType() {
            bitField0_ = (bitField0_ & ~0x00000004);
            type_ = EntryType.ENTRY_TYPE_DATA;
            onChanged();
            return this;
        }

        // optional bytes data = 4;
        private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
        /**
         * <code>optional bytes data = 4;</code>
         */
        public boolean hasData() {
            return ((bitField0_ & 0x00000008) == 0x00000008);
        }
        /**
         * <code>optional bytes data = 4;</code>
         */
        public com.google.protobuf.ByteString getData() {
            return data_;
        }
        /**
         * <code>optional bytes data = 4;</code>
         */
        public Builder setData(com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            bitField0_ |= 0x00000008;
            data_ = value;
            onChanged();
            return this;
        }
        /**
         * <code>optional bytes data = 4;</code>
         */
        public Builder clearData() {
            bitField0_ = (bitField0_ & ~0x00000008);
            data_ = getDefaultInstance().getData();
            onChanged();
            return this;
        }

        // @@protoc_insertion_point(builder_scope:raft.LogEntry)
    }

    static {
        defaultInstance = new LogEntry(true);
        defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:raft.LogEntry)
}
