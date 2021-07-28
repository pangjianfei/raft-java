package com.github.wenweihu86.raft.proto.builder;

import com.github.wenweihu86.raft.proto.base.EntryType;

public interface LogEntryOrBuilder
        extends com.google.protobuf.MessageOrBuilder {

    // optional uint64 term = 1;
    /**
     * <code>optional uint64 term = 1;</code>
     */
    boolean hasTerm();
    /**
     * <code>optional uint64 term = 1;</code>
     */
    long getTerm();

    // optional uint64 index = 2;
    /**
     * <code>optional uint64 index = 2;</code>
     */
    boolean hasIndex();
    /**
     * <code>optional uint64 index = 2;</code>
     */
    long getIndex();

    // optional .raft.EntryType type = 3;
    /**
     * <code>optional .raft.EntryType type = 3;</code>
     */
    boolean hasType();
    /**
     * <code>optional .raft.EntryType type = 3;</code>
     */
    EntryType getType();

    // optional bytes data = 4;
    /**
     * <code>optional bytes data = 4;</code>
     */
    boolean hasData();
    /**
     * <code>optional bytes data = 4;</code>
     */
    com.google.protobuf.ByteString getData();
}
