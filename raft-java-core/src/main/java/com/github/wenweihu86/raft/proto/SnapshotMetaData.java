package com.github.wenweihu86.raft.proto;

import com.github.wenweihu86.raft.Configuration;
import com.github.wenweihu86.raft.proto.builder.ConfigurationOrBuilder;
import com.github.wenweihu86.raft.proto.builder.SnapshotMetaDataOrBuilder;

/**
 * Protobuf type {@code raft.SnapshotMetaData}
 */
public final class SnapshotMetaData extends
        com.google.protobuf.GeneratedMessage
        implements SnapshotMetaDataOrBuilder {
    // Use SnapshotMetaData.newBuilder() to construct.
    private SnapshotMetaData(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
        super(builder);
        this.unknownFields = builder.getUnknownFields();
    }
    private SnapshotMetaData(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final SnapshotMetaData defaultInstance;
    public static SnapshotMetaData getDefaultInstance() {
        return defaultInstance;
    }

    public SnapshotMetaData getDefaultInstanceForType() {
        return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return this.unknownFields;
    }
    private SnapshotMetaData(
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
                        lastIncludedIndex_ = input.readUInt64();
                        break;
                    }
                    case 16: {
                        bitField0_ |= 0x00000002;
                        lastIncludedTerm_ = input.readUInt64();
                        break;
                    }
                    case 26: {
                        Configuration.Builder subBuilder = null;
                        if (((bitField0_ & 0x00000004) == 0x00000004)) {
                            subBuilder = configuration_.toBuilder();
                        }
                        configuration_ = input.readMessage(Configuration.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(configuration_);
                            configuration_ = subBuilder.buildPartial();
                        }
                        bitField0_ |= 0x00000004;
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
        return RaftProto.internal_static_raft_SnapshotMetaData_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return RaftProto.internal_static_raft_SnapshotMetaData_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        SnapshotMetaData.class, SnapshotMetaData.Builder.class);
    }

    public static com.google.protobuf.Parser<SnapshotMetaData> PARSER =
            new com.google.protobuf.AbstractParser<SnapshotMetaData>() {
                public SnapshotMetaData parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new SnapshotMetaData(input, extensionRegistry);
                }
            };

    @java.lang.Override
    public com.google.protobuf.Parser<SnapshotMetaData> getParserForType() {
        return PARSER;
    }

    private int bitField0_;
    // optional uint64 last_included_index = 1;
    public static final int LAST_INCLUDED_INDEX_FIELD_NUMBER = 1;
    private long lastIncludedIndex_;
    /**
     * <code>optional uint64 last_included_index = 1;</code>
     */
    public boolean hasLastIncludedIndex() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional uint64 last_included_index = 1;</code>
     */
    public long getLastIncludedIndex() {
        return lastIncludedIndex_;
    }

    // optional uint64 last_included_term = 2;
    public static final int LAST_INCLUDED_TERM_FIELD_NUMBER = 2;
    private long lastIncludedTerm_;
    /**
     * <code>optional uint64 last_included_term = 2;</code>
     */
    public boolean hasLastIncludedTerm() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional uint64 last_included_term = 2;</code>
     */
    public long getLastIncludedTerm() {
        return lastIncludedTerm_;
    }

    // optional .raft.Configuration configuration = 3;
    public static final int CONFIGURATION_FIELD_NUMBER = 3;
    private Configuration configuration_;
    /**
     * <code>optional .raft.Configuration configuration = 3;</code>
     */
    public boolean hasConfiguration() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional .raft.Configuration configuration = 3;</code>
     */
    public Configuration getConfiguration() {
        return configuration_;
    }
    /**
     * <code>optional .raft.Configuration configuration = 3;</code>
     */
    public ConfigurationOrBuilder getConfigurationOrBuilder() {
        return configuration_;
    }

    private void initFields() {
        lastIncludedIndex_ = 0L;
        lastIncludedTerm_ = 0L;
        configuration_ = Configuration.getDefaultInstance();
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
            output.writeUInt64(1, lastIncludedIndex_);
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
            output.writeUInt64(2, lastIncludedTerm_);
        }
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
            output.writeMessage(3, configuration_);
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
                    .computeUInt64Size(1, lastIncludedIndex_);
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
            size += com.google.protobuf.CodedOutputStream
                    .computeUInt64Size(2, lastIncludedTerm_);
        }
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
            size += com.google.protobuf.CodedOutputStream
                    .computeMessageSize(3, configuration_);
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

    public static SnapshotMetaData parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }
    public static SnapshotMetaData parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SnapshotMetaData parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }
    public static SnapshotMetaData parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SnapshotMetaData parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return PARSER.parseFrom(input);
    }
    public static SnapshotMetaData parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
    }
    public static SnapshotMetaData parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input);
    }
    public static SnapshotMetaData parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static SnapshotMetaData parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return PARSER.parseFrom(input);
    }
    public static SnapshotMetaData parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(SnapshotMetaData prototype) {
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
     * Protobuf type {@code raft.SnapshotMetaData}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessage.Builder<Builder>
            implements SnapshotMetaDataOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return RaftProto.internal_static_raft_SnapshotMetaData_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return RaftProto.internal_static_raft_SnapshotMetaData_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            SnapshotMetaData.class, SnapshotMetaData.Builder.class);
        }

        // Construct using SnapshotMetaData.newBuilder()
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
                getConfigurationFieldBuilder();
            }
        }
        private static Builder create() {
            return new Builder();
        }

        public Builder clear() {
            super.clear();
            lastIncludedIndex_ = 0L;
            bitField0_ = (bitField0_ & ~0x00000001);
            lastIncludedTerm_ = 0L;
            bitField0_ = (bitField0_ & ~0x00000002);
            if (configurationBuilder_ == null) {
                configuration_ = Configuration.getDefaultInstance();
            } else {
                configurationBuilder_.clear();
            }
            bitField0_ = (bitField0_ & ~0x00000004);
            return this;
        }

        public Builder clone() {
            return create().mergeFrom(buildPartial());
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return RaftProto.internal_static_raft_SnapshotMetaData_descriptor;
        }

        public SnapshotMetaData getDefaultInstanceForType() {
            return SnapshotMetaData.getDefaultInstance();
        }

        public SnapshotMetaData build() {
            SnapshotMetaData result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public SnapshotMetaData buildPartial() {
            SnapshotMetaData result = new SnapshotMetaData(this);
            int from_bitField0_ = bitField0_;
            int to_bitField0_ = 0;
            if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                to_bitField0_ |= 0x00000001;
            }
            result.lastIncludedIndex_ = lastIncludedIndex_;
            if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                to_bitField0_ |= 0x00000002;
            }
            result.lastIncludedTerm_ = lastIncludedTerm_;
            if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                to_bitField0_ |= 0x00000004;
            }
            if (configurationBuilder_ == null) {
                result.configuration_ = configuration_;
            } else {
                result.configuration_ = configurationBuilder_.build();
            }
            result.bitField0_ = to_bitField0_;
            onBuilt();
            return result;
        }

        public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof SnapshotMetaData) {
                return mergeFrom((SnapshotMetaData)other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(SnapshotMetaData other) {
            if (other == SnapshotMetaData.getDefaultInstance()) return this;
            if (other.hasLastIncludedIndex()) {
                setLastIncludedIndex(other.getLastIncludedIndex());
            }
            if (other.hasLastIncludedTerm()) {
                setLastIncludedTerm(other.getLastIncludedTerm());
            }
            if (other.hasConfiguration()) {
                mergeConfiguration(other.getConfiguration());
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
            SnapshotMetaData parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (SnapshotMetaData) e.getUnfinishedMessage();
                throw e;
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }
        private int bitField0_;

        // optional uint64 last_included_index = 1;
        private long lastIncludedIndex_ ;
        /**
         * <code>optional uint64 last_included_index = 1;</code>
         */
        public boolean hasLastIncludedIndex() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional uint64 last_included_index = 1;</code>
         */
        public long getLastIncludedIndex() {
            return lastIncludedIndex_;
        }
        /**
         * <code>optional uint64 last_included_index = 1;</code>
         */
        public Builder setLastIncludedIndex(long value) {
            bitField0_ |= 0x00000001;
            lastIncludedIndex_ = value;
            onChanged();
            return this;
        }
        /**
         * <code>optional uint64 last_included_index = 1;</code>
         */
        public Builder clearLastIncludedIndex() {
            bitField0_ = (bitField0_ & ~0x00000001);
            lastIncludedIndex_ = 0L;
            onChanged();
            return this;
        }

        // optional uint64 last_included_term = 2;
        private long lastIncludedTerm_ ;
        /**
         * <code>optional uint64 last_included_term = 2;</code>
         */
        public boolean hasLastIncludedTerm() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional uint64 last_included_term = 2;</code>
         */
        public long getLastIncludedTerm() {
            return lastIncludedTerm_;
        }
        /**
         * <code>optional uint64 last_included_term = 2;</code>
         */
        public Builder setLastIncludedTerm(long value) {
            bitField0_ |= 0x00000002;
            lastIncludedTerm_ = value;
            onChanged();
            return this;
        }
        /**
         * <code>optional uint64 last_included_term = 2;</code>
         */
        public Builder clearLastIncludedTerm() {
            bitField0_ = (bitField0_ & ~0x00000002);
            lastIncludedTerm_ = 0L;
            onChanged();
            return this;
        }

        // optional .raft.Configuration configuration = 3;
        private Configuration configuration_ = Configuration.getDefaultInstance();
        private com.google.protobuf.SingleFieldBuilder<
                Configuration, Configuration.Builder, ConfigurationOrBuilder> configurationBuilder_;
        /**
         * <code>optional .raft.Configuration configuration = 3;</code>
         */
        public boolean hasConfiguration() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <code>optional .raft.Configuration configuration = 3;</code>
         */
        public Configuration getConfiguration() {
            if (configurationBuilder_ == null) {
                return configuration_;
            } else {
                return configurationBuilder_.getMessage();
            }
        }
        /**
         * <code>optional .raft.Configuration configuration = 3;</code>
         */
        public Builder setConfiguration(Configuration value) {
            if (configurationBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                configuration_ = value;
                onChanged();
            } else {
                configurationBuilder_.setMessage(value);
            }
            bitField0_ |= 0x00000004;
            return this;
        }
        /**
         * <code>optional .raft.Configuration configuration = 3;</code>
         */
        public Builder setConfiguration(
                Configuration.Builder builderForValue) {
            if (configurationBuilder_ == null) {
                configuration_ = builderForValue.build();
                onChanged();
            } else {
                configurationBuilder_.setMessage(builderForValue.build());
            }
            bitField0_ |= 0x00000004;
            return this;
        }
        /**
         * <code>optional .raft.Configuration configuration = 3;</code>
         */
        public Builder mergeConfiguration(Configuration value) {
            if (configurationBuilder_ == null) {
                if (((bitField0_ & 0x00000004) == 0x00000004) &&
                        configuration_ != Configuration.getDefaultInstance()) {
                    configuration_ =
                            Configuration.newBuilder(configuration_).mergeFrom(value).buildPartial();
                } else {
                    configuration_ = value;
                }
                onChanged();
            } else {
                configurationBuilder_.mergeFrom(value);
            }
            bitField0_ |= 0x00000004;
            return this;
        }
        /**
         * <code>optional .raft.Configuration configuration = 3;</code>
         */
        public Builder clearConfiguration() {
            if (configurationBuilder_ == null) {
                configuration_ = Configuration.getDefaultInstance();
                onChanged();
            } else {
                configurationBuilder_.clear();
            }
            bitField0_ = (bitField0_ & ~0x00000004);
            return this;
        }
        /**
         * <code>optional .raft.Configuration configuration = 3;</code>
         */
        public Configuration.Builder getConfigurationBuilder() {
            bitField0_ |= 0x00000004;
            onChanged();
            return getConfigurationFieldBuilder().getBuilder();
        }
        /**
         * <code>optional .raft.Configuration configuration = 3;</code>
         */
        public ConfigurationOrBuilder getConfigurationOrBuilder() {
            if (configurationBuilder_ != null) {
                return configurationBuilder_.getMessageOrBuilder();
            } else {
                return configuration_;
            }
        }
        /**
         * <code>optional .raft.Configuration configuration = 3;</code>
         */
        private com.google.protobuf.SingleFieldBuilder<
                Configuration, Configuration.Builder, ConfigurationOrBuilder>
        getConfigurationFieldBuilder() {
            if (configurationBuilder_ == null) {
                configurationBuilder_ = new com.google.protobuf.SingleFieldBuilder<
                        Configuration, Configuration.Builder, ConfigurationOrBuilder>(
                        configuration_,
                        getParentForChildren(),
                        isClean());
                configuration_ = null;
            }
            return configurationBuilder_;
        }

        // @@protoc_insertion_point(builder_scope:raft.SnapshotMetaData)
    }

    static {
        defaultInstance = new SnapshotMetaData(true);
        defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:raft.SnapshotMetaData)
}
