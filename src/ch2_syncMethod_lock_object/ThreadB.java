package ch2_syncMethod_lock_object;

import ch2_t1.HasSelfPrivateNum;

/**
 * Created by xu on 2017/5/30.
 */
public class ThreadB extends Thread{
    private MyObject object;
    public ThreadB(MyObject obj) {
        super();
        this.object = obj;
    }

    @Override
    public void run() {
        super.run();
        object.methodA();
    }
}
