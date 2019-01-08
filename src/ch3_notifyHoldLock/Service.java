package ch3_notifyHoldLock;

/**
 * Created by xu on 2017/6/5.
 */
public class Service {
    public void testMethod(Object lock) throws InterruptedException {
        synchronized (lock) {
            System.out.println("开始等待，线程名" + Thread.currentThread().getName());
            lock.wait();
            System.out.println("  结束等待，线程名" + Thread.currentThread().getName());
        }
    }

    public void synNotifyMethod(Object lock) throws InterruptedException {
        synchronized (lock) {
            System.out.println("开始通知，线程名" + Thread.currentThread().getName());
            lock.notify();
            Thread.sleep(3000);
            System.out.println("  结束通知，线程名" + Thread.currentThread().getName());
        }
    }
}
