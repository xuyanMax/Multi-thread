package ch4_awaitUniterruptibly_1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by xu on 2017/6/18.
 */
public class Service {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void testMethod() {
        try {
            lock.lock();
            System.out.println("wait begin");

            condition.wait();

            System.out.println("wait end");
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("catch");
        } finally {
            lock.unlock();
        }
    }
}
