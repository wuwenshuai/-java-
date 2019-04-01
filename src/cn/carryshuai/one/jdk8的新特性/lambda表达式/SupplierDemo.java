package cn.carryshuai.one.jdk8的新特性.lambda表达式;

import java.util.function.Supplier;

/**
 * Supplier<T></>接口仅包含一个无参的方法： T get() 。用来获取一个泛型参数指定类型的对
 * 象数据。由于这是一个函数式接口，这也就意味着对应的Lambda表达式需要“对外提供”一个符合泛型类型的对象
 * 数据。
 */
public class SupplierDemo {


    //获取泛型类型的方法
    public static String getType(Supplier<String> supplier){
        return supplier.get();
    }
    //使用 Supplier 接口作为方法参数类型，通过Lambda表达式求出int数组中的最大值。提示：接口的泛型请使用
    //java.lang.Integer 类。

    //提供一个获取最大值的方法
    public static Integer getMax(Supplier<Integer> supplier){
        return supplier.get();
    }
    public static void main(String[] args) {
      /*  String type = getType(() -> {
            return "str";
        });
        System.out.println(type);*/

      //定义一个数组
        Integer[] arrays = {1,2,3,4,5,600,0,111,99};
       Integer max1 = getMax(()->{
            //让数组的第一个值给max
            int max  = arrays[0];
            //遍历数组
            for (Integer array : arrays) {
                if (array>max){
                    max = array;
                }
            }
            return max;
        });
        System.out.println(max1);
    }

}
