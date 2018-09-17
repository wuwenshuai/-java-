package cn.carryshuai.one.设计模式.单例;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/9/11 18:01
 * @Description:
 */

/**
 * 静态内部类实现单例模式
 * 优点：线程安全，调用效率高，并且实现了延迟加载
 */
public class SingleStaticInerClass {

    private SingleStaticInerClass(){

    }
    //静态内部类
    private static class SingleStaticIner{
        private static final SingleStaticInerClass instance = new SingleStaticInerClass();
    }
    //提供一个方法
    public static SingleStaticInerClass getInstance(){
        return SingleStaticIner.instance;
    }




}
