package ch3_join_another_test;

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
                System.out.println("begin A thread=" + Thread.currentThread().getName() + ", "
                        + System.currentTimeMillis());
                Thread.sleep(1000);
                System.out.println("end A thread=" + Thread.currentThread().getName() + ", "
                        + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
