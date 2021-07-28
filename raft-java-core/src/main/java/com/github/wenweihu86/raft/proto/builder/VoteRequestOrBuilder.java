package com.github.wenweihu86.raft.proto.builder;

public interface VoteRequestOrBuilder
        extends com.google.protobuf.MessageOrBuilder {

    // optional uint32 server_id = 1;
    /**
     * <code>optional uint32 server_id = 1;</code>
     *
     * <pre>
     * 请求选票的候选人的 Id
     * </pre>
     */
    boolean hasServerId();
    /**
     * <code>optional uint32 server_id = 1;</code>
     *
     * <pre>
     * 请求选票的候选人的 Id
     * </pre>
     */
    int getServerId();

    // optional uint64 term = 2;
    /**
     * <code>optional uint64 term = 2;</code>
     *
     * <pre>
     * 候选人的任期号
     * </pre>
     */
    boolean hasTerm();
    /**
     * <code>optional uint64 term = 2;</code>
     *
     * <pre>
     * 候选人的任期号
     * </pre>
     */
    long getTerm();

    // optional uint64 last_log_term = 3;
    /**
     * <code>optional uint64 last_log_term = 3;</code>
     *
     * <pre>
     * 候选人的最后日志条目的任期号
     * </pre>
     */
    boolean hasLastLogTerm();
    /**
     * <code>optional uint64 last_log_term = 3;</code>
     *
     * <pre>
     * 候选人的最后日志条目的任期号
     * </pre>
     */
    long getLastLogTerm();

    // optional uint64 last_log_index = 4;
    /**
     * <code>optional uint64 last_log_index = 4;</code>
     *
     * <pre>
     * 候选人最后日志条目的索引值
     * </pre>
     */
    boolean hasLastLogIndex();
    /**
     * <code>optional uint64 last_log_index = 4;</code>
     *
     * <pre>
     * 候选人最后日志条目的索引值
     * </pre>
     */
    long getLastLogIndex();
}
