package com.github.wenweihu86.raft.admin;

import com.baidu.brpc.client.BrpcProxy;
import com.baidu.brpc.client.RpcClient;
import com.baidu.brpc.client.RpcClientOptions;
import com.github.wenweihu86.raft.Server;
import com.github.wenweihu86.raft.proto.Endpoint;
import com.github.wenweihu86.raft.proto.GetConfigurationResponse;
import com.github.wenweihu86.raft.proto.RaftProto;
import com.github.wenweihu86.raft.proto.base.ResCode;
import com.github.wenweihu86.raft.proto.builder.*;
import com.github.wenweihu86.raft.service.RaftClientService;
import com.google.protobuf.InvalidProtocolBufferException;
import com.googlecode.protobuf.format.JsonFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * 非线程安全
 * Created by wenweihu86 on 2017/5/14.
 */
public class RaftClientServiceProxy implements RaftClientService {
    private static final Logger LOG = LoggerFactory.getLogger(RaftClientServiceProxy.class);
    private static final JsonFormat jsonFormat = new JsonFormat();

    private List<Server> cluster;
    private RpcClient clusterRPCClient;
    private RaftClientService clusterRaftClientService;

    private Server leader;
    private RpcClient leaderRPCClient;
    private RaftClientService leaderRaftClientService;

    private RpcClientOptions rpcClientOptions = new RpcClientOptions();

    // servers format is 10.1.1.1:8888,10.2.2.2:9999
    public RaftClientServiceProxy(String ipPorts) {
        rpcClientOptions.setConnectTimeoutMillis(1000); // 1s
        rpcClientOptions.setReadTimeoutMillis(3600000); // 1hour
        rpcClientOptions.setWriteTimeoutMillis(1000); // 1s
        clusterRPCClient = new RpcClient(ipPorts, rpcClientOptions);
        clusterRaftClientService = BrpcProxy.getProxy(clusterRPCClient, RaftClientService.class);
        updateConfiguration();
    }

    @Override
    public GetLeaderResponse getLeader(GetLeaderRequest request) {
        return clusterRaftClientService.getLeader(request);
    }

    @Override
    public GetConfigurationResponse getConfiguration(GetConfigurationRequest request) {
        return clusterRaftClientService.getConfiguration(request);
    }

    @Override
    public AddPeersResponse addPeers(AddPeersRequest request) {
        AddPeersResponse response = leaderRaftClientService.addPeers(request);
        if (response != null && response.getResCode() == ResCode.RES_CODE_NOT_LEADER) {
            updateConfiguration();
            response = leaderRaftClientService.addPeers(request);
        }
        return response;
    }

    @Override
    public RemovePeersResponse removePeers(RemovePeersRequest request) {
        RemovePeersResponse response = leaderRaftClientService.removePeers(request);
        if (response != null && response.getResCode() == ResCode.RES_CODE_NOT_LEADER) {
            updateConfiguration();
            response = leaderRaftClientService.removePeers(request);
        }
        return response;
    }

    public void stop() {
        if (leaderRPCClient != null) {
            leaderRPCClient.stop();
        }
        if (clusterRPCClient != null) {
            clusterRPCClient.stop();
        }
    }

    private boolean updateConfiguration() {
        GetConfigurationRequest request = GetConfigurationRequest.newBuilder().build();
        GetConfigurationResponse response = clusterRaftClientService.getConfiguration(request);
        if (response != null && response.getResCode() == ResCode.RES_CODE_SUCCESS) {
            if (leaderRPCClient != null) {
                leaderRPCClient.stop();
            }
            leader = response.getLeader();
            leaderRPCClient = new RpcClient(convertEndPoint(leader.getEndpoint()), rpcClientOptions);
            leaderRaftClientService = BrpcProxy.getProxy(leaderRPCClient, RaftClientService.class);
            return true;
        }
        return false;
    }

    private com.baidu.brpc.client.instance.Endpoint convertEndPoint(Endpoint endPoint) {
        return new com.baidu.brpc.client.instance.Endpoint(endPoint.getHost(), endPoint.getPort());
    }

}
