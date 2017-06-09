package ch2_sync_two_no_stop_solved;


/**
 * Created by xu on 2017/6/1.
 */
public class ThreadB extends Thread{
    private Service service;
    public ThreadB (Service s){
        super();
        this.service = s;
    }
    @Override
    public void run() {
        service.methodB();
    }
}
