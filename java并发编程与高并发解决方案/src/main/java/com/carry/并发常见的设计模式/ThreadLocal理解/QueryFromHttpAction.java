package com.carry.并发常见的设计模式.ThreadLocal理解;

public class QueryFromHttpAction {
    public void execute() {

        try {
            Thread.sleep(1000);
          ActionContext.getActionContextInstance().getContext().setCardId("1111111111");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
