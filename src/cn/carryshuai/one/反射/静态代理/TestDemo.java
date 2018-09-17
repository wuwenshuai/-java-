package cn.carryshuai.one.反射.静态代理;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/8/31 18:58
 * @Description:
 */
public class TestDemo {

    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory(new NikeFactory());
        proxyFactory.product();
    }
}
