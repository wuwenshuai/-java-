package cn.carryshuai.one.归档和解档;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/8/7 10:48
 * @Description:
 */
public class Archiver {

    //hehehhe
    //呵呵呵
    //我噢噢噢噢噢噢
    //qqqqqqq
    /**
     * 归档
     */
    @Test
    public void testZip() throws Exception{
        //文件输出流
        FileOutputStream fos = new FileOutputStream("/Users/admin/Desktop/test/a.zip");
        String s = fos.toString();
        System.out.println(s);
        //压缩流
        ZipOutputStream zos = new ZipOutputStream(fos);
        //需要压缩的文件
        String[] arr = {
              "/Users/admin/Desktop/test/1.md",
                "/Users/admin/Desktop/test/2.jpg"
        };
        for (String path : arr){
            File f = new File(path);
            //循环向zos中添加条目
            zos.putNextEntry(new ZipEntry(f.getName()));
            FileInputStream fis = new FileInputStream(f);
            byte[] bytes = new byte[fis.available()];
            fis.read(bytes);
            fis.close();
            zos.write(bytes);
            zos.closeEntry();
        }

    }

    /**
     * 解压test
     */

    @Test
    public void testUnZip() throws Exception{

        FileInputStream fis = new FileInputStream("/Users/admin/Desktop/test/a.zip");
        ZipInputStream zis = new ZipInputStream(fis);
        ZipEntry entry = null ;
        byte[] buf = new byte[1024];
        int len = 0 ;
        while((entry = zis.getNextEntry()) != null){
            String name = entry.getName();
            System.out.println(name);
            FileOutputStream fos = new FileOutputStream("/Users/admin/Desktop/test/" + name);
            while((len = zis.read(buf)) != -1){
                fos.write(buf, 0, len);
            }
            fos.close();
        }
        zis.close();
        fis.close();
        System.out.println("解压结束");

    }
}
