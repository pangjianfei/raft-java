package com.github.wenweihu86.raft.proto.builder;

import com.github.wenweihu86.raft.proto.RaftProto;
import com.github.wenweihu86.raft.proto.SnapshotMetaData;

/**
 * Protobuf type {@code raft.InstallSnapshotRequest}
 */
public final class InstallSnapshotRequest extends
        com.google.protobuf.GeneratedMessage
        implements InstallSnapshotRequestOrBuilder {
    // Use InstallSnapshotRequest.newBuilder() to construct.
    private InstallSnapshotRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
        super(builder);
        this.unknownFields = builder.getUnknownFields();
    }
    private InstallSnapshotRequest(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final InstallSnapshotRequest defaultInstance;
    public static InstallSnapshotRequest getDefaultInstance() {
        return defaultInstance;
    }

    public InstallSnapshotRequest getDefaultInstanceForType() {
        return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return this.unknownFields;
    }
    private InstallSnapshotRequest(
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
                    case 26: {
                        SnapshotMetaData.Builder subBuilder = null;
                        if (((bitField0_ & 0x00000004) == 0x00000004)) {
                            subBuilder = snapshotMetaData_.toBuilder();
                        }
                        snapshotMetaData_ = input.readMessage(SnapshotMetaData.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(snapshotMetaData_);
                            snapshotMetaData_ = subBuilder.buildPartial();
                        }
                        bitField0_ |= 0x00000004;
                        break;
                    }
                    case 34: {
                        bitField0_ |= 0x00000008;
                        fileName_ = input.readBytes();
                        break;
                    }
                    case 40: {
                        bitField0_ |= 0x00000010;
                        offset_ = input.readUInt64();
                        break;
                    }
                    case 50: {
                        bitField0_ |= 0x00000020;
                        data_ = input.readBytes();
                        break;
                    }
                    case 56: {
                        bitField0_ |= 0x00000040;
                        isFirst_ = input.readBool();
                        break;
                    }
                    case 64: {
                        bitField0_ |= 0x00000080;
                        isLast_ = input.readBool();
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
        return RaftProto.internal_static_raft_InstallSnapshotRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return RaftProto.internal_static_raft_InstallSnapshotRequest_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        InstallSnapshotRequest.class, InstallSnapshotRequest.Builder.class);
    }

    public static com.google.protobuf.Parser<InstallSnapshotRequest> PARSER =
            new com.google.protobuf.AbstractParser<InstallSnapshotRequest>() {
                public InstallSnapshotRequest parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new InstallSnapshotRequest(input, extensionRegistry);
                }
            };

    @java.lang.Override
    public com.google.protobuf.Parser<InstallSnapshotRequest> getParserForType() {
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

    // optional uint64 term = 2;
    public static final int TERM_FIELD_NUMBER = 2;
    private long term_;
    /**
     * <code>optional uint64 term = 2;</code>
     */
    public boolean hasTerm() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional uint64 term = 2;</code>
     */
    public long getTerm() {
        return term_;
    }

    // optional .raft.SnapshotMetaData snapshot_meta_data = 3;
    public static final int SNAPSHOT_META_DATA_FIELD_NUMBER = 3;
    private SnapshotMetaData snapshotMetaData_;
    /**
     * <code>optional .raft.SnapshotMetaData snapshot_meta_data = 3;</code>
     */
    public boolean hasSnapshotMetaData() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional .raft.SnapshotMetaData snapshot_meta_data = 3;</code>
     */
    public SnapshotMetaData getSnapshotMetaData() {
        return snapshotMetaData_;
    }
    /**
     * <code>optional .raft.SnapshotMetaData snapshot_meta_data = 3;</code>
     */
    public SnapshotMetaDataOrBuilder getSnapshotMetaDataOrBuilder() {
        return snapshotMetaData_;
    }

    // optional string file_name = 4;
    public static final int FILE_NAME_FIELD_NUMBER = 4;
    private java.lang.Object fileName_;
    /**
     * <code>optional string file_name = 4;</code>
     */
    public boolean hasFileName() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional string file_name = 4;</code>
     */
    public java.lang.String getFileName() {
        java.lang.Object ref = fileName_;
        if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
        } else {
            com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
                fileName_ = s;
            }
            return s;
        }
    }
    /**
     * <code>optional string file_name = 4;</code>
     */
    public com.google.protobuf.ByteString
    getFileNameBytes() {
        java.lang.Object ref = fileName_;
        if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b =
                    com.google.protobuf.ByteString.copyFromUtf8(
                            (java.lang.String) ref);
            fileName_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    // optional uint64 offset = 5;
    public static final int OFFSET_FIELD_NUMBER = 5;
    private long offset_;
    /**
     * <code>optional uint64 offset = 5;</code>
     */
    public boolean hasOffset() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional uint64 offset = 5;</code>
     */
    public long getOffset() {
        return offset_;
    }

    // optional bytes data = 6;
    public static final int DATA_FIELD_NUMBER = 6;
    private com.google.protobuf.ByteString data_;
    /**
     * <code>optional bytes data = 6;</code>
     */
    public boolean hasData() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional bytes data = 6;</code>
     */
    public com.google.protobuf.ByteString getData() {
        return data_;
    }

    // optional bool is_first = 7;
    public static final int IS_FIRST_FIELD_NUMBER = 7;
    private boolean isFirst_;
    /**
     * <code>optional bool is_first = 7;</code>
     */
    public boolean hasIsFirst() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>optional bool is_first = 7;</code>
     */
    public boolean getIsFirst() {
        return isFirst_;
    }

    // optional bool is_last = 8;
    public static final int IS_LAST_FIELD_NUMBER = 8;
    private boolean isLast_;
    /**
     * <code>optional bool is_last = 8;</code>
     */
    public boolean hasIsLast() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    /**
     * <code>optional bool is_last = 8;</code>
     */
    public boolean getIsLast() {
        return isLast_;
    }

    private void initFields() {
        serverId_ = 0;
        term_ = 0L;
        snapshotMetaData_ = SnapshotMetaData.getDefaultInstance();
        fileName_ = "";
        offset_ = 0L;
        data_ = com.google.protobuf.ByteString.EMPTY;
        isFirst_ = false;
        isLast_ = false;
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
            output.writeMessage(3, snapshotMetaData_);
        }
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
            output.writeBytes(4, getFileNameBytes());
        }
        if (((bitField0_ & 0x00000010) == 0x00000010)) {
            output.writeUInt64(5, offset_);
        }
        if (((bitField0_ & 0x00000020) == 0x00000020)) {
            output.writeBytes(6, data_);
        }
        if (((bitField0_ & 0x00000040) == 0x00000040)) {
            output.writeBool(7, isFirst_);
        }
        if (((bitField0_ & 0x00000080) == 0x00000080)) {
            output.writeBool(8, isLast_);
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
                    .computeMessageSize(3, snapshotMetaData_);
        }
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
            size += com.google.protobuf.CodedOutputStream
                    .computeBytesSize(4, getFileNameBytes());
        }
        if (((bitField0_ & 0x00000010) == 0x00000010)) {
            size += com.google.protobuf.CodedOutputStream
                    .computeUInt64Size(5, offset_);
        }
        if (((bitField0_ & 0x00000020) == 0x00000020)) {
            size += com.google.protobuf.CodedOutputStream
                    .computeBytesSize(6, data_);
        }
        if (((bitField0_ & 0x00000040) == 0x00000040)) {
            size += com.google.protobuf.CodedOutputStream
                    .computeBoolSize(7, isFirst_);
        }
        if (((bitField0_ & 0x00000080) == 0x00000080)) {
            size += com.google.protobuf.CodedOutputStream
                    .computeBoolSize(8, isLast_);
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

    public static InstallSnapshotRequest parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }
    public static InstallSnapshotRequest parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }
    public static InstallSnapshotRequest parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }
    public static InstallSnapshotRequest parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }
    public static InstallSnapshotRequest parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return PARSER.parseFrom(input);
    }
    public static InstallSnapshotRequest parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
    }
    public static InstallSnapshotRequest parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input);
    }
    public static InstallSnapshotRequest parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static InstallSnapshotRequest parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return PARSER.parseFrom(input);
    }
    public static InstallSnapshotRequest parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(InstallSnapshotRequest prototype) {
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
     * Protobuf type {@code raft.InstallSnapshotRequest}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessage.Builder<Builder>
            implements InstallSnapshotRequestOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return RaftProto.internal_static_raft_InstallSnapshotRequest_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return RaftProto.internal_static_raft_InstallSnapshotRequest_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            InstallSnapshotRequest.class, InstallSnapshotRequest.Builder.class);
        }

        // Construct using InstallSnapshotRequest.newBuilder()
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
                getSnapshotMetaDataFieldBuilder();
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
            if (snapshotMetaDataBuilder_ == null) {
                snapshotMetaData_ = SnapshotMetaData.getDefaultInstance();
            } else {
                snapshotMetaDataBuilder_.clear();
            }
            bitField0_ = (bitField0_ & ~0x00000004);
            fileName_ = "";
            bitField0_ = (bitField0_ & ~0x00000008);
            offset_ = 0L;
            bitField0_ = (bitField0_ & ~0x00000010);
            data_ = com.google.protobuf.ByteString.EMPTY;
            bitField0_ = (bitField0_ & ~0x00000020);
            isFirst_ = false;
            bitField0_ = (bitField0_ & ~0x00000040);
            isLast_ = false;
            bitField0_ = (bitField0_ & ~0x00000080);
            return this;
        }

        public Builder clone() {
            return create().mergeFrom(buildPartial());
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return RaftProto.internal_static_raft_InstallSnapshotRequest_descriptor;
        }

        public InstallSnapshotRequest getDefaultInstanceForType() {
            return InstallSnapshotRequest.getDefaultInstance();
        }

        public InstallSnapshotRequest build() {
            InstallSnapshotRequest result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public InstallSnapshotRequest buildPartial() {
            InstallSnapshotRequest result = new InstallSnapshotRequest(this);
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
            if (snapshotMetaDataBuilder_ == null) {
                result.snapshotMetaData_ = snapshotMetaData_;
            } else {
                result.snapshotMetaData_ = snapshotMetaDataBuilder_.build();
            }
            if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                to_bitField0_ |= 0x00000008;
            }
            result.fileName_ = fileName_;
            if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
                to_bitField0_ |= 0x00000010;
            }
            result.offset_ = offset_;
            if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
                to_bitField0_ |= 0x00000020;
            }
            result.data_ = data_;
            if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
                to_bitField0_ |= 0x00000040;
            }
            result.isFirst_ = isFirst_;
            if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
                to_bitField0_ |= 0x00000080;
            }
            result.isLast_ = isLast_;
            result.bitField0_ = to_bitField0_;
            onBuilt();
            return result;
        }

        public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof InstallSnapshotRequest) {
                return mergeFrom((InstallSnapshotRequest)other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(InstallSnapshotRequest other) {
            if (other == InstallSnapshotRequest.getDefaultInstance()) return this;
            if (other.hasServerId()) {
                setServerId(other.getServerId());
            }
            if (other.hasTerm()) {
                setTerm(other.getTerm());
            }
            if (other.hasSnapshotMetaData()) {
                mergeSnapshotMetaData(other.getSnapshotMetaData());
            }
            if (other.hasFileName()) {
                bitField0_ |= 0x00000008;
                fileName_ = other.fileName_;
                onChanged();
            }
            if (other.hasOffset()) {
                setOffset(other.getOffset());
            }
            if (other.hasData()) {
                setData(other.getData());
            }
            if (other.hasIsFirst()) {
                setIsFirst(other.getIsFirst());
            }
            if (other.hasIsLast()) {
                setIsLast(other.getIsLast());
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
            InstallSnapshotRequest parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (InstallSnapshotRequest) e.getUnfinishedMessage();
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
        public Builder setServerId(int value) {
            bitField0_ |= 0x00000001;
            serverId_ = value;
            onChanged();
            return this;
        }
        /**
         * <code>optional uint32 server_id = 1;</code>
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
         */
        public boolean hasTerm() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional uint64 term = 2;</code>
         */
        public long getTerm() {
            return term_;
        }
        /**
         * <code>optional uint64 term = 2;</code>
         */
        public Builder setTerm(long value) {
            bitField0_ |= 0x00000002;
            term_ = value;
            onChanged();
            return this;
        }
        /**
         * <code>optional uint64 term = 2;</code>
         */
        public Builder clearTerm() {
            bitField0_ = (bitField0_ & ~0x00000002);
            term_ = 0L;
            onChanged();
            return this;
        }

        // optional .raft.SnapshotMetaData snapshot_meta_data = 3;
        private SnapshotMetaData snapshotMetaData_ = SnapshotMetaData.getDefaultInstance();
        private com.google.protobuf.SingleFieldBuilder<
                SnapshotMetaData, SnapshotMetaData.Builder, SnapshotMetaDataOrBuilder> snapshotMetaDataBuilder_;
        /**
         * <code>optional .raft.SnapshotMetaData snapshot_meta_data = 3;</code>
         */
        public boolean hasSnapshotMetaData() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <code>optional .raft.SnapshotMetaData snapshot_meta_data = 3;</code>
         */
        public SnapshotMetaData getSnapshotMetaData() {
            if (snapshotMetaDataBuilder_ == null) {
                return snapshotMetaData_;
            } else {
                return snapshotMetaDataBuilder_.getMessage();
            }
        }
        /**
         * <code>optional .raft.SnapshotMetaData snapshot_meta_data = 3;</code>
         */
        public Builder setSnapshotMetaData(SnapshotMetaData value) {
            if (snapshotMetaDataBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                snapshotMetaData_ = value;
                onChanged();
            } else {
                snapshotMetaDataBuilder_.setMessage(value);
            }
            bitField0_ |= 0x00000004;
            return this;
        }
        /**
         * <code>optional .raft.SnapshotMetaData snapshot_meta_data = 3;</code>
         */
        public Builder setSnapshotMetaData(
                SnapshotMetaData.Builder builderForValue) {
            if (snapshotMetaDataBuilder_ == null) {
                snapshotMetaData_ = builderForValue.build();
                onChanged();
            } else {
                snapshotMetaDataBuilder_.setMessage(builderForValue.build());
            }
            bitField0_ |= 0x00000004;
            return this;
        }
        /**
         * <code>optional .raft.SnapshotMetaData snapshot_meta_data = 3;</code>
         */
        public Builder mergeSnapshotMetaData(SnapshotMetaData value) {
            if (snapshotMetaDataBuilder_ == null) {
                if (((bitField0_ & 0x00000004) == 0x00000004) &&
                        snapshotMetaData_ != SnapshotMetaData.getDefaultInstance()) {
                    snapshotMetaData_ =
                            SnapshotMetaData.newBuilder(snapshotMetaData_).mergeFrom(value).buildPartial();
                } else {
                    snapshotMetaData_ = value;
                }
                onChanged();
            } else {
                snapshotMetaDataBuilder_.mergeFrom(value);
            }
            bitField0_ |= 0x00000004;
            return this;
        }
        /**
         * <code>optional .raft.SnapshotMetaData snapshot_meta_data = 3;</code>
         */
        public Builder clearSnapshotMetaData() {
            if (snapshotMetaDataBuilder_ == null) {
                snapshotMetaData_ = SnapshotMetaData.getDefaultInstance();
                onChanged();
            } else {
                snapshotMetaDataBuilder_.clear();
            }
            bitField0_ = (bitField0_ & ~0x00000004);
            return this;
        }
        /**
         * <code>optional .raft.SnapshotMetaData snapshot_meta_data = 3;</code>
         */
        public SnapshotMetaData.Builder getSnapshotMetaDataBuilder() {
            bitField0_ |= 0x00000004;
            onChanged();
            return getSnapshotMetaDataFieldBuilder().getBuilder();
        }
        /**
         * <code>optional .raft.SnapshotMetaData snapshot_meta_data = 3;</code>
         */
        public SnapshotMetaDataOrBuilder getSnapshotMetaDataOrBuilder() {
            if (snapshotMetaDataBuilder_ != null) {
                return snapshotMetaDataBuilder_.getMessageOrBuilder();
            } else {
                return snapshotMetaData_;
            }
        }
        /**
         * <code>optional .raft.SnapshotMetaData snapshot_meta_data = 3;</code>
         */
        private com.google.protobuf.SingleFieldBuilder<
                SnapshotMetaData, SnapshotMetaData.Builder, SnapshotMetaDataOrBuilder>
        getSnapshotMetaDataFieldBuilder() {
            if (snapshotMetaDataBuilder_ == null) {
                snapshotMetaDataBuilder_ = new com.google.protobuf.SingleFieldBuilder<
                        SnapshotMetaData, SnapshotMetaData.Builder, SnapshotMetaDataOrBuilder>(
                        snapshotMetaData_,
                        getParentForChildren(),
                        isClean());
                snapshotMetaData_ = null;
            }
            return snapshotMetaDataBuilder_;
        }

        // optional string file_name = 4;
        private java.lang.Object fileName_ = "";
        /**
         * <code>optional string file_name = 4;</code>
         */
        public boolean hasFileName() {
            return ((bitField0_ & 0x00000008) == 0x00000008);
        }
        /**
         * <code>optional string file_name = 4;</code>
         */
        public java.lang.String getFileName() {
            java.lang.Object ref = fileName_;
            if (!(ref instanceof java.lang.String)) {
                java.lang.String s = ((com.google.protobuf.ByteString) ref)
                        .toStringUtf8();
                fileName_ = s;
                return s;
            } else {
                return (java.lang.String) ref;
            }
        }
        /**
         * <code>optional string file_name = 4;</code>
         */
        public com.google.protobuf.ByteString
        getFileNameBytes() {
            java.lang.Object ref = fileName_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                fileName_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }
        /**
         * <code>optional string file_name = 4;</code>
         */
        public Builder setFileName(
                java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            bitField0_ |= 0x00000008;
            fileName_ = value;
            onChanged();
            return this;
        }
        /**
         * <code>optional string file_name = 4;</code>
         */
        public Builder clearFileName() {
            bitField0_ = (bitField0_ & ~0x00000008);
            fileName_ = getDefaultInstance().getFileName();
            onChanged();
            return this;
        }
        /**
         * <code>optional string file_name = 4;</code>
         */
        public Builder setFileNameBytes(
                com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            bitField0_ |= 0x00000008;
            fileName_ = value;
            onChanged();
            return this;
        }

        // optional uint64 offset = 5;
        private long offset_ ;
        /**
         * <code>optional uint64 offset = 5;</code>
         */
        public boolean hasOffset() {
            return ((bitField0_ & 0x00000010) == 0x00000010);
        }
        /**
         * <code>optional uint64 offset = 5;</code>
         */
        public long getOffset() {
            return offset_;
        }
        /**
         * <code>optional uint64 offset = 5;</code>
         */
        public Builder setOffset(long value) {
            bitField0_ |= 0x00000010;
            offset_ = value;
            onChanged();
            return this;
        }
        /**
         * <code>optional uint64 offset = 5;</code>
         */
        public Builder clearOffset() {
            bitField0_ = (bitField0_ & ~0x00000010);
            offset_ = 0L;
            onChanged();
            return this;
        }

        // optional bytes data = 6;
        private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
        /**
         * <code>optional bytes data = 6;</code>
         */
        public boolean hasData() {
            return ((bitField0_ & 0x00000020) == 0x00000020);
        }
        /**
         * <code>optional bytes data = 6;</code>
         */
        public com.google.protobuf.ByteString getData() {
            return data_;
        }
        /**
         * <code>optional bytes data = 6;</code>
         */
        public Builder setData(com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            bitField0_ |= 0x00000020;
            data_ = value;
            onChanged();
            return this;
        }
        /**
         * <code>optional bytes data = 6;</code>
         */
        public Builder clearData() {
            bitField0_ = (bitField0_ & ~0x00000020);
            data_ = getDefaultInstance().getData();
            onChanged();
            return this;
        }

        // optional bool is_first = 7;
        private boolean isFirst_ ;
        /**
         * <code>optional bool is_first = 7;</code>
         */
        public boolean hasIsFirst() {
            return ((bitField0_ & 0x00000040) == 0x00000040);
        }
        /**
         * <code>optional bool is_first = 7;</code>
         */
        public boolean getIsFirst() {
            return isFirst_;
        }
        /**
         * <code>optional bool is_first = 7;</code>
         */
        public Builder setIsFirst(boolean value) {
            bitField0_ |= 0x00000040;
            isFirst_ = value;
            onChanged();
            return this;
        }
        /**
         * <code>optional bool is_first = 7;</code>
         */
        public Builder clearIsFirst() {
            bitField0_ = (bitField0_ & ~0x00000040);
            isFirst_ = false;
            onChanged();
            return this;
        }

        // optional bool is_last = 8;
        private boolean isLast_ ;
        /**
         * <code>optional bool is_last = 8;</code>
         */
        public boolean hasIsLast() {
            return ((bitField0_ & 0x00000080) == 0x00000080);
        }
        /**
         * <code>optional bool is_last = 8;</code>
         */
        public boolean getIsLast() {
            return isLast_;
        }
        /**
         * <code>optional bool is_last = 8;</code>
         */
        public Builder setIsLast(boolean value) {
            bitField0_ |= 0x00000080;
            isLast_ = value;
            onChanged();
            return this;
        }
        /**
         * <code>optional bool is_last = 8;</code>
         */
        public Builder clearIsLast() {
            bitField0_ = (bitField0_ & ~0x00000080);
            isLast_ = false;
            onChanged();
            return this;
        }

        // @@protoc_insertion_point(builder_scope:raft.InstallSnapshotRequest)
    }

    static {
        defaultInstance = new InstallSnapshotRequest(true);
        defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:raft.InstallSnapshotRequest)
}
