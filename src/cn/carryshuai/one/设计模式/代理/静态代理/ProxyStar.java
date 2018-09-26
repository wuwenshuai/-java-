package cn.carryshuai.one.设计模式.代理.静态代理;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/9/21 09:37
 * @Description:
 */
public class ProxyStar implements Star{

    private Star star;

    public ProxyStar(Star star) {
        this.star = star;
    }

    @Override
    public void bookTicket() {
        System.out.println("ProxyStar.bookTicket()");
    }

    @Override
    public void collectMoney() {
        System.out.println("ProxyStar.collectMoney()");
    }

    @Override
    public void confer() {
        System.out.println("ProxyStar.confer()");
    }

    @Override
    public void signContract() {
        System.out.println("ProxyStar.signContract()");
    }

    @Override
    public void sing() {
       star.sing();
    }
}
