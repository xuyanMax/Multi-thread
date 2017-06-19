package ch4_isLocked;

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
            System.out.println(lock.isLocked());
            lock.lock();
            System.out.println(lock.isLocked());
        }finally {
            lock.unlock();
        }
    }
}
