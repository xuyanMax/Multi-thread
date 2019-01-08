package ch4_condition_many_producers_consumers;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by xu on 2017/6/15.
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private boolean hasValue = false;

    public void set() {

        try {
            lock.lock();
            while (hasValue == true) {
                System.out.println("有可能++++++++连续" + Thread.currentThread().getName());
                condition.await();
            }
            System.out.println("打印 **生产**");
            hasValue = true;
//                condition.signal();
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void get() {

        try {
            lock.lock();
            while (hasValue == false) {
                System.out.println("有可能------连续" + Thread.currentThread().getName());
                condition.await();
            }
            System.out.println("打印 ***消费***");
            hasValue = false;
//            condition.signal();
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }


}
