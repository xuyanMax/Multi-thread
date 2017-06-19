package ch4_awaitUniterruptibly_2;

/**
 * Created by xu on 2017/6/18.
 */
public class MyThread extends Thread {
    private Service service;

    public MyThread(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
