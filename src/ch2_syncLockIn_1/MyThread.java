package ch2_syncLockIn_1;

/**
 * Created by xu on 2017/5/30.
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        Service service = new Service();
        service.service1();
    }
}
