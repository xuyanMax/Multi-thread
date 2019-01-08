package ch4_awaitUniterruptibly_2;

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

//            condition.wait();
            condition.awaitUninterruptibly();

            System.out.println("wait end");
/*
        } catch (InterruptedException e) {
            e.printStackTrace();
      */
        } finally {
            lock.unlock();
        }
    }

    public void signal() {
        //serr
        condition.signal();
    }
}
