package ch4_ReadWriteLockBegin_3;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by xu on 2017/6/19.
 */
public class Service {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void read() {
        try {
            lock.readLock().lock();
            System.out.println("获得ReadLock" + Thread.currentThread().getName() + ", "
                    + System.currentTimeMillis());
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.readLock().unlock();
        }
    }

    public void write() {
        try {
            lock.writeLock().lock();
            System.out.println("获得WriteLock" + Thread.currentThread().getName() + ", "
                    + System.currentTimeMillis());
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.writeLock().unlock();
        }
    }
}
