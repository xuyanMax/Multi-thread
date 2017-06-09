package ch3_join_sleep_1;

/**
 * Created by xu on 2017/6/9.
 */
public class ThreadA extends Thread {
    private ThreadB b;

    public ThreadA(ThreadB b) {
        super();
        this.b = b;
    }

    @Override
    public void run() {
        try {
            synchronized (b) {
                b.start();
                Thread.sleep(6000);
                //Thread.sleep(6000); 不释放ThreadB 的对象锁
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
