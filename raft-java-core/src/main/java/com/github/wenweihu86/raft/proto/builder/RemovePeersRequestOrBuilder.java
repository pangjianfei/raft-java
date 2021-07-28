package com.github.wenweihu86.raft.proto.builder;

import com.github.wenweihu86.raft.Server;
import com.github.wenweihu86.raft.proto.RaftProto;

public interface RemovePeersRequestOrBuilder
        extends com.google.protobuf.MessageOrBuilder {

    // repeated .raft.Server servers = 1;
    /**
     * <code>repeated .raft.Server servers = 1;</code>
     */
    java.util.List<Server>
    getServersList();
    /**
     * <code>repeated .raft.Server servers = 1;</code>
     */
    Server getServers(int index);
    /**
     * <code>repeated .raft.Server servers = 1;</code>
     */
    int getServersCount();
    /**
     * <code>repeated .raft.Server servers = 1;</code>
     */
    java.util.List<? extends ServerOrBuilder>
    getServersOrBuilderList();
    /**
     * <code>repeated .raft.Server servers = 1;</code>
     */
    ServerOrBuilder getServersOrBuilder(
            int index);
}
