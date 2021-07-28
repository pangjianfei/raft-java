package com.github.wenweihu86.raft.proto.builder;

import com.github.wenweihu86.raft.Configuration;

public interface SnapshotMetaDataOrBuilder
        extends com.google.protobuf.MessageOrBuilder {

    // optional uint64 last_included_index = 1;
    /**
     * <code>optional uint64 last_included_index = 1;</code>
     */
    boolean hasLastIncludedIndex();
    /**
     * <code>optional uint64 last_included_index = 1;</code>
     */
    long getLastIncludedIndex();

    // optional uint64 last_included_term = 2;
    /**
     * <code>optional uint64 last_included_term = 2;</code>
     */
    boolean hasLastIncludedTerm();
    /**
     * <code>optional uint64 last_included_term = 2;</code>
     */
    long getLastIncludedTerm();

    // optional .raft.Configuration configuration = 3;
    /**
     * <code>optional .raft.Configuration configuration = 3;</code>
     */
    boolean hasConfiguration();
    /**
     * <code>optional .raft.Configuration configuration = 3;</code>
     */
    Configuration getConfiguration();
    /**
     * <code>optional .raft.Configuration configuration = 3;</code>
     */
    ConfigurationOrBuilder getConfigurationOrBuilder();
}