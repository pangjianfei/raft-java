package com.github.wenweihu86.raft.proto.builder;


import com.github.wenweihu86.raft.proto.Endpoint;

public interface ServerOrBuilder
        extends com.google.protobuf.MessageOrBuilder {

    // optional uint32 server_id = 1;
    /**
     * <code>optional uint32 server_id = 1;</code>
     */
    boolean hasServerId();
    /**
     * <code>optional uint32 server_id = 1;</code>
     */
    int getServerId();

    // optional .raft.Endpoint endpoint = 2;
    /**
     * <code>optional .raft.Endpoint endpoint = 2;</code>
     */
    boolean hasEndpoint();
    /**
     * <code>optional .raft.Endpoint endpoint = 2;</code>
     */
    Endpoint getEndpoint();
    /**
     * <code>optional .raft.Endpoint endpoint = 2;</code>
     */
    EndpointOrBuilder getEndpointOrBuilder();
}
