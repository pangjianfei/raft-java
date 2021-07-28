package com.github.wenweihu86.raft.proto.builder;

public interface EndpointOrBuilder
        extends com.google.protobuf.MessageOrBuilder {

    // optional string host = 1;
    /**
     * <code>optional string host = 1;</code>
     */
    boolean hasHost();
    /**
     * <code>optional string host = 1;</code>
     */
    java.lang.String getHost();
    /**
     * <code>optional string host = 1;</code>
     */
    com.google.protobuf.ByteString
    getHostBytes();

    // optional uint32 port = 2;
    /**
     * <code>optional uint32 port = 2;</code>
     */
    boolean hasPort();
    /**
     * <code>optional uint32 port = 2;</code>
     */
    int getPort();
}
