package cn.carryshuai.one.注解;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/8/19 16:29
 * @Description:
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SfFiled {
    String columnName();
    int length();
    String type();
}
