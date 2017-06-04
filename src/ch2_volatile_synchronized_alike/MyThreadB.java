package ch2_volatile_synchronized_alike;

/**
 * Created by xu on 2017/6/4.
 */
public class MyThreadB extends Thread {
    private Service service;

    public MyThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.stopMethod();
    }
}
