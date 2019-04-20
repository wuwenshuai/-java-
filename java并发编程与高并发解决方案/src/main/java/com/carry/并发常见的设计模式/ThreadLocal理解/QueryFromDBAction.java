package com.carry.并发常见的设计模式.ThreadLocal理解;

public class QueryFromDBAction {
    public void execute() {

        try {
            Thread.sleep(1000);
            ActionContext.getActionContextInstance().getContext().setName("mysql");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
