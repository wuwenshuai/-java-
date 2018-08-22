package cn.carryshuai.one.List集合;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/8/22 16:05
 * @Description:
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义ArrayList集合
 */
public class MyArrayList {


    private int size;
    private Object[] elementData;

    public int getSize(){
        return size;
    }

    //判断是否为空
    public boolean isEmpty(){
        return size==0;
    }
    //构造函数
    public MyArrayList(){
        this(10);
    }
    public MyArrayList(int initialCapacity){
        if (initialCapacity<0){
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        //初始化数组
        elementData = new Object[initialCapacity];
    }

    //添加的信息
    public void add(Object object){
        //数组的扩容和数据的拷贝
        if (size==elementData.length){
            //需要扩容
            Object[] newArray = new Object[size*2+1];
            //数据拷贝
            System.arraycopy(elementData,0,newArray,0,newArray.length);
            elementData = newArray;
        }
        elementData[size+1] = object;
        size++;
    }

    //在指定的位置插入数据
    public void add(int index,Object object){
        rangCheck(index);
        //判断数组扩容
        ensureCapacity();
        System.arraycopy(elementData,index,elementData,index+1,size-index);
        elementData[index]=object;
        size++;


    }
    //数组扩容和拷贝
    public void ensureCapacity(){
        //数组的扩容和数据的拷贝
        if (size==elementData.length){
            //需要扩容
            Object[] newArray = new Object[size*2+1];
            //数据拷贝
            System.arraycopy(elementData,0,newArray,0,newArray.length);
            elementData = newArray;
        }
    }
    //判断
    public void rangCheck(int index){
        if (index>=size || index<0){
            try {
                throw new Exception();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        List list = new ArrayList();
        MyArrayList arrayList = new MyArrayList();
        arrayList.add("123");
        arrayList.add("123");
        arrayList.add("123");

        int size = arrayList.getSize();
        System.out.println(list.size());
    }
}
