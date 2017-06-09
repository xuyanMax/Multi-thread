package ch3_wait_notify_one;

/**
 * Created by xu on 2017/6/5.
 */
public class Service {
    public void testMethod(Object lock) throws InterruptedException {
        synchronized (lock) {
            System.out.println("开始等待，线程名"+Thread.currentThread().getName());

            lock.wait();

            System.out.println("  结束等待，线程名"+Thread.currentThread().getName());
        }

    }

}
