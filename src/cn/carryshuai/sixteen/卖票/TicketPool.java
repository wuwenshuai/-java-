package cn.carryshuai.sixteen.卖票;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/8/7 17:09
 * @Description:
 */
public class TicketPool {

    private int ticket = 100;
    //获得当前票

    public int getCurrentTicketNummber(){
        int temp = ticket;
        if (temp==0){
            return 0;
        }
        ticket--;
        return temp;

    };
}
