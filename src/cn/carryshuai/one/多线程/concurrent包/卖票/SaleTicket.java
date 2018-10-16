package cn.carryshuai.one.多线程.concurrent包.卖票;

public class SaleTicket  {

    public static void main(String[] args) {

        //资源类
        Ticket ticket = new Ticket();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i =0; i<100; i++){
                    ticket.seal();
                }

            }
        },"a").start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i =0; i<100; i++){
                    ticket.seal();
                }

            }
        },"b").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i =0; i<100; i++){
                    ticket.seal();
                }

            }
        },"c").start();
    }

}
