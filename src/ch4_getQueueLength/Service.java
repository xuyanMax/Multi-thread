package ch4_getQueueLength;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by xu on 2017/6/17.
 */
public class Service {
    public ReentrantLock lock = new ReentrantLock();
    public int i=0;
    public void serviceMethod1() {
        try{
            System.out.println(i++);
            lock.lock();
            System.out.println(Thread.currentThread().getName() + "进入方法！");
            Thread.sleep(2000);


        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
