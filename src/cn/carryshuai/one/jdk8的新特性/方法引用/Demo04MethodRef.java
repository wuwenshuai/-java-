package cn.carryshuai.one.jdk8的新特性.方法引用;

public class Demo04MethodRef {
    private static void printString(Printable lambda) {
        lambda.print("Hello");
    }

    public static void main(String[] args) {
        MethodRefObject obj = new MethodRefObject();
        printString(obj::printUpperCase);

        //使用lambda表达式
        printString((string)->{
            MethodRefObject methodRefObject = new MethodRefObject();
            methodRefObject.printUpperCase(string);
        });
    }
}