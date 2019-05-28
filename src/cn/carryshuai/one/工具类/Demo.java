package cn.carryshuai.one.工具类;

import java.util.Date;
import java.util.List;

public class Demo {


    public static void main(String[] args) {
        //测试工具类的一些方法

        ;
        List<String> strings = DateUtil.queryData(new Date(), new Date());
        System.out.println(strings);

    }
}
