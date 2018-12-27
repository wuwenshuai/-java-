package cn.carry.server;


import org.apache.zookeeper.*;

import java.io.IOException;

/**
 * zk的服务端
 */
public class ZkServer {

    private static String connectString = "192.168.25.100:2181";
    private static int sessionTimeout = 2000;
    private ZooKeeper zk = null;
    private String parentNode = "/servers";

    public static void main(String[] args) throws Exception{
        // 获取zk连接
        ZkServer server = new ZkServer();
        server.getConnection();

        // 利用zk连接注册服务器信息
        server.registerServer("192.168.25.100");

        // 启动业务功能
        server.business("192.168.25.100");
    }



    //1.创建连接
    public void getConnection() throws Exception {

        zk = new ZooKeeper(parentNode, sessionTimeout, new Watcher() {
            public void process(WatchedEvent event) {
                System.out.println("监听创建连接");
            }
        });

    }
    //2注册
    public void registerServer(String hostName) throws Exception {
        String create = zk.create(parentNode + "/server", hostName.getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL_SEQUENTIAL);
        System.out.println(hostName +" is noline "+ create);
    }
    //启动业务服务

    // 业务功能
    public void business(String hostname) throws Exception{
        System.out.println(hostname+" is working ...");

        Thread.sleep(Long.MAX_VALUE);
    }
}
