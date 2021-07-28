package com.github.wenweihu86.raft.proto.builder;

import com.github.wenweihu86.raft.proto.RaftProto;
import com.github.wenweihu86.raft.proto.base.ResCode;

import static com.github.wenweihu86.raft.proto.RaftProto.internal_static_raft_AddPeersResponse_descriptor;
import static com.github.wenweihu86.raft.proto.RaftProto.internal_static_raft_AddPeersResponse_fieldAccessorTable;

/**
 * Protobuf type {@code raft.AddPeersResponse}
 */
public final class AddPeersResponse extends
        com.google.protobuf.GeneratedMessage
        implements AddPeersResponseOrBuilder {
    // Use AddPeersResponse.newBuilder() to construct.
    private AddPeersResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
        super(builder);
        this.unknownFields = builder.getUnknownFields();
    }
    private AddPeersResponse(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final AddPeersResponse defaultInstance;
    public static AddPeersResponse getDefaultInstance() {
        return defaultInstance;
    }

    public AddPeersResponse getDefaultInstanceForType() {
        return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return this.unknownFields;
    }
    private AddPeersResponse(
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
        return internal_static_raft_AddPeersResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return internal_static_raft_AddPeersResponse_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        AddPeersResponse.class, AddPeersResponse.Builder.class);
    }

    public static com.google.protobuf.Parser<AddPeersResponse> PARSER =
            new com.google.protobuf.AbstractParser<AddPeersResponse>() {
                public AddPeersResponse parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new AddPeersResponse(input, extensionRegistry);
                }
            };

    @java.lang.Override
    public com.google.protobuf.Parser<AddPeersResponse> getParserForType() {
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

    private void initFields() {
        resCode_ = ResCode.RES_CODE_SUCCESS;
        resMsg_ = "";
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

    public static AddPeersResponse parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }
    public static AddPeersResponse parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AddPeersResponse parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }
    public static AddPeersResponse parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AddPeersResponse parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return PARSER.parseFrom(input);
    }
    public static AddPeersResponse parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
    }
    public static AddPeersResponse parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input);
    }
    public static AddPeersResponse parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static AddPeersResponse parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return PARSER.parseFrom(input);
    }
    public static AddPeersResponse parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(AddPeersResponse prototype) {
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
     * Protobuf type {@code raft.AddPeersResponse}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessage.Builder<Builder>
            implements AddPeersResponseOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return internal_static_raft_AddPeersResponse_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return internal_static_raft_AddPeersResponse_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            AddPeersResponse.class, AddPeersResponse.Builder.class);
        }

        // Construct using AddPeersResponse.newBuilder()
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
            resMsg_ = "";
            bitField0_ = (bitField0_ & ~0x00000002);
            return this;
        }

        public Builder clone() {
            return create().mergeFrom(buildPartial());
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return internal_static_raft_AddPeersResponse_descriptor;
        }

        public AddPeersResponse getDefaultInstanceForType() {
            return AddPeersResponse.getDefaultInstance();
        }

        public AddPeersResponse build() {
            AddPeersResponse result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public AddPeersResponse buildPartial() {
            AddPeersResponse result = new AddPeersResponse(this);
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
            result.bitField0_ = to_bitField0_;
            onBuilt();
            return result;
        }

        public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof AddPeersResponse) {
                return mergeFrom((AddPeersResponse)other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(AddPeersResponse other) {
            if (other == AddPeersResponse.getDefaultInstance()) return this;
            if (other.hasResCode()) {
                setResCode(other.getResCode());
            }
            if (other.hasResMsg()) {
                bitField0_ |= 0x00000002;
                resMsg_ = other.resMsg_;
                onChanged();
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
            AddPeersResponse parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (AddPeersResponse) e.getUnfinishedMessage();
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

        // @@protoc_insertion_point(builder_scope:raft.AddPeersResponse)
    }

    static {
        defaultInstance = new AddPeersResponse(true);
        defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:raft.AddPeersResponse)
}
