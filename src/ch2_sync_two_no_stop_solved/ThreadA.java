package ch2_sync_two_no_stop_solved;


/**
 * Created by xu on 2017/6/1.
 */
public class ThreadA extends Thread{
    private Service service;
    public ThreadA (Service s){
        super();
        this.service = s;
    }
    @Override
    public void run() {
        service.methodA();
    }
}
