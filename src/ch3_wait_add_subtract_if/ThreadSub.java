package ch3_wait_add_subtract_if;

/**
 * Created by xu on 2017/6/7.
 */
public class ThreadSub extends Thread {
    private Subtract sub;

    public ThreadSub(Subtract sub) {
        super();
        this.sub = sub;
    }

    @Override
    public void run() {
        sub.subtract();
    }
}
