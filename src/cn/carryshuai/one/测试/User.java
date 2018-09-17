package cn.carryshuai.one.测试;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/8/28 17:02
 * @Description:
 */


public class User {
    private String age;
    private String name;

    public User(String age, String name) {
        this.age = age;
        this.name = name;
    }

    public User() {
    }

    public String getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age='" + age + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
