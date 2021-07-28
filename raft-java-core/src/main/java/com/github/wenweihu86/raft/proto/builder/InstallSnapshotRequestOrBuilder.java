package com.github.wenweihu86.raft.proto.builder;

import com.github.wenweihu86.raft.proto.RaftProto;
import com.github.wenweihu86.raft.proto.SnapshotMetaData;

public interface InstallSnapshotRequestOrBuilder
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

    // optional uint64 term = 2;
    /**
     * <code>optional uint64 term = 2;</code>
     */
    boolean hasTerm();
    /**
     * <code>optional uint64 term = 2;</code>
     */
    long getTerm();

    // optional .raft.SnapshotMetaData snapshot_meta_data = 3;
    /**
     * <code>optional .raft.SnapshotMetaData snapshot_meta_data = 3;</code>
     */
    boolean hasSnapshotMetaData();
    /**
     * <code>optional .raft.SnapshotMetaData snapshot_meta_data = 3;</code>
     */
    SnapshotMetaData getSnapshotMetaData();
    /**
     * <code>optional .raft.SnapshotMetaData snapshot_meta_data = 3;</code>
     */
    SnapshotMetaDataOrBuilder getSnapshotMetaDataOrBuilder();

    // optional string file_name = 4;
    /**
     * <code>optional string file_name = 4;</code>
     */
    boolean hasFileName();
    /**
     * <code>optional string file_name = 4;</code>
     */
    java.lang.String getFileName();
    /**
     * <code>optional string file_name = 4;</code>
     */
    com.google.protobuf.ByteString
    getFileNameBytes();

    // optional uint64 offset = 5;
    /**
     * <code>optional uint64 offset = 5;</code>
     */
    boolean hasOffset();
    /**
     * <code>optional uint64 offset = 5;</code>
     */
    long getOffset();

    // optional bytes data = 6;
    /**
     * <code>optional bytes data = 6;</code>
     */
    boolean hasData();
    /**
     * <code>optional bytes data = 6;</code>
     */
    com.google.protobuf.ByteString getData();

    // optional bool is_first = 7;
    /**
     * <code>optional bool is_first = 7;</code>
     */
    boolean hasIsFirst();
    /**
     * <code>optional bool is_first = 7;</code>
     */
    boolean getIsFirst();

    // optional bool is_last = 8;
    /**
     * <code>optional bool is_last = 8;</code>
     */
    boolean hasIsLast();
    /**
     * <code>optional bool is_last = 8;</code>
     */
    boolean getIsLast();
}
