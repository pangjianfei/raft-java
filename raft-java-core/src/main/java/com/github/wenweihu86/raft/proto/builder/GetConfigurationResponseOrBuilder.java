package com.github.wenweihu86.raft.proto.builder;

import com.github.wenweihu86.raft.Server;
import com.github.wenweihu86.raft.proto.RaftProto;
import com.github.wenweihu86.raft.proto.base.ResCode;

public interface GetConfigurationResponseOrBuilder
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

    // optional .raft.Server leader = 3;
    /**
     * <code>optional .raft.Server leader = 3;</code>
     */
    boolean hasLeader();
    /**
     * <code>optional .raft.Server leader = 3;</code>
     */
    Server getLeader();
    /**
     * <code>optional .raft.Server leader = 3;</code>
     */
    ServerOrBuilder getLeaderOrBuilder();

    // repeated .raft.Server servers = 4;
    /**
     * <code>repeated .raft.Server servers = 4;</code>
     */
    java.util.List<Server>
    getServersList();
    /**
     * <code>repeated .raft.Server servers = 4;</code>
     */
    Server getServers(int index);
    /**
     * <code>repeated .raft.Server servers = 4;</code>
     */
    int getServersCount();
    /**
     * <code>repeated .raft.Server servers = 4;</code>
     */
    java.util.List<? extends ServerOrBuilder>
    getServersOrBuilderList();
    /**
     * <code>repeated .raft.Server servers = 4;</code>
     */
    ServerOrBuilder getServersOrBuilder(
            int index);
}
