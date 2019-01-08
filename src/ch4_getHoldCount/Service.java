package ch4_getHoldCount;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by xu on 2017/6/17.
 */
public class Service {
    // 查询当前线程保持此锁定的个数，也就是调用lock()方法的次数

    private ReentrantLock lock = new ReentrantLock();
    public void serviceMethod1() {
        try{
            lock.lock();
            System.out.println("serviceMethod1 getHoldCount=" + lock.getHoldCount());
            serviceMethod2();
        }finally {
            lock.unlock();
        }
    }
    public void serviceMethod2() {
        try{
            lock.lock();
            System.out.println("serviceMethod2 getHoldCount=" + lock.getHoldCount());
            serviceMethod3();
        }finally {
            lock.unlock();
        }
    }

    public void serviceMethod3() {
        try{
            lock.lock();
            System.out.println("serviceMethod3 getHoldCount=" + lock.getHoldCount());
        }finally {
            lock.unlock();
        }
    }

}
