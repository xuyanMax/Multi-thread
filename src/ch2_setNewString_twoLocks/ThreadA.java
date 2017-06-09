package ch2_setNewString_twoLocks;

/**
 * Created by xu on 2017/6/1.
 */
public class ThreadA extends Thread{
    private MyService service;
    public ThreadA (MyService s){
        super();
        this.service = s;
    }
    @Override
    public void run() {
        service.testMethod();
    }
}
