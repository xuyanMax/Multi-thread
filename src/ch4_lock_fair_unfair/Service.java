package ch4_lock_fair_unfair;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by xu on 2017/6/17.
 */
public class Service {
    private ReentrantLock lock;

    public Service(boolean isFair) {
        super();

        this.lock = new ReentrantLock(isFair);
    }
    public void serviceMethod() {
        try{
            lock.lock();
            System.out.println(Thread.currentThread().getName() + " 获得锁定");
        } finally {
            lock.unlock();
        }
    }
}
