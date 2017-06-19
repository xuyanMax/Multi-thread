package ch4_hasWaiters;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by xu on 2017/6/17.
 */
public class Service {
    public ReentrantLock lock = new ReentrantLock(true);
    public Condition condition = lock.newCondition();

    public void waitMethod() {
        try{
            System.out.println(Thread.currentThread().getName()+"获取锁");//非临界区
            lock.lock();//临界区

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
            System.out.println("没有线程正在等待 condition？"+lock.hasWaiters(condition) + ", 线程多少？"
                    + lock.getWaitQueueLength(condition));
            condition.signal();
        }
        finally {
            lock.unlock();
        }

    }
}
