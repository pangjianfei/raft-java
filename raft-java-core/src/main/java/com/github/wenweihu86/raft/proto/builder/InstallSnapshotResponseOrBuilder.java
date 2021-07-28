package com.github.wenweihu86.raft.proto.builder;

import com.github.wenweihu86.raft.proto.base.ResCode;

public interface InstallSnapshotResponseOrBuilder
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

    // optional uint64 term = 2;
    /**
     * <code>optional uint64 term = 2;</code>
     */
    boolean hasTerm();
    /**
     * <code>optional uint64 term = 2;</code>
     */
    long getTerm();
}
