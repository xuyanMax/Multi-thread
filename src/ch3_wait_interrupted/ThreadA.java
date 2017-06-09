package ch3_wait_interrupted;

/**
 * Created by xu on 2017/6/5.
 */
public class ThreadA extends Thread {
    private Object lock;

    public ThreadA(Object object) {
        super();
        this.lock = object;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}
