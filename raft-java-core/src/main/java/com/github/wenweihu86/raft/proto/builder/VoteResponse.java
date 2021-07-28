package com.github.wenweihu86.raft.proto.builder;

import com.github.wenweihu86.raft.proto.RaftProto;

import static com.github.wenweihu86.raft.proto.RaftProto.internal_static_raft_VoteResponse_descriptor;
import static com.github.wenweihu86.raft.proto.RaftProto.internal_static_raft_VoteResponse_fieldAccessorTable;

/**
 * Protobuf type {@code raft.VoteResponse}
 */
public final class VoteResponse extends com.google.protobuf.GeneratedMessage implements VoteResponseOrBuilder {
    // Use VoteResponse.newBuilder() to construct.
    private VoteResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
        super(builder);
        this.unknownFields = builder.getUnknownFields();
    }
    private VoteResponse(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final VoteResponse defaultInstance;
    public static VoteResponse getDefaultInstance() {
        return defaultInstance;
    }

    public VoteResponse getDefaultInstanceForType() {
        return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return this.unknownFields;
    }
    private VoteResponse(
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
                        granted_ = input.readBool();
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
        return internal_static_raft_VoteResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return internal_static_raft_VoteResponse_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        VoteResponse.class, VoteResponse.Builder.class);
    }

    public static com.google.protobuf.Parser<VoteResponse> PARSER =
            new com.google.protobuf.AbstractParser<VoteResponse>() {
                public VoteResponse parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new VoteResponse(input, extensionRegistry);
                }
            };

    @java.lang.Override
    public com.google.protobuf.Parser<VoteResponse> getParserForType() {
        return PARSER;
    }

    private int bitField0_;
    // optional uint64 term = 1;
    public static final int TERM_FIELD_NUMBER = 1;
    private long term_;
    /**
     * <code>optional uint64 term = 1;</code>
     *
     * <pre>
     * 当前任期号，以便于候选人去更新自己的任期号
     * </pre>
     */
    public boolean hasTerm() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional uint64 term = 1;</code>
     *
     * <pre>
     * 当前任期号，以便于候选人去更新自己的任期号
     * </pre>
     */
    public long getTerm() {
        return term_;
    }

    // optional bool granted = 2;
    public static final int GRANTED_FIELD_NUMBER = 2;
    private boolean granted_;
    /**
     * <code>optional bool granted = 2;</code>
     *
     * <pre>
     * 候选人赢得了此张选票时为真
     * </pre>
     */
    public boolean hasGranted() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional bool granted = 2;</code>
     *
     * <pre>
     * 候选人赢得了此张选票时为真
     * </pre>
     */
    public boolean getGranted() {
        return granted_;
    }

    private void initFields() {
        term_ = 0L;
        granted_ = false;
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
            output.writeBool(2, granted_);
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
                    .computeBoolSize(2, granted_);
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

    public static VoteResponse parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }
    public static VoteResponse parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }
    public static VoteResponse parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }
    public static VoteResponse parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }
    public static VoteResponse parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return PARSER.parseFrom(input);
    }
    public static VoteResponse parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
    }
    public static VoteResponse parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input);
    }
    public static VoteResponse parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static VoteResponse parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return PARSER.parseFrom(input);
    }
    public static VoteResponse parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(VoteResponse prototype) {
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
     * Protobuf type {@code raft.VoteResponse}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessage.Builder<Builder>
            implements VoteResponseOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return internal_static_raft_VoteResponse_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return internal_static_raft_VoteResponse_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            VoteResponse.class, VoteResponse.Builder.class);
        }

        // Construct using VoteResponse.newBuilder()
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
            granted_ = false;
            bitField0_ = (bitField0_ & ~0x00000002);
            return this;
        }

        public Builder clone() {
            return create().mergeFrom(buildPartial());
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return internal_static_raft_VoteResponse_descriptor;
        }

        public VoteResponse getDefaultInstanceForType() {
            return VoteResponse.getDefaultInstance();
        }

        public VoteResponse build() {
            VoteResponse result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public VoteResponse buildPartial() {
            VoteResponse result = new VoteResponse(this);
            int from_bitField0_ = bitField0_;
            int to_bitField0_ = 0;
            if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                to_bitField0_ |= 0x00000001;
            }
            result.term_ = term_;
            if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                to_bitField0_ |= 0x00000002;
            }
            result.granted_ = granted_;
            result.bitField0_ = to_bitField0_;
            onBuilt();
            return result;
        }

        public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof VoteResponse) {
                return mergeFrom((VoteResponse)other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(VoteResponse other) {
            if (other == VoteResponse.getDefaultInstance()) return this;
            if (other.hasTerm()) {
                setTerm(other.getTerm());
            }
            if (other.hasGranted()) {
                setGranted(other.getGranted());
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
            VoteResponse parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (VoteResponse) e.getUnfinishedMessage();
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
         *
         * <pre>
         * 当前任期号，以便于候选人去更新自己的任期号
         * </pre>
         */
        public boolean hasTerm() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional uint64 term = 1;</code>
         *
         * <pre>
         * 当前任期号，以便于候选人去更新自己的任期号
         * </pre>
         */
        public long getTerm() {
            return term_;
        }
        /**
         * <code>optional uint64 term = 1;</code>
         *
         * <pre>
         * 当前任期号，以便于候选人去更新自己的任期号
         * </pre>
         */
        public Builder setTerm(long value) {
            bitField0_ |= 0x00000001;
            term_ = value;
            onChanged();
            return this;
        }
        /**
         * <code>optional uint64 term = 1;</code>
         *
         * <pre>
         * 当前任期号，以便于候选人去更新自己的任期号
         * </pre>
         */
        public Builder clearTerm() {
            bitField0_ = (bitField0_ & ~0x00000001);
            term_ = 0L;
            onChanged();
            return this;
        }

        // optional bool granted = 2;
        private boolean granted_ ;
        /**
         * <code>optional bool granted = 2;</code>
         *
         * <pre>
         * 候选人赢得了此张选票时为真
         * </pre>
         */
        public boolean hasGranted() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional bool granted = 2;</code>
         *
         * <pre>
         * 候选人赢得了此张选票时为真
         * </pre>
         */
        public boolean getGranted() {
            return granted_;
        }
        /**
         * <code>optional bool granted = 2;</code>
         *
         * <pre>
         * 候选人赢得了此张选票时为真
         * </pre>
         */
        public Builder setGranted(boolean value) {
            bitField0_ |= 0x00000002;
            granted_ = value;
            onChanged();
            return this;
        }
        /**
         * <code>optional bool granted = 2;</code>
         *
         * <pre>
         * 候选人赢得了此张选票时为真
         * </pre>
         */
        public Builder clearGranted() {
            bitField0_ = (bitField0_ & ~0x00000002);
            granted_ = false;
            onChanged();
            return this;
        }

        // @@protoc_insertion_point(builder_scope:raft.VoteResponse)
    }

    static {
        defaultInstance = new VoteResponse(true);
        defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:raft.VoteResponse)
}
