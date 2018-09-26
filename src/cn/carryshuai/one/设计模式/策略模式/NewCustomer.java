package cn.carryshuai.one.设计模式.策略模式;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/9/26 09:33
 * @Description:
 */
public class NewCustomer implements StagePrice{
    @Override
    public double getPrice(double price) {
        System.out.println("新用户打九折");
        return price*0.9;
    }
}
