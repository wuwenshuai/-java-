package cn.carryshuai.test;

import cn.carryshuai.Domain.Person;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.XStreamer;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import org.junit.Test;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/8/8 15:05
 * @Description:
 */
public class TestXmlStream {
    @Test
    public void test1(){

        //xml序列化
        Person bean=new Person("张三",19);
        XStream xStream = new XStream();
        String xml = xStream.toXML(bean);
        System.out.println(xml);

        //xml反序列化
        Person person = (Person) xStream.fromXML(xml);
        System.out.println(person);

        //<cn.carryshuai.Domain.Person>
        //  <name>张三</name>
        //  <age>19</age>
        //</cn.carryshuai.Domain.Person>

    }



    @Test
    //测试Xstream序列化XML
    public void test2(){

        Person bean=new Person("张三",19);
        XStream xStream = new XStream(new StaxDriver());
        xStream.alias("person",Person.class);
        //xml序列化
        String xml = xStream.toXML(bean);
        System.out.println(xml);

        //<?xml version="1.0" ?><person><name>张三</name><age>19</age></person>

    }
}

