package ch2_sync_static_two_type_lock;

/**
 * Created by xu on 2017/6/1.
 */
public class ThreadB extends Thread{
    private Service service;
    public ThreadB (Service c) {
        super();
        this.service = c;
    }

    @Override
    public void run() {
        service.printB();
    }
}
