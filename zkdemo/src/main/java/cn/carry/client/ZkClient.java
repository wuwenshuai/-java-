package cn.carry.client;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * zk客户端
 */
public class ZkClient {


    private static String connectString = "192.168.25.100:2181";
    private static int sessionTimeout = 2000;
    private ZooKeeper zk = null;
    private String parentNode = "/servers";
    private volatile ArrayList<String> serversList = new ArrayList<>();

    //获取zk连接
    //获取server节点上的数据
    //业务逻辑

    public void getConnect() throws IOException {
        zk = new ZooKeeper(connectString, sessionTimeout, new Watcher() {

            @Override
            public void process(WatchedEvent event) {

                // 再次启动监听
                try {

                    getServerList();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public void getServerList() throws Exception {

        // 获取服务器子节点信息，并且对父节点进行监听
        List<String> children = zk.getChildren(parentNode, true);
        ArrayList<String> servers = new ArrayList<String>();

        for (String child : children) {
            byte[] data = zk.getData(parentNode + "/" + child, false, null);

            servers.add(new String(data));
        }

        // 把servers赋值给成员serverList，已提供给各业务线程使用
        serversList = servers;

        System.out.println(serversList);
    }

    // 业务功能
    public void business() throws Exception {
        System.out.println("client is working ...");
    }

    public static void main(String[] args) throws Exception{
        // 获取zk连接
        ZkClient client = new ZkClient();

        client.getConnect();

        // 获取servers的子节点信息，从中获取服务器信息列表
        client.getServerList();

        // 业务进程启动
        client.business();
    }

}
