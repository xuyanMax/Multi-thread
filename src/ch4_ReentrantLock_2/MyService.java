package ch4_ReentrantLock_2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by xu on 2017/6/15.
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    public void methodA() {

        try {
            lock.lock();
            System.out.println("methodA begin threadname = "+Thread.currentThread().getName() + ", time = " + System.currentTimeMillis());
            Thread.sleep(1000);
            System.out.println("methodA end threadname = "+Thread.currentThread().getName() + ", time = " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
    public void methodB() {

        try {
            lock.lock();
            System.out.println("methodB begin threadname = "+Thread.currentThread().getName() + ", time = " + System.currentTimeMillis());
            Thread.sleep(1000);
            System.out.println("methodB end threadname = "+Thread.currentThread().getName() + ", time = " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
}
