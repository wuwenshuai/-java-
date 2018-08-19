package cn.carryshuai.sixteen.卖票;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/8/7 17:08
 * @Description:
 */
public class Seller extends Thread{

    private String name;
    private TicketPool ticketPool;

    public Seller(String name,TicketPool ticketPool) {
        super();
        this.name = name;
        this.ticketPool = ticketPool;
    }

    @Override
    public void run() {


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        while (true){
            int nummber = ticketPool.getCurrentTicketNummber();
            if (nummber==0){
                return;
            }

            System.out.println(name+":"+nummber);
        }
    }
}
