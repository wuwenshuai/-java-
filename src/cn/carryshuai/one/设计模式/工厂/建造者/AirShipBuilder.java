package cn.carryshuai.one.设计模式.工厂.建造者;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/9/14 09:38
 * @Description:创建飞船对象
 */
public interface AirShipBuilder {
    Engine builderEngine();
    EscapeTower builderEscapeTower();
}
