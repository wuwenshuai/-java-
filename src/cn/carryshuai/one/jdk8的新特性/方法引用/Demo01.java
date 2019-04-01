package cn.carryshuai.one.jdk8的新特性.方法引用;

/**
 * 通过对象名引用成员方法
 */
public class Demo01 {

    public static void main(String[] args) {

        printString((string)->{
            System.out.println(string);
        });
      //  printString(System.out::print("ca"));
        printString(System.out::print);
    }

    public static void printString(Printable printable){
        printable.print("helloworld");
    }
}
