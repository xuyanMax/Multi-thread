package ch7_stateTest_4;

/**
 * Created by xu on 09/07/2017.
 */
public class MyThread extends Thread {
    @Override
    public void run() {

            try {
                synchronized (Lock.lock) {
                    Lock.lock.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
}
