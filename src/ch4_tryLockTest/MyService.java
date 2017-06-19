package ch4_tryLockTest;


import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by xu on 2017/6/18.
 */
public class MyService {
    private ReentrantLock lock = new ReentrantLock();

    public void waitMethod() {
        if (lock.tryLock()) {
            System.out.println( Thread.currentThread().getName() + "获得锁");
        } else {
            System.out.println( Thread.currentThread().getName() + "未或得锁");
        }
    }
}
