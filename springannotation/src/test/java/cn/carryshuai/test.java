package cn.carryshuai;

import cn.carryshuai.bean.Car;
import cn.carryshuai.config.LifeConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/9/19 09:35
 * @Description:
 */
public class test {

    @Test
    public void testBeanLife(){
       //加载ioc容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(LifeConfig.class);
        Object car = applicationContext.getBean("car");
        //销毁对象
        applicationContext.close();

    }
}
