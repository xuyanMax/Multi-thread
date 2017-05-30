package t20_priority;

import java.util.Random;

/**
 * Created by xu on 2017/5/30.
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        long addResult = 0;
        for (int j=0; j<10; j++) {
            for (int i=0; i<50000; i++) {
                Random r = new Random();
                r.nextInt();
                addResult = addResult + 1;
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("*2*2*2*2*2* thread 2 use time " + (endTime - beginTime));
    }
}
