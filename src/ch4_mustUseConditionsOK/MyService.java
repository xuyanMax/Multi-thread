package ch4_mustUseConditionsOK;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by xu on 2017/6/15.
 */
public class MyService {
    private Lock lock = new ReentrantLock();

    // more conditions
    private Condition conditionA = lock.newCondition();
    private Condition conditionB = lock.newCondition();

    public void awaitA() {
        try {
            lock.lock();
            System.out.println("begin awaitA time = " + System.currentTimeMillis() + ", thread=" + Thread.currentThread().getName());
            conditionA.await();
            System.out.println("  end awaitA time = " + System.currentTimeMillis() + ", thread=" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    public void awaitB() {
        try {
            lock.lock();
            System.out.println("begin awaitB time = " + System.currentTimeMillis() + ", thread=" + Thread.currentThread().getName());
            conditionB.await();
            System.out.println("  end awaitB time = " + System.currentTimeMillis() + ", thread=" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    public void signalAll_A() {
        try {
            lock.lock();
            System.out.println("signalAll_A time = " + System.currentTimeMillis() + ", thread=" + Thread.currentThread().getName());

            conditionA.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void signalAll_B() {
        try {
            lock.lock();
            System.out.println("signalAll_B time = " + System.currentTimeMillis() + ", thread=" + Thread.currentThread().getName());

            conditionB.signalAll();
        } finally {
            lock.unlock();
        }

    }
}

