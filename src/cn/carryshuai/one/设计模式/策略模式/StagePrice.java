package cn.carryshuai.one.设计模式.策略模式;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/9/26 09:30
 * @Description:
 */
public interface StagePrice {

    //计算需要付的价钱
    double getPrice(double price);
}
