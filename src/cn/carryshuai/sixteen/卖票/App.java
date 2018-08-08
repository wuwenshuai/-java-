package cn.carryshuai.sixteen.卖票;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/8/7 17:17
 * @Description:
 */
public class App {
    public static void main(String[] args) throws Exception{
        //创建票池
        TicketPool ticketPool = new TicketPool();
        //创建线程对象
        Seller seller = new Seller("a",ticketPool);
        Seller seller1 = new Seller("b",ticketPool);
        Seller seller2 = new Seller("c",ticketPool);
        seller.start();
        seller1.start();
        seller2.start();
    }
}
