package threadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by xu on 04/09/2017.
 */
public class ThreadPoolExecutorTest_3 {
    //scheduleThreadPool延迟执行实例
     public static void main(String[] args){
         System.out.println("main start");
         ScheduledExecutorService scheduleThreadPool = Executors.newScheduledThreadPool(5);
         scheduleThreadPool.schedule(new Runnable() {
             @Override
             public void run() {
                 System.out.println("delay 3 seconds");
             }
         }, 3, TimeUnit.SECONDS);
     }
}
