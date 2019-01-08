package ch2_volatile_AtomicInteger_unsafe;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by xu on 2017/6/4.
 */
public class MyService {
    public static AtomicLong aiRef = new AtomicLong();

     public void addNum() {
        System.out.println(Thread.currentThread().getName()+"加了100之后的值是："+aiRef.addAndGet(100));
        aiRef.addAndGet(1);
    }
}
