package com.github.wenweihu86.raft.proto.builder;

import com.github.wenweihu86.raft.proto.RaftProto;

import static com.github.wenweihu86.raft.proto.RaftProto.internal_static_raft_GetConfigurationRequest_descriptor;
import static com.github.wenweihu86.raft.proto.RaftProto.internal_static_raft_GetConfigurationRequest_fieldAccessorTable;

/**
 * Protobuf type {@code raft.GetConfigurationRequest}
 */
public final class GetConfigurationRequest extends
        com.google.protobuf.GeneratedMessage
//        implements GetConfigurationRequestOrBuilder
{
    // Use GetConfigurationRequest.newBuilder() to construct.
    private GetConfigurationRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
        super(builder);
        this.unknownFields = builder.getUnknownFields();
    }
    private GetConfigurationRequest(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final GetConfigurationRequest defaultInstance;
    public static GetConfigurationRequest getDefaultInstance() {
        return defaultInstance;
    }

    public GetConfigurationRequest getDefaultInstanceForType() {
        return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return this.unknownFields;
    }
    private GetConfigurationRequest(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        initFields();
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
        return internal_static_raft_GetConfigurationRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return internal_static_raft_GetConfigurationRequest_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        GetConfigurationRequest.class, GetConfigurationRequest.Builder.class);
    }

    public static com.google.protobuf.Parser<GetConfigurationRequest> PARSER =
            new com.google.protobuf.AbstractParser<GetConfigurationRequest>() {
                public GetConfigurationRequest parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new GetConfigurationRequest(input, extensionRegistry);
                }
            };

    @java.lang.Override
    public com.google.protobuf.Parser<GetConfigurationRequest> getParserForType() {
        return PARSER;
    }

    private void initFields() {
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
        getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
        int size = memoizedSerializedSize;
        if (size != -1) return size;

        size = 0;
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

    public static GetConfigurationRequest parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }
    public static GetConfigurationRequest parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GetConfigurationRequest parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }
    public static GetConfigurationRequest parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GetConfigurationRequest parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return PARSER.parseFrom(input);
    }
    public static GetConfigurationRequest parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
    }
    public static GetConfigurationRequest parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input);
    }
    public static GetConfigurationRequest parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static GetConfigurationRequest parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return PARSER.parseFrom(input);
    }
    public static GetConfigurationRequest parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(GetConfigurationRequest prototype) {
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
     * Protobuf type {@code raft.GetConfigurationRequest}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessage.Builder<Builder>
//            implements GetConfigurationRequestOrBuilder {
    {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return internal_static_raft_GetConfigurationRequest_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return internal_static_raft_GetConfigurationRequest_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            GetConfigurationRequest.class, GetConfigurationRequest.Builder.class);
        }

        // Construct using GetConfigurationRequest.newBuilder()
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
            return this;
        }

        public Builder clone() {
            return create().mergeFrom(buildPartial());
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return internal_static_raft_GetConfigurationRequest_descriptor;
        }

        public GetConfigurationRequest getDefaultInstanceForType() {
            return GetConfigurationRequest.getDefaultInstance();
        }

        public GetConfigurationRequest build() {
            GetConfigurationRequest result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public GetConfigurationRequest buildPartial() {
            GetConfigurationRequest result = new GetConfigurationRequest(this);
            onBuilt();
            return result;
        }

        public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof GetConfigurationRequest) {
                return mergeFrom((GetConfigurationRequest)other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(GetConfigurationRequest other) {
            if (other == GetConfigurationRequest.getDefaultInstance()) return this;
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
            GetConfigurationRequest parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (GetConfigurationRequest) e.getUnfinishedMessage();
                throw e;
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        // @@protoc_insertion_point(builder_scope:raft.GetConfigurationRequest)
    }

    static {
        defaultInstance = new GetConfigurationRequest(true);
        defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:raft.GetConfigurationRequest)
}

