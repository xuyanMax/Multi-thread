package ch4_isFair;

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
            System.out.println("公平锁情况：" + lock.isFair());

        }finally {
            lock.unlock();
        }
    }
}
