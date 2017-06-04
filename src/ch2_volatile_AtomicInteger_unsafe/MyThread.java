package ch2_volatile_AtomicInteger_unsafe;

/**
 * Created by xu on 2017/6/4.
 */
public class MyThread extends Thread {
    private MyService service;

    public MyThread(MyService service) {
        super();this.service = service;
    }


    @Override
    public void run() {
        service.addNum();
    }
}
