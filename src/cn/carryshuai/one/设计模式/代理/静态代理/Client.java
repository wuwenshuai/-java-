package cn.carryshuai.one.设计模式.代理.静态代理;

import cn.carryshuai.one.反射.动态代理.ProxyFactory;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/9/21 09:38
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        RealStar realStar = new RealStar();
        ProxyStar proxyStar = new ProxyStar(realStar);
        proxyStar.sing();
    }
}
