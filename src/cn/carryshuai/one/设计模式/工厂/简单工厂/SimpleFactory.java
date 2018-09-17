package cn.carryshuai.one.设计模式.工厂.简单工厂;

import cn.carryshuai.one.设计模式.工厂.AodiCar;
import cn.carryshuai.one.设计模式.工厂.CarInterface;
import cn.carryshuai.one.设计模式.工厂.DaZhongCar;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/9/12 09:38
 * @Description:
 */
public class SimpleFactory{

    public static CarInterface getCardFactory(String cardType){
        if (cardType=="aodi"){
            return new AodiCar();
        }else if (cardType=="dazhong"){
            return new DaZhongCar();
        }else {
            return null;
        }
    }

}
