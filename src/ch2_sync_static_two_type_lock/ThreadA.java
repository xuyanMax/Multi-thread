package ch2_sync_static_two_type_lock;

/**
 * Created by xu on 2017/6/1.
 */
public class ThreadA extends Thread{
    private Service service;
    public ThreadA (Service c) {
        super();
        this.service = c;
    }

    @Override
    public void run() {
        service.printA();
    }
}
