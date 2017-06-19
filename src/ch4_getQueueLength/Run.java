package ch4_getQueueLength;

/**
 * Created by xu on 2017/6/17.
 */
public class Run {
     public static void main(String[] args) throws InterruptedException {
         /*返回正等待此锁定的线程的估计数
         *
         * 本例中，是个线程，九个线程在等待其中一个睡眠的线程释放锁
         * */
         final Service service = new Service();
         Runnable runnable = new Runnable() {
             @Override
             public void run() {
                 System.out.println("线程"+Thread.currentThread().getName()+"运行中");
                 service.serviceMethod1();
             }
         };
         Thread[] threadArray = new Thread[10];
         for (int i=0; i<10; i++) {
             threadArray[i] =  new Thread(runnable);
         }
         for (Thread thread : threadArray)
             thread.start();

         Thread.sleep(2000);
         System.out.println("有线程数："+ service.lock.getQueueLength() + "在等待获取锁！");

     }
}
