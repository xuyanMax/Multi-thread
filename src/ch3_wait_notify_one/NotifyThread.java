package ch3_wait_notify_one;


/**
 * Created by xu on 2017/6/5.
 */
public class NotifyThread extends Thread{
    private Object lock;

    public NotifyThread(Object object) {
        super();
        this.lock = object;
    }

    @Override
    public void run() {
        synchronized (lock) {
            lock.notify();
            lock.notify();
            lock.notify();
            lock.notify();
            lock.notify();
//            lock.notifyAll();

        }

    }
}
