package cn.carryshuai.one.设计模式.工厂.建造者;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/9/14 09:45
 * @Description:carry牌飞船
 */
public class CarryAirShipBuilder implements  AirShipBuilder{

    @Override
    public Engine builderEngine() {
        return new Engine("carry牌发动机");
    }

    @Override
    public EscapeTower builderEscapeTower() {
        return new EscapeTower("carry牌逃离出");
    }
}
