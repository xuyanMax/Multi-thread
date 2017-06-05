package ch3_waitReleaseLock;

/**
 * Created by xu on 2017/6/5.
 */
public class ThreadB extends Thread{
    private Object lock;

    public ThreadB(Object object) {
        super();
        this.lock = object;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}
