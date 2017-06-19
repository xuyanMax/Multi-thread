package ch4_ReentrantLock;

/**
 * Created by xu on 2017/6/15.
 */
public class MyThread extends Thread{
    private MyService service;
    public MyThread(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
