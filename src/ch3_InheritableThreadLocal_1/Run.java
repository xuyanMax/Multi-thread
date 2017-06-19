package ch3_InheritableThreadLocal_1;

/**
 * Created by xu on 2017/6/12.
 */
public class Run {
     public static void main(String[] args) throws InterruptedException {
         /*使用类InheritableThreadLocal可以在子线程中取得父线程继承下来的值*/
         for (int i=0; i<10; i++) {
             System.out.println(" main线程中取值="+ Tools.t1.get());
             Thread.sleep(100);
         }

         Thread.sleep(1000);
         ThreadA a = new ThreadA();
         a.start();

     }
}
