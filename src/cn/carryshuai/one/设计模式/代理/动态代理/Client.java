package cn.carryshuai.one.设计模式.代理.动态代理;

import java.lang.reflect.Proxy;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/9/21 18:31
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        Star realStar = new RealStar();
        ProxyStar handler = new ProxyStar(realStar);
        Star proxy =(Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, handler);
        proxy.sing();
    }
}
