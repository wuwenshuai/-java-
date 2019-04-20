package com.carry.并发常见的设计模式.ThreadLocal理解;

import java.util.concurrent.locks.Lock;

public class ActionContext {



    //第一个参数为threadlocal
    private static final ThreadLocal<Context> threadLocal = new ThreadLocal<Context>(){
        @Override
        protected Context initialValue() {
            return new Context();
        }
    };

    //定义该类为单例，使用静态内部类的方式去实现
    public static class ActionContextHandler{

        private final static ActionContext actionContext = new ActionContext();
    }

    //私有化构造函数
    private ActionContext(){

    }

    //提供一个方法
    public static ActionContext getActionContextInstance(){
       return ActionContextHandler.actionContext;
    }

    public Context getContext(){

        Context context = threadLocal.get();
        return context;
    }

}
