package cn.carryshuai.config;

import cn.carryshuai.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/9/19 09:29
 * @Description:
 */

@Configuration
public class LifeConfig {

    @Bean(initMethod = "init",destroyMethod = "destory")
    public Car car(){
        return new Car();
    }
}
