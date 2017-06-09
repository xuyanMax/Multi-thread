package ch3_join_sleep_2;

/**
 * Created by xu on 2017/6/9.
 */
public class Run {
     public static void main(String[] args) throws InterruptedException {
         /*对比sleep vs. join*/
         
         ThreadB b = new ThreadB();
         ThreadA a = new ThreadA(b); //线程a调用线程b的run()方法

         a.start();
         ThreadC c = new ThreadC(b);
         c.start();

     }
}
