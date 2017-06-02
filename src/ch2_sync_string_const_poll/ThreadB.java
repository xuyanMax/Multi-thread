package ch2_sync_string_const_poll;

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
        service.print("AA");
    }
}
