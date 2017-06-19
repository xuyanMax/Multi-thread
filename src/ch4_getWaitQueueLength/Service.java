package ch4_getWaitQueueLength;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by xu on 2017/6/17.
 */
public class Service {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void waitMethod() {
        try{
            lock.lock();
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void notifyMethod() {
        try{
            lock.lock();
            System.out.println("有"+lock.getWaitQueueLength(condition) + "个线程层正在等待 condition");
            condition.signalAll();
        }
         finally {
            lock.unlock();
        }

    }
}
