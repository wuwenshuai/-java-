package com.carry.并发常见的设计模式.观察者模式.观察者案例1;


/**
 * 测试类
 */
public class ObserverClient {
    public static void main(String[] args) {
        WechatServer wechatServer = new WechatServer();
        Observer userzhang = new User("zhangsan");
        Observer lisi = new User("lisi");
        Observer userWang = new User("WangWu");
        wechatServer.registerObserver(userzhang);
        wechatServer.registerObserver(lisi);
        wechatServer.registerObserver(userWang);
        wechatServer.setInfomation("PHP是世界上最好用的语言");

        System.out.println("-----------------");
        wechatServer.removeObserver(lisi);
        wechatServer.setInfomation("JAVA是世界上最好用的语言！");
    }
}
