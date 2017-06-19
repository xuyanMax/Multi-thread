package ch4_useConditionWaitNotify;

/**
 * Created by xu on 2017/6/15.
 */
public class ThreadA extends Thread {
    private MyService service;

    public ThreadA(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.await();
    }
}
