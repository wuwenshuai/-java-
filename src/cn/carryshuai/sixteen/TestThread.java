package cn.carryshuai.sixteen;

import org.junit.Test;

/**
 * @Auther: wuwenshuai
 * @Date: 2018/8/7 16:40
 * @Description:
 */
public class TestThread {

    @Test
    public void test(){
        new myThread("t1").start();
        new myThread("t2").start();
        new myThread("t3").start();
        new myThread("t4").start();




    }


    class myThread extends Thread{

        private String name ;

        public myThread(String name) {
            this.name = name;
        }

        public myThread(String name, String name1) {
            super(name);
            this.name = name1;
        }

        @Override
        public void run() {
            for (int i = 0; i <100; i++) {

                System.out.println(this.name+ " -------- " + i);
                yield();//放弃cpu的抢占权

            }
        }
    }
}
