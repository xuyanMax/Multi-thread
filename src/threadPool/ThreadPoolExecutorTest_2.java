package threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by xu on 04/09/2017.
 */
public class ThreadPoolExecutorTest_2 {
     public static void main(String[] args){

         //每2秒打印nThreads个数字
         ExecutorService fixedThreadpool = Executors.newFixedThreadPool(3);

         for (int i=0; i<10; i++) {
             final int index = i;
             fixedThreadpool.execute(new Runnable() {
                 @Override
                 public void run() {
                     try {
                         System.out.println(Thread.currentThread().getName()+":"+index);
                         Thread.sleep(2000);
                     } catch (InterruptedException e) {
                         e.printStackTrace();
                     }
                 }
             });
         }
     }
}
