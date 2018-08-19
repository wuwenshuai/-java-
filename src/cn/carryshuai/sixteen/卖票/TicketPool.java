package cn.carryshuai.sixteen.卖票;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/8/7 17:09
 * @Description:
 */
public class TicketPool {

    private int ticketNo = 100;
    //获得当前票

    public synchronized int getCurrentTicketNummber(){
        int temp = ticketNo;
        if (temp==0){
            return 0;
        }
        ticketNo--;
        return temp;

    };
}
