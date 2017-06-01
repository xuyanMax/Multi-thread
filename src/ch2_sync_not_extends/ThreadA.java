package ch2_sync_not_extends;

import ch2_syncMethod_lock_object.MyObject;

/**
 * Created by xu on 2017/5/30.
 */
public class ThreadA extends Thread {
    private Sub sub;
    public ThreadA(Sub sub) {
        super();
        this.sub = sub;
    }

    @Override
    public void run() {
        super.run();
        sub.serviceMethod();
    }
}
