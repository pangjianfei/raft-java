package com.github.wenweihu86.raft.proto.builder;

import com.github.wenweihu86.raft.proto.RaftProto;

public interface AppendEntriesRequestOrBuilder
        extends com.google.protobuf.MessageOrBuilder {

    // optional uint32 server_id = 1;
    /**
     * <code>optional uint32 server_id = 1;</code>
     *
     * <pre>
     * 领导人的Id
     * </pre>
     */
    boolean hasServerId();
    /**
     * <code>optional uint32 server_id = 1;</code>
     *
     * <pre>
     * 领导人的Id
     * </pre>
     */
    int getServerId();

    // optional uint64 term = 2;
    /**
     * <code>optional uint64 term = 2;</code>
     *
     * <pre>
     * 领导人的任期号
     * </pre>
     */
    boolean hasTerm();
    /**
     * <code>optional uint64 term = 2;</code>
     *
     * <pre>
     * 领导人的任期号
     * </pre>
     */
    long getTerm();

    // optional uint64 prev_log_index = 3;
    /**
     * <code>optional uint64 prev_log_index = 3;</code>
     *
     * <pre>
     * 新的日志条目紧随之前的索引值
     * </pre>
     */
    boolean hasPrevLogIndex();
    /**
     * <code>optional uint64 prev_log_index = 3;</code>
     *
     * <pre>
     * 新的日志条目紧随之前的索引值
     * </pre>
     */
    long getPrevLogIndex();

    // optional uint64 prev_log_term = 4;
    /**
     * <code>optional uint64 prev_log_term = 4;</code>
     *
     * <pre>
     * prev_log_index条目的任期号
     * </pre>
     */
    boolean hasPrevLogTerm();
    /**
     * <code>optional uint64 prev_log_term = 4;</code>
     *
     * <pre>
     * prev_log_index条目的任期号
     * </pre>
     */
    long getPrevLogTerm();

    // optional uint64 commit_index = 5;
    /**
     * <code>optional uint64 commit_index = 5;</code>
     *
     * <pre>
     * 领导人已经提交的日志的索引值
     * </pre>
     */
    boolean hasCommitIndex();
    /**
     * <code>optional uint64 commit_index = 5;</code>
     *
     * <pre>
     * 领导人已经提交的日志的索引值
     * </pre>
     */
    long getCommitIndex();

    // repeated .raft.LogEntry entries = 6;
    /**
     * <code>repeated .raft.LogEntry entries = 6;</code>
     *
     * <pre>
     * 准备存储的日志条目（表示心跳时为空）
     * </pre>
     */
    java.util.List<LogEntry>
    getEntriesList();
    /**
     * <code>repeated .raft.LogEntry entries = 6;</code>
     *
     * <pre>
     * 准备存储的日志条目（表示心跳时为空）
     * </pre>
     */
    LogEntry getEntries(int index);
    /**
     * <code>repeated .raft.LogEntry entries = 6;</code>
     *
     * <pre>
     * 准备存储的日志条目（表示心跳时为空）
     * </pre>
     */
    int getEntriesCount();
    /**
     * <code>repeated .raft.LogEntry entries = 6;</code>
     *
     * <pre>
     * 准备存储的日志条目（表示心跳时为空）
     * </pre>
     */
    java.util.List<? extends LogEntryOrBuilder>
    getEntriesOrBuilderList();
    /**
     * <code>repeated .raft.LogEntry entries = 6;</code>
     *
     * <pre>
     * 准备存储的日志条目（表示心跳时为空）
     * </pre>
     */
    LogEntryOrBuilder getEntriesOrBuilder(
            int index);
}
