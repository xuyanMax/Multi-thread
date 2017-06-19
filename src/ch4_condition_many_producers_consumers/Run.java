package ch4_condition_many_producers_consumers;

/**
 * Created by xu on 2017/6/15.
 */
public class Run {
     public static void main(String[] args) throws InterruptedException {
         /*交替打印- 会出现假死，唤醒同类
         * 解决方法
         *
         * signal->signalAll()后不会出现假死
         *
         *  有可能出现
         *  打印 ***消费***
            有可能------连续Thread-1
            有可能------连续Thread-3
            有可能------连续Thread-19
            有可能------连续Thread-17
            有可能------连续Thread-7
            有可能------连续Thread-15
            打印 **生产**

            原因是，程序使用了一个Condition对象，再结合signalAll()方法来唤醒所有的线程，那么唤醒的线程就有可能是同类，所以
            会出现连续打印"有可能------连续Thread-odd"的情况了。
         * */
         MyService service = new MyService();
         ThreadA[] a = new ThreadA[10];
         ThreadB[] b = new ThreadB[10];
         for (int i=0; i<10; i++) {
             a[i] = new ThreadA(service);//生产者线程0-2-4-6---18
             b[i] = new ThreadB(service);//消费者线程1-3-5-7---19
             a[i].start();
             b[i].start();

         }

         // important, otherwise, fake-death did not happen when following codes execute
         Thread.sleep(1000);

         Thread[] threadArray = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
         Thread.currentThread().getThreadGroup().enumerate(threadArray);
         for (int i=0; i<threadArray.length; i++) {
             System.out.println(threadArray[i].getName() + ", " + threadArray[i].getState());
         }

     }
}
