package com.github.wenweihu86.raft.service;

import com.baidu.brpc.client.RpcCallback;
import com.github.wenweihu86.raft.proto.RaftProto;
import com.github.wenweihu86.raft.proto.builder.*;

import java.util.concurrent.Future;

/**
 * 用于生成client异步调用所需的proxy
 * Created by wenweihu86 on 2017/5/2.
 */
public interface RaftConsensusServiceAsync extends RaftConsensusService {

    Future<VoteResponse> preVote(
            VoteRequest request,
            RpcCallback<VoteResponse> callback);

    Future<VoteResponse> requestVote(
            VoteRequest request,
            RpcCallback<VoteResponse> callback);

    Future<AppendEntriesResponse> appendEntries(
            AppendEntriesRequest request,
            RpcCallback<AppendEntriesResponse> callback);

    Future<InstallSnapshotResponse> installSnapshot(
            InstallSnapshotRequest request,
            RpcCallback<InstallSnapshotResponse> callback);
}
