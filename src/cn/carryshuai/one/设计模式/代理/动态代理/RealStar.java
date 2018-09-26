package cn.carryshuai.one.设计模式.代理.动态代理;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/9/21 09:34
 * @Description:
 */
public class RealStar implements Star {
    @Override
    public void bookTicket() {
        System.out.println("RealStar.bookTicket()");
    }

    @Override
    public void collectMoney() {
        System.out.println("RealStar.collectMoney()");
    }

    @Override
    public void confer() {
        System.out.println("RealStar.confer()");
    }

    @Override
    public void signContract() {
        System.out.println("RealStar.signContract()");
    }

    @Override
    public void sing() {
        System.out.println("RealStar(周杰伦本人).sing()");
    }
}
