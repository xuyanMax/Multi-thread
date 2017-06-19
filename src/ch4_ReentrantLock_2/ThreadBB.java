package ch4_ReentrantLock_2;

/**
 * Created by xu on 2017/6/15.
 */
public class ThreadBB extends Thread {
    private MyService service;

    public ThreadBB(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.methodB();
    }
}
