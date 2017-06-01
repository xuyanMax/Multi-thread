package ch2_syncLockIn_2;

/**
 * Created by xu on 2017/5/30.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        Sub sub = new Sub();
        sub.operateSub();
    }
}
