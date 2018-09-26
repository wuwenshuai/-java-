package cn.carryshuai.config;

import cn.carryshuai.bean.Person;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/9/18 14:04
 * @Description:
 */
//配置类==配置文件
@Configuration //告诉spring这是一个配置类

@ComponentScans(
        value = {
                @ComponentScan(value = "cn.carryshuai",includeFilters = {
                        @ComponentScan.Filter(type=FilterType.ANNOTATION,classes={Controller.class})
                },useDefaultFilters = false)
        }
)
public class PersonConfig {
    //给容器中注册一个bean，类型为返回值的类型，id默认是用方法名作为id
    @Bean("person1")
    public Person person(){
        return new Person("lii",22);
    }
}
