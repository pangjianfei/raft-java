package com.github.wenweihu86.raft.proto.builder;

public interface  LogMetaDataOrBuilder
        extends com.google.protobuf.MessageOrBuilder {

    // optional uint64 current_term = 1;
    /**
     * <code>optional uint64 current_term = 1;</code>
     */
    boolean hasCurrentTerm();
    /**
     * <code>optional uint64 current_term = 1;</code>
     */
    long getCurrentTerm();

    // optional uint32 voted_for = 2;
    /**
     * <code>optional uint32 voted_for = 2;</code>
     */
    boolean hasVotedFor();
    /**
     * <code>optional uint32 voted_for = 2;</code>
     */
    int getVotedFor();

    // optional uint64 first_log_index = 3;
    /**
     * <code>optional uint64 first_log_index = 3;</code>
     */
    boolean hasFirstLogIndex();
    /**
     * <code>optional uint64 first_log_index = 3;</code>
     */
    long getFirstLogIndex();

    // optional uint64 commit_index = 4;
    /**
     * <code>optional uint64 commit_index = 4;</code>
     */
    boolean hasCommitIndex();
    /**
     * <code>optional uint64 commit_index = 4;</code>
     */
    long getCommitIndex();
}
