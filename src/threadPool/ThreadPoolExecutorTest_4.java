package threadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by xu on 04/09/2017.
 */
public class ThreadPoolExecutorTest_4 {
    public static void main(String[] args){

        System.out.println("main start");

        //延迟1秒后，每隔2秒执行一次
        ScheduledExecutorService scheduleThreadPool = Executors.newScheduledThreadPool(5);
        scheduleThreadPool.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("delay 3 seconds");
            }
        }, 1,2, TimeUnit.SECONDS);
    }
}
