package cn.carryshuai.one.io流;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/8/30 17:38
 * @Description:读取与写出文件(字节)
 */
public class Demo1 {

    public static void main(String[] args) throws Exception{
        //1建立联系：file对象
        File file = new File("");
        //2选择流
        InputStream inputStream = new FileInputStream(file);
        //3操作不断读取缓冲数组
        byte[] arr = new byte[1000];
        int len = 0;



    }
}
