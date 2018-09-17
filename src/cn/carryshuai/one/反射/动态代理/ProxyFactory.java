package cn.carryshuai.one.反射.动态代理;

import java.lang.reflect.Proxy;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/9/4 09:33
 * @Description:
 */
public class ProxyFactory {
    //调用此方法，返回一个代理类对象
    public static Object getProxyInstance(Object object){
        MyInvocationHandler handler = new MyInvocationHandler();
        handler.bind(object);
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),handler);
    }
}
