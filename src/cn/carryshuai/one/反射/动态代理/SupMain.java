package cn.carryshuai.one.反射.动态代理;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/9/4 09:23
 * @Description:
 */

/**
 * 实现动态代理需要解决两个问题
 * 1：如何根据加载到内存的被代理对象，动态的去创建代理类的对象
 * 2：如何通过代理类的对象调用接口中声明的方法时，实现被代理类对象的同名方法的调用
 */
public class SupMain implements HumMain{
    @Override
    public void fly() {
        System.out.println("我是超人，我想飞");
    }
}
