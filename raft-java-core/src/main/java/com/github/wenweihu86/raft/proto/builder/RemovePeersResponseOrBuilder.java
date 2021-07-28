package com.github.wenweihu86.raft.proto.builder;

import com.github.wenweihu86.raft.proto.base.ResCode;

public interface RemovePeersResponseOrBuilder
        extends com.google.protobuf.MessageOrBuilder {

    // optional .raft.ResCode res_code = 1;
    /**
     * <code>optional .raft.ResCode res_code = 1;</code>
     */
    boolean hasResCode();
    /**
     * <code>optional .raft.ResCode res_code = 1;</code>
     */
    ResCode getResCode();

    // optional string res_msg = 2;
    /**
     * <code>optional string res_msg = 2;</code>
     */
    boolean hasResMsg();
    /**
     * <code>optional string res_msg = 2;</code>
     */
    java.lang.String getResMsg();
    /**
     * <code>optional string res_msg = 2;</code>
     */
    com.google.protobuf.ByteString
    getResMsgBytes();
}
