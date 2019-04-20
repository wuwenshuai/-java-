package com.carry.并发常见的设计模式.ThreadLocal理解;




public class ExecutionTask implements Runnable{

    private QueryFromDBAction queryAction = new QueryFromDBAction();

    private QueryFromHttpAction httpAction = new QueryFromHttpAction();
    @Override
    public void run() {
        queryAction.execute();
        System.out.println("The name query successful");
        httpAction.execute();
        System.out.println("The card id query successful");

        System.out.println("===========");
        //System.out.println(context.getName()+":"+context.getCardId());
        Context context = ActionContext.getActionContextInstance().getContext();
        System.out.println(context.getName()+":"+context.getCardId());


    }
}
