package cn.carryshuai.one.反射;

import java.lang.reflect.Field;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/8/16 16:01
 * @Description:
 */
public class ReflectDemo {


    public static void main(String[] args) throws Exception {

        //A a=new A();
        //Field field=A.class.getDeclaredField("m");//根据变量名m获得字段
        //field.setAccessible(true);//设置字段可访问，即暴力反射
        //String m=(String)field.get(a);//在那个对象上获取此字段的值
        //System.out.println(m);


        User user = new User();
        user.setAge(10);
        user.setName("tony");
        Field field = User.class.getDeclaredField("name");
        field.setAccessible(true);
        String name = (String) field.get(user);
        System.out.println(name);
    }






}

class User{

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
