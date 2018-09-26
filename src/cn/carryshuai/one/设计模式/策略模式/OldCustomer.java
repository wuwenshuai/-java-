package cn.carryshuai.one.设计模式.策略模式;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/9/26 09:32
 * @Description:
 */
public class OldCustomer implements StagePrice{
    @Override
    public double getPrice(double price) {
        System.out.println("老用户可以打八则");
        return price*0.8;
    }
}
