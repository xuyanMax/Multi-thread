package ch4_awaitUntil;

/**
 * Created by xu on 2017/6/19.
 */
public class MyThreadA extends Thread {
    private Service service;

    public MyThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.waitMethod();
    }
}
