package ch2_volatile_AtomicIntegerTest;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by xu on 2017/6/4.
 */
public class AddCountThread extends Thread{
    private AtomicInteger count = new AtomicInteger();

    @Override
    public void run() {
        for (int i=0; i<100; i++)
            System.out.println("count="+count.incrementAndGet());
    }
}
