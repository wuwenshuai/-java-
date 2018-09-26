package cn.carryshuai;

import cn.carryshuai.bean.Person;
import cn.carryshuai.config.PersonConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/9/18 13:57
 * @Description:
 */
public class MainTest {
    public static void main(String[] args) {
        //加载Spring的配置文件
       /*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);*/


        ApplicationContext applicationContext1 = new AnnotationConfigApplicationContext(PersonConfig.class);
        Person person1 = applicationContext1.getBean(Person.class);
        System.out.println(person1);
        String[] names = applicationContext1.getBeanDefinitionNames();
        for (String name : names){
            System.out.println(name);
        }
    }

}
