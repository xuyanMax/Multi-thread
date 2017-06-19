package ch4_awaitUntil;

/**
 * Created by xu on 2017/6/19.
 */
public class MyThreadB extends Thread {
    private Service service;

    public MyThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.notifyMethod();
    }
}
