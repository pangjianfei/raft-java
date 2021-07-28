package com.github.wenweihu86.raft;

import com.github.wenweihu86.raft.proto.RaftProto;
import com.github.wenweihu86.raft.proto.builder.ConfigurationOrBuilder;
import com.github.wenweihu86.raft.proto.builder.ServerOrBuilder;

import static com.github.wenweihu86.raft.proto.RaftProto.internal_static_raft_Configuration_descriptor;
import static com.github.wenweihu86.raft.proto.RaftProto.internal_static_raft_Configuration_fieldAccessorTable;

/**
 * Protobuf type {@code raft.Configuration}
 */
public final class Configuration extends
        com.google.protobuf.GeneratedMessage
        implements ConfigurationOrBuilder {
    // Use Configuration.newBuilder() to construct.
    private Configuration(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
        super(builder);
        this.unknownFields = builder.getUnknownFields();
    }
    private Configuration(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Configuration defaultInstance;
    public static Configuration getDefaultInstance() {
        return defaultInstance;
    }

    public Configuration getDefaultInstanceForType() {
        return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return this.unknownFields;
    }
    private Configuration(
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
                    case 10: {
                        if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                            servers_ = new java.util.ArrayList<Server>();
                            mutable_bitField0_ |= 0x00000001;
                        }
                        servers_.add(input.readMessage(Server.PARSER, extensionRegistry));
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
            if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                servers_ = java.util.Collections.unmodifiableList(servers_);
            }
            this.unknownFields = unknownFields.build();
            makeExtensionsImmutable();
        }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
        return internal_static_raft_Configuration_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return internal_static_raft_Configuration_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        Configuration.class, Configuration.Builder.class);
    }

    public static com.google.protobuf.Parser<Configuration> PARSER =
            new com.google.protobuf.AbstractParser<Configuration>() {
                public Configuration parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new Configuration(input, extensionRegistry);
                }
            };

    @java.lang.Override
    public com.google.protobuf.Parser<Configuration> getParserForType() {
        return PARSER;
    }

    // repeated .raft.Server servers = 1;
    public static final int SERVERS_FIELD_NUMBER = 1;
    private java.util.List<Server> servers_;
    /**
     * <code>repeated .raft.Server servers = 1;</code>
     */
    public java.util.List<Server> getServersList() {
        return servers_;
    }
    /**
     * <code>repeated .raft.Server servers = 1;</code>
     */
    public java.util.List<? extends ServerOrBuilder> getServersOrBuilderList() {
        return servers_;
    }
    /**
     * <code>repeated .raft.Server servers = 1;</code>
     */
    public int getServersCount() {
        return servers_.size();
    }
    /**
     * <code>repeated .raft.Server servers = 1;</code>
     */
    public Server getServers(int index) {
        return servers_.get(index);
    }
    /**
     * <code>repeated .raft.Server servers = 1;</code>
     */
    public ServerOrBuilder getServersOrBuilder(
            int index) {
        return servers_.get(index);
    }

    private void initFields() {
        servers_ = java.util.Collections.emptyList();
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
        for (int i = 0; i < servers_.size(); i++) {
            output.writeMessage(1, servers_.get(i));
        }
        getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
        int size = memoizedSerializedSize;
        if (size != -1) return size;

        size = 0;
        for (int i = 0; i < servers_.size(); i++) {
            size += com.google.protobuf.CodedOutputStream
                    .computeMessageSize(1, servers_.get(i));
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

    public static Configuration parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }
    public static Configuration parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Configuration parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }
    public static Configuration parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Configuration parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return PARSER.parseFrom(input);
    }
    public static Configuration parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
    }
    public static Configuration parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input);
    }
    public static Configuration parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static Configuration parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return PARSER.parseFrom(input);
    }
    public static Configuration parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(Configuration prototype) {
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
     * Protobuf type {@code raft.Configuration}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessage.Builder<Builder>
            implements ConfigurationOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return internal_static_raft_Configuration_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return internal_static_raft_Configuration_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            Configuration.class, Configuration.Builder.class);
        }

        // Construct using Configuration.newBuilder()
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
                getServersFieldBuilder();
            }
        }
        private static Builder create() {
            return new Builder();
        }

        public Builder clear() {
            super.clear();
            if (serversBuilder_ == null) {
                servers_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000001);
            } else {
                serversBuilder_.clear();
            }
            return this;
        }

        public Builder clone() {
            return create().mergeFrom(buildPartial());
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return internal_static_raft_Configuration_descriptor;
        }

        public Configuration getDefaultInstanceForType() {
            return Configuration.getDefaultInstance();
        }

        public Configuration build() {
            Configuration result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public Configuration buildPartial() {
            Configuration result = new Configuration(this);
            int from_bitField0_ = bitField0_;
            if (serversBuilder_ == null) {
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                    servers_ = java.util.Collections.unmodifiableList(servers_);
                    bitField0_ = (bitField0_ & ~0x00000001);
                }
                result.servers_ = servers_;
            } else {
                result.servers_ = serversBuilder_.build();
            }
            onBuilt();
            return result;
        }

        public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof Configuration) {
                return mergeFrom((Configuration)other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(Configuration other) {
            if (other == Configuration.getDefaultInstance()) return this;
            if (serversBuilder_ == null) {
                if (!other.servers_.isEmpty()) {
                    if (servers_.isEmpty()) {
                        servers_ = other.servers_;
                        bitField0_ = (bitField0_ & ~0x00000001);
                    } else {
                        ensureServersIsMutable();
                        servers_.addAll(other.servers_);
                    }
                    onChanged();
                }
            } else {
                if (!other.servers_.isEmpty()) {
                    if (serversBuilder_.isEmpty()) {
                        serversBuilder_.dispose();
                        serversBuilder_ = null;
                        servers_ = other.servers_;
                        bitField0_ = (bitField0_ & ~0x00000001);
                        serversBuilder_ =
                                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                                        getServersFieldBuilder() : null;
                    } else {
                        serversBuilder_.addAllMessages(other.servers_);
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
            Configuration parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (Configuration) e.getUnfinishedMessage();
                throw e;
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }
        private int bitField0_;

        // repeated .raft.Server servers = 1;
        private java.util.List<Server> servers_ =
                java.util.Collections.emptyList();
        private void ensureServersIsMutable() {
            if (!((bitField0_ & 0x00000001) == 0x00000001)) {
                servers_ = new java.util.ArrayList<Server>(servers_);
                bitField0_ |= 0x00000001;
            }
        }

        private com.google.protobuf.RepeatedFieldBuilder<
                Server, Server.Builder, ServerOrBuilder> serversBuilder_;

        /**
         * <code>repeated .raft.Server servers = 1;</code>
         */
        public java.util.List<Server> getServersList() {
            if (serversBuilder_ == null) {
                return java.util.Collections.unmodifiableList(servers_);
            } else {
                return serversBuilder_.getMessageList();
            }
        }
        /**
         * <code>repeated .raft.Server servers = 1;</code>
         */
        public int getServersCount() {
            if (serversBuilder_ == null) {
                return servers_.size();
            } else {
                return serversBuilder_.getCount();
            }
        }
        /**
         * <code>repeated .raft.Server servers = 1;</code>
         */
        public Server getServers(int index) {
            if (serversBuilder_ == null) {
                return servers_.get(index);
            } else {
                return serversBuilder_.getMessage(index);
            }
        }
        /**
         * <code>repeated .raft.Server servers = 1;</code>
         */
        public Builder setServers(
                int index, Server value) {
            if (serversBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureServersIsMutable();
                servers_.set(index, value);
                onChanged();
            } else {
                serversBuilder_.setMessage(index, value);
            }
            return this;
        }
        /**
         * <code>repeated .raft.Server servers = 1;</code>
         */
        public Builder setServers(
                int index, Server.Builder builderForValue) {
            if (serversBuilder_ == null) {
                ensureServersIsMutable();
                servers_.set(index, builderForValue.build());
                onChanged();
            } else {
                serversBuilder_.setMessage(index, builderForValue.build());
            }
            return this;
        }
        /**
         * <code>repeated .raft.Server servers = 1;</code>
         */
        public Builder addServers(Server value) {
            if (serversBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureServersIsMutable();
                servers_.add(value);
                onChanged();
            } else {
                serversBuilder_.addMessage(value);
            }
            return this;
        }
        /**
         * <code>repeated .raft.Server servers = 1;</code>
         */
        public Builder addServers(
                int index, Server value) {
            if (serversBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureServersIsMutable();
                servers_.add(index, value);
                onChanged();
            } else {
                serversBuilder_.addMessage(index, value);
            }
            return this;
        }
        /**
         * <code>repeated .raft.Server servers = 1;</code>
         */
        public Builder addServers(
                Server.Builder builderForValue) {
            if (serversBuilder_ == null) {
                ensureServersIsMutable();
                servers_.add(builderForValue.build());
                onChanged();
            } else {
                serversBuilder_.addMessage(builderForValue.build());
            }
            return this;
        }
        /**
         * <code>repeated .raft.Server servers = 1;</code>
         */
        public Builder addServers(
                int index, Server.Builder builderForValue) {
            if (serversBuilder_ == null) {
                ensureServersIsMutable();
                servers_.add(index, builderForValue.build());
                onChanged();
            } else {
                serversBuilder_.addMessage(index, builderForValue.build());
            }
            return this;
        }
        /**
         * <code>repeated .raft.Server servers = 1;</code>
         */
        public Builder addAllServers(
                java.lang.Iterable<? extends Server> values) {
            if (serversBuilder_ == null) {
                ensureServersIsMutable();
                super.addAll(values, servers_);
                onChanged();
            } else {
                serversBuilder_.addAllMessages(values);
            }
            return this;
        }
        /**
         * <code>repeated .raft.Server servers = 1;</code>
         */
        public Builder clearServers() {
            if (serversBuilder_ == null) {
                servers_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000001);
                onChanged();
            } else {
                serversBuilder_.clear();
            }
            return this;
        }
        /**
         * <code>repeated .raft.Server servers = 1;</code>
         */
        public Builder removeServers(int index) {
            if (serversBuilder_ == null) {
                ensureServersIsMutable();
                servers_.remove(index);
                onChanged();
            } else {
                serversBuilder_.remove(index);
            }
            return this;
        }
        /**
         * <code>repeated .raft.Server servers = 1;</code>
         */
        public Server.Builder getServersBuilder(
                int index) {
            return getServersFieldBuilder().getBuilder(index);
        }
        /**
         * <code>repeated .raft.Server servers = 1;</code>
         */
        public ServerOrBuilder getServersOrBuilder(
                int index) {
            if (serversBuilder_ == null) {
                return servers_.get(index);  } else {
                return serversBuilder_.getMessageOrBuilder(index);
            }
        }
        /**
         * <code>repeated .raft.Server servers = 1;</code>
         */
        public java.util.List<? extends ServerOrBuilder>
        getServersOrBuilderList() {
            if (serversBuilder_ != null) {
                return serversBuilder_.getMessageOrBuilderList();
            } else {
                return java.util.Collections.unmodifiableList(servers_);
            }
        }
        /**
         * <code>repeated .raft.Server servers = 1;</code>
         */
        public Server.Builder addServersBuilder() {
            return getServersFieldBuilder().addBuilder(
                    Server.getDefaultInstance());
        }
        /**
         * <code>repeated .raft.Server servers = 1;</code>
         */
        public Server.Builder addServersBuilder(
                int index) {
            return getServersFieldBuilder().addBuilder(
                    index, Server.getDefaultInstance());
        }
        /**
         * <code>repeated .raft.Server servers = 1;</code>
         */
        public java.util.List<Server.Builder>
        getServersBuilderList() {
            return getServersFieldBuilder().getBuilderList();
        }
        private com.google.protobuf.RepeatedFieldBuilder<
                Server, Server.Builder, ServerOrBuilder>
        getServersFieldBuilder() {
            if (serversBuilder_ == null) {
                serversBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
                        Server, Server.Builder, ServerOrBuilder>(
                        servers_,
                        ((bitField0_ & 0x00000001) == 0x00000001),
                        getParentForChildren(),
                        isClean());
                servers_ = null;
            }
            return serversBuilder_;
        }

        // @@protoc_insertion_point(builder_scope:raft.Configuration)
    }

    static {
        defaultInstance = new Configuration(true);
        defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:raft.Configuration)
}
