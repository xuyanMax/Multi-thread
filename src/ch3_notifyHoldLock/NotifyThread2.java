package ch3_notifyHoldLock;

/**
 * Created by xu on 2017/6/5.
 */
public class NotifyThread2 extends Thread {
    private Object lock;

    public NotifyThread2(Object object) {
        super();
        this.lock = object;
    }

    @Override
    public void run() {
        Service service = new Service();
        try {
            service.synNotifyMethod(lock);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
