package ch3_join_sleep_2;

/**
 * Created by xu on 2017/6/9.
 */
public class ThreadC extends Thread{
    private ThreadB b;

    public ThreadC(ThreadB b) {
        super();
        this.b = b;
    }

    @Override
    public void run() {
        b.bService();
    }
}
