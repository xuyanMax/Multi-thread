package ch3_wait_notify_one;

/**
 * Created by xu on 2017/6/5.
 */
public class Run {
    /*
    * 调用一个notify方法，线程notifyThread仅随机唤醒一个线程
    * 更改notifyThread的run方法：多次调用notify方法，或者调用notifyAll方法
    * */
     public static void main(String[] args) throws InterruptedException {
         Object lock = new Object();
         ThreadA a = new ThreadA(lock);
         ThreadB b = new ThreadB(lock);
         ThreadC c = new ThreadC(lock);
         a.start();
         b.start();
         c.start();
         Thread.sleep(1000);
         NotifyThread nt1 = new NotifyThread(lock);

         nt1.start();
     }
}
