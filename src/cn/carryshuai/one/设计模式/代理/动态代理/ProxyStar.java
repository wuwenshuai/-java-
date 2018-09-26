package cn.carryshuai.one.设计模式.代理.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/9/21 18:25
 * @Description:代理对象要有真实对象的引用
 */
public class ProxyStar implements InvocationHandler {
    private Star star;

    public ProxyStar(Star star) {
        this.star = star;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {


        System.out.println("执行前");
        method.invoke(star,args);
        System.out.println("执行后");
        return null;
    }
}
