package com.github.wenweihu86.raft;

import com.baidu.brpc.client.BrpcProxy;
import com.baidu.brpc.client.RpcClient;
import com.baidu.brpc.client.instance.Endpoint;
import com.github.wenweihu86.raft.proto.RaftProto;
import com.github.wenweihu86.raft.service.RaftConsensusServiceAsync;

/**
 * Created by wenweihu86 on 2017/5/5.
 * 描述的是集群中其他节点的信息
 */
public class Peer {
    private Server server;
    private RpcClient rpcClient;
    private RaftConsensusServiceAsync raftConsensusServiceAsync;
    // 需要发送给follower的下一个日志条目的索引值，只对leader有效 初始值为领导者最后的日志条目的索引+1
    private long nextIndex;
    // 已复制日志的最高索引值
    private long matchIndex;
    // 候选人赢得了此张选票时为真
    private volatile Boolean voteGranted;
    private volatile boolean isCatchUp;

    public Peer(Server server) {
        this.server = server;
        this.rpcClient = new RpcClient(new Endpoint(server.getEndpoint().getHost(), server.getEndpoint().getPort()));
        raftConsensusServiceAsync = BrpcProxy.getProxy(rpcClient, RaftConsensusServiceAsync.class);
        isCatchUp = false;
    }

    public Server getServer() {
        return server;
    }

    public RpcClient getRpcClient() {
        return rpcClient;
    }

    public RaftConsensusServiceAsync getRaftConsensusServiceAsync() {
        return raftConsensusServiceAsync;
    }

    public long getNextIndex() {
        return nextIndex;
    }

    public void setNextIndex(long nextIndex) {
        this.nextIndex = nextIndex;
    }

    public long getMatchIndex() {
        return matchIndex;
    }

    public void setMatchIndex(long matchIndex) {
        this.matchIndex = matchIndex;
    }

    public Boolean isVoteGranted() {
        return voteGranted;
    }

    public void setVoteGranted(Boolean voteGranted) {
        this.voteGranted = voteGranted;
    }


    public boolean isCatchUp() {
        return isCatchUp;
    }

    public void setCatchUp(boolean catchUp) {
        isCatchUp = catchUp;
    }
}
