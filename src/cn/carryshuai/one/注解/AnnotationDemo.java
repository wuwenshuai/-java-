package cn.carryshuai.one.注解;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/8/19 12:13
 * @Description:
 */


//target:用于描述注解的作用范围：即注解可以用在包还是类或者是方法上等：取值：ElementType
//retention:该注解用于什么级别保存该注解，用于描述注解的生命周期:RetentionPolicy.RUNTIME在运行时有效
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotationDemo {

    String name() default "";
    //
}
