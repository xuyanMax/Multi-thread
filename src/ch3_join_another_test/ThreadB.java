package ch3_join_another_test;

/**
 * Created by xu on 2017/6/9.
 */
public class ThreadB extends Thread {

    @Override
    synchronized public void run() {

        try {
            System.out.println("begin B thread=" + Thread.currentThread().getName() + ", "
                    + System.currentTimeMillis());
            Thread.sleep(1000);
            System.out.println("end B thread=" + Thread.currentThread().getName() + ", "
                    + System.currentTimeMillis());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
