package ch3_ThreadLocal_33;

/**
 * Created by xu on 2017/6/12.
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        try {
            for (int i=0; i<10; i++) {
                System.out.println("a 线程中取值="+ Tools.t1.get());
                Thread.sleep(100);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
