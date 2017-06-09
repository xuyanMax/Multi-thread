package ch3_join_long;

/**
 * Created by xu on 2017/6/9.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("begin time = "+System.currentTimeMillis());
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
