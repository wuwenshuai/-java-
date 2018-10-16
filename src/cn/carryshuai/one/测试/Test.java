package cn.carryshuai.one.测试;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
       testDemo(teacher);


    }
    public static void testDemo(final Teacher teacher){
        teacher.i++;
        System.out.println(teacher.i);
    }
}

class Teacher{
    public int i ;
}
