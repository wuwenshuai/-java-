package cn.carryshuai.one.设计模式.工厂.工厂方法;

import cn.carryshuai.one.设计模式.工厂.AodiCar;
import cn.carryshuai.one.设计模式.工厂.CarInterface;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/9/12 17:44
 * @Description:
 */
public class AodiFactory implements CardFactory {

    @Override
    public CarInterface getcard() {
        return new AodiCar();
    }
}
