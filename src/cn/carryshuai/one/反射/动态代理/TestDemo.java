package cn.carryshuai.one.反射.动态代理;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/9/4 09:45
 * @Description:
 */
public class TestDemo {
    public static void main(String[] args) {
        //声明被代理类对象
        SupMain supMain = new SupMain();
        Object proxyInstance = ProxyFactory.getProxyInstance(supMain);//获取被代理对象
        HumMain humMain = (HumMain) proxyInstance;
        humMain.fly();
    }
}
