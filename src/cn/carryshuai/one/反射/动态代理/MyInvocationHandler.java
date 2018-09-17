package cn.carryshuai.one.反射.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/9/4 09:29
 * @Description:
 */
public class MyInvocationHandler implements InvocationHandler {

    //声明被代理对象
    Object object ;
    //实例化被代理类的对象
    public void  bind(Object object){
        this.object=object;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        HumanUtil humanUtil = new HumanUtil();
        humanUtil.method1();
        Object invoke = method.invoke(object, args);
        humanUtil.method2();
        return invoke;
    }
}
