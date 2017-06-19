package ch3_ThreadLocal_33;

/**
 * Created by xu on 2017/6/12.
 */
public class Run {
     public static void main(String[] args) throws InterruptedException {
         for (int i=0; i<10; i++) {
             System.out.println(" main线程中取值="+ Tools.t1.get());
             Thread.sleep(100);
         }
         Thread.sleep(1000);
         ThreadA a = new ThreadA();
         a.start();

     }
}
