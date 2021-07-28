package com.github.wenweihu86.raft.util;

import com.github.wenweihu86.raft.Configuration;
import com.github.wenweihu86.raft.Server;
import com.github.wenweihu86.raft.proto.RaftProto;

import java.util.List;

/**
 * Created by wenweihu86 on 2017/5/22.
 */
public class ConfigurationUtils {

    // configuration不会太大，所以这里直接遍历了
    public static boolean containsServer(Configuration configuration, int serverId) {
        for (Server server : configuration.getServersList()) {
            if (server.getServerId() == serverId) {
                return true;
            }
        }
        return false;
    }

    public static Configuration removeServers(
            Configuration configuration, List<Server> servers) {
        Configuration.Builder confBuilder = Configuration.newBuilder();
        for (Server server : configuration.getServersList()) {
            boolean toBeRemoved = false;
            for (Server server1 : servers) {
                if (server.getServerId() == server1.getServerId()) {
                    toBeRemoved = true;
                    break;
                }
            }
            if (!toBeRemoved) {
                confBuilder.addServers(server);
            }
        }
        return confBuilder.build();
    }

    public static Server getServer(Configuration configuration, int serverId) {
        for (Server server : configuration.getServersList()) {
            if (server.getServerId() == serverId) {
                return server;
            }
        }
        return null;
    }

}
