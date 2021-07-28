package com.github.wenweihu86.raft.proto.builder;

import com.github.wenweihu86.raft.proto.base.ResCode;

public interface AppendEntriesResponseOrBuilder
        extends com.google.protobuf.MessageOrBuilder {

    // optional .raft.ResCode res_code = 1;
    /**
     * <code>optional .raft.ResCode res_code = 1;</code>
     *
     * <pre>
     * 跟随者包含了匹配上 prevLogIndex 和 prevLogTerm 的日志时为真
     * </pre>
     */
    boolean hasResCode();
    /**
     * <code>optional .raft.ResCode res_code = 1;</code>
     *
     * <pre>
     * 跟随者包含了匹配上 prevLogIndex 和 prevLogTerm 的日志时为真
     * </pre>
     */
    ResCode getResCode();

    // optional uint64 term = 2;
    /**
     * <code>optional uint64 term = 2;</code>
     *
     * <pre>
     * 当前的任期号，用于领导人去更新自己
     * </pre>
     */
    boolean hasTerm();
    /**
     * <code>optional uint64 term = 2;</code>
     *
     * <pre>
     * 当前的任期号，用于领导人去更新自己
     * </pre>
     */
    long getTerm();

    // optional uint64 last_log_index = 3;
    /**
     * <code>optional uint64 last_log_index = 3;</code>
     */
    boolean hasLastLogIndex();
    /**
     * <code>optional uint64 last_log_index = 3;</code>
     */
    long getLastLogIndex();
}
