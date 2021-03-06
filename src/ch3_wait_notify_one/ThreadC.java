package ch3_wait_notify_one;

import ch3_notifyHoldLock.Service;

/**
 * Created by xu on 2017/6/5.
 */
public class ThreadC extends Thread {
    private Object lock;

    public ThreadC(Object object) {
        super();
        this.lock = object;
    }

    @Override
    public void run() {
        Service service = new Service();
        try {
            service.testMethod(lock);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
