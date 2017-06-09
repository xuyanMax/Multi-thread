package ch3_join_sleep_1;

/**
 * Created by xu on 2017/6/9.
 */
public class Run {
     public static void main(String[] args) throws InterruptedException {
         /*对比sleep vs. join*/
         //a线程使用sleep(6000)一直持有b对象的锁，因此c线程只有在a休眠6秒后释放b对象的锁时，才能调用b对象中的同步方法

         ThreadB b = new ThreadB();
         ThreadA a = new ThreadA(b); //线程a调用线程b的run()方法

         a.start();

         Thread.sleep(0);
         ThreadC c = new ThreadC(b);
         c.start();

     }
}
