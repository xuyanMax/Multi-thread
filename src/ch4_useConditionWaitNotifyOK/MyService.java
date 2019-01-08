package ch4_useConditionWaitNotifyOK;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by xu on 2017/6/15.
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void await() {
        lock.lock();
        try {
            System.out.println("await 开始时间=" + System.currentTimeMillis());
            // condition.await()前必须调用lock.lock()代表获得"同步监视器"
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signal() {
        lock.lock();
        try {
            System.out.println("signal 开始时间=" + System.currentTimeMillis());
            condition.signal();
        } finally {
            lock.unlock();
        }

    }

}
