package cn.carry;


import org.apache.log4j.Logger;
import org.apache.zookeeper.*;
import org.apache.zookeeper.data.Stat;

public class Demo {
    //实例常量
    private static final String CONNECTSTRING = "192.168.25.100:2181";
    private static final String PATH = "/hellozk";
    private static final int SESSION_TIMEOUT = 20 * 1000;

    public static void main(String[] args) throws Exception{

        Demo demo = new Demo();
        ZooKeeper zk = demo.startZK();
        System.out.println(zk);

        //创建一个znode节点
        if (zk.exists(PATH,false)==null){

            demo.creatZnode(zk,"hellozk",PATH);
            System.out.println("创建了一个节点");

        }else {
            System.out.println("已经存在");
        }
        String znode = demo.getZnode(PATH, zk);
        System.out.println(znode);

        //关闭节点
        demo.stopZK(zk);


    }

    //zk新建
    public ZooKeeper startZK() throws Exception{
        return new ZooKeeper(CONNECTSTRING, SESSION_TIMEOUT, new Watcher() {

            public void process(WatchedEvent watchedEvent) {

            }
        });
    }

    //创建一个节点
    public void creatZnode(ZooKeeper zooKeeper,String data,String path) throws Exception {
        zooKeeper.create(path,data.getBytes(),ZooDefs.Ids.OPEN_ACL_UNSAFE,CreateMode.PERSISTENT);
    }

    //获取节点
    public String getZnode(String PATH,ZooKeeper zooKeeper ) throws KeeperException, InterruptedException {
        byte[] data = zooKeeper.getData(PATH, false, new Stat());
        String result = "";
        result = new String(data);
        return result;
    }

    //关闭节点
    public void stopZK(ZooKeeper zooKeeper) throws InterruptedException {
        if (zooKeeper!=null){
            zooKeeper.close();
            System.out.println("关闭节点");
        }

    }

}
