package ch4_lockInterruptibly;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by xu on 2017/6/18.
 */
public class Service {
    public ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void waitMethod() {
        try{

            // lock.lockInterruptibly() 替换lock.lock()
            lock.lockInterruptibly();
//            lock.lock();
            System.out.println("lock begin " + Thread.currentThread().getName()+System.currentTimeMillis());
            for (int i=0; i<Integer.MAX_VALUE/10; i++) {
                String newString = new String();
                Math.random();
            }
            System.out.println("lock end " + Thread.currentThread().getName() + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (lock.isHeldByCurrentThread()) {
                lock.unlock();
            }
        }
    }
}
