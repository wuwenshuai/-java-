package cn.carryshuai.one.反射.domain;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/8/31 14:18
 * @Description:
 */
public class Person {

    public String name;
    private int age;

    public Person(){
        System.out.println("Person()");
    }
    private Person(String name){
        this.name = name;
    }

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void show(){
        System.out.println("name = " + name + ",age = " + age);
    }

    public String info(){
        return name + ":" + age;
    }

    private String display(String nation){
        System.out.println("我是" + nation + "国家的人");
        return nation;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

}
