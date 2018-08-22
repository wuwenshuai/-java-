package cn.carryshuai.one.注解;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/8/19 16:23
 * @Description:
 */

@SfTable(value = "sf_stu")
public class SF {


    @SfFiled(columnName = "age",length = 3,type = "int")
    private int age;
    @SfFiled(columnName = "name",length = 3,type = "int")
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
