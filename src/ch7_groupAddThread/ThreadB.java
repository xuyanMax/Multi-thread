package ch7_groupAddThread;

/**
 * Created by xu on 09/07/2017.
 */
public class ThreadB extends Thread{
    @Override
    public void run() {
        try {
            while(!Thread.currentThread().isInterrupted()) {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(3000);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
