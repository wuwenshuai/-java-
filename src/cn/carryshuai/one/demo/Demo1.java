package cn.carryshuai.one.demo;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Demo1 {


    @Test
    //反射可以越过泛型检查
    public void test1() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        //利用反射
        Class<? extends List> listClass = list.getClass();
        Method method = listClass.getMethod("add", Object.class);
        method.invoke(list,"彪子");
        System.out.println(list);
    }

    @Test
    //测试从属性文件获取
    public void test2() throws Exception {
        // //从spring.txt中获取类名称和方法名称
        File file = new File("C:\\Users\\old\\IdeaProjects\\-java-\\src\\cn\\carryshuai\\one\\demo\\spring.txt");
        Properties springConfig= new Properties();
        springConfig.load(new FileInputStream(file));
        String className = (String) springConfig.get("class");
        String methodName = (String) springConfig.get("method");
        //根据类名创建对象
        Class<?> clazz = Class.forName(className);
        Method method = clazz.getMethod(methodName);
        //获取构造器
        Constructor c = clazz.getConstructor();
        //根据构造器，实例化出对象
        Object service = c.newInstance();
        //调用对象的指定方法
        method.invoke(service);
    }
}
