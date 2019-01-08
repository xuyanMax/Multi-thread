package ch2_volatile_synchronized_alike;

/**
 * Created by xu on 2017/6/4.
 */
public class MyThreadA extends Thread {
    private Service service;

    public MyThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.startMethod();
    }
}
