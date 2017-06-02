package ch2_sync_static_method;

/**
 * Created by xu on 2017/6/1.
 */
public class ThreadA extends Thread{

    @Override
    public void run() {
        Service.printA();
    }
}
