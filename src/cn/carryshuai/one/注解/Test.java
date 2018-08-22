package cn.carryshuai.one.注解;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/8/19 16:09
 * @Description:
 */
public class Test {

    public static void main(String[] args) throws Exception {
        //通过反射获取注解类
        Class<?> clazz = Class.forName("cn.carryshuai.one.注解.SF");
        //获得类的所有注解
        Annotation[] annotations = clazz.getAnnotations();
        for (Annotation annotation : annotations){
            System.out.println(annotation);
        }
        //获得类的指定注解
        SfTable annotation = clazz.getAnnotation(SfTable.class);
        String value = annotation.value();
        System.out.println(value);

        //获得类的属性注解
        Field field = clazz.getDeclaredField("name");
        SfFiled sxtField = field.getAnnotation(SfFiled.class);
        System.out.println(sxtField.columnName()+"--"+sxtField.type()+"--"+sxtField.length());

        //根据获得的表名和字段信息拼出DDL语句
    }
}
