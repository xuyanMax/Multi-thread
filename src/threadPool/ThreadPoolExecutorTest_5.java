package threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by xu on 04/09/2017.
 */
public class ThreadPoolExecutorTest_5 {
    //单线程化的线程池，保证所有任务按顺序执行！！！
     public static void main(String[] args){
         ExecutorService singleThreadPool = Executors.newSingleThreadExecutor();
         for (int i=0; i<10; i++) {
             final int index = i;
             singleThreadPool.execute(new Runnable() {
                 @Override
                 public void run() {
                     try {
                         System.out.println(Thread.currentThread().getName()+" "+index);
                         Thread.sleep(1);
                     } catch (InterruptedException e) {
                         e.printStackTrace();
                     }
                 }
             });
         }
     }
}
