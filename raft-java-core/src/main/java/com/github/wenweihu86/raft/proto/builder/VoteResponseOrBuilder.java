package com.github.wenweihu86.raft.proto.builder;


public interface VoteResponseOrBuilder
        extends com.google.protobuf.MessageOrBuilder {

    // optional uint64 term = 1;
    /**
     * <code>optional uint64 term = 1;</code>
     *
     * <pre>
     * 当前任期号，以便于候选人去更新自己的任期号
     * </pre>
     */
    boolean hasTerm();
    /**
     * <code>optional uint64 term = 1;</code>
     *
     * <pre>
     * 当前任期号，以便于候选人去更新自己的任期号
     * </pre>
     */
    long getTerm();

    // optional bool granted = 2;
    /**
     * <code>optional bool granted = 2;</code>
     *
     * <pre>
     * 候选人赢得了此张选票时为真
     * </pre>
     */
    boolean hasGranted();
    /**
     * <code>optional bool granted = 2;</code>
     *
     * <pre>
     * 候选人赢得了此张选票时为真
     * </pre>
     */
    boolean getGranted();
}
