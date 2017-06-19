package ch4_lock_fair_unfair;

/**
 * Created by xu on 2017/6/17.
 */
public class RunNotFair {
     public static void main(String[] args){
         /*运行结果基本上是乱序的说明先启动start()的线程不代表先获得锁*/
         final Service service = new Service(false);
         Runnable runnable = new Runnable() {
             @Override
             public void run() {
                 System.out.println("线程"+Thread.currentThread().getName()+"运行中");
                 service.serviceMethod();
             }
         };
         Thread[] threadArray = new Thread[10];
         for (int i=0; i<10; i++) {
             threadArray[i] =  new Thread(runnable);
         }
         for (Thread thread : threadArray)
             thread.start();
     }
}
