package cn.carryshuai.one.反射;

import cn.carryshuai.one.反射.domain.Person;
import org.junit.Test;
import sun.reflect.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/8/31 14:15
 * @Description:
 */
public class Demo1 {

    @Test
    //获取Class的实例的四种方法
    public void test1() throws ClassNotFoundException {

        //1。运行时类的属性
        Class<Person> clazz1 = Person.class;
        System.out.println(clazz1);//class cn.carryshuai.one.反射.domain.Person


        //2.可以调用运行时类对象的getClass()
        Person person =new Person();
        Class<? extends Person> clazz2 = person.getClass();
        System.out.println(clazz2);//class cn.carryshuai.one.反射.domain.Person


        //3.调用Class类的静态方法：forName("className")
        Class<?> clazz3 = Class.forName("cn.carryshuai.one.反射.domain.Person");
        System.out.println(clazz3);//class cn.carryshuai.one.反射.domain.Person

        //4.使用类的加载器ClassLoader
        ClassLoader classLoader = Demo1.class.getClassLoader();
        Class<?> clazz4 = classLoader.loadClass("cn.carryshuai.one.反射.domain.Person");
        System.out.println(clazz4);


        System.out.println(clazz3==clazz4);
    }


    //通过反射，实现对类的创建，属性，方法的调用
    @Test
    public void test2() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<Person> clazz = Person.class;
        //通过反射调用指定的构造器，创建运行时类的对象
        Constructor<Person> constructor = clazz.getConstructor(String.class, int.class);
        Person person = constructor.newInstance("tom", 12);
        System.out.println(person);

        //通过反射，调用类的属性
        //只能获取到public的属性
        Field[] fields = clazz.getFields();
        System.out.println(fields.length);
        Field name = clazz.getField("name");
        System.out.println(name);


        //通过反射调用对象的指定的方法
        Method method = clazz.getMethod("show");
        method.invoke(person);

        //调用运行时类的私有构造器
        Constructor<Person> constructor1 = clazz.getDeclaredConstructor(String.class);
        constructor1.setAccessible(true);
        Person person1 = constructor1.newInstance("carry");
        System.out.println(person1);

        //调用私有属性
        Field age = clazz.getDeclaredField("age");
        //设置字段可访问，即暴力反射
        age.setAccessible(true);
        age.set(person1,23);
        System.out.println(person1);

    }
}
