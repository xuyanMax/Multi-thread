package ch4_tryLock_param;


import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by xu on 2017/6/18.
 */
public class MyService {
    private ReentrantLock lock = new ReentrantLock();

    public void waitMethod() {
        try {
            if (lock.tryLock(3, TimeUnit.SECONDS)) {
                System.out.println( Thread.currentThread().getName() + "获得锁, 时间="+System.currentTimeMillis());
                Thread.sleep(3); // 改变这个值，尝试
            } else {
                System.out.println( Thread.currentThread().getName() + "未或得锁");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (lock.isHeldByCurrentThread()) {
                lock.unlock();
            }
        }

    }
}
