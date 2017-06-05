package ch3_waitReleaseLock;

/**
 * Created by xu on 2017/6/5.
 */
public class Service {
    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("开始等待");
//              lock.wait();
                Thread.sleep(1000); //变同步方法

                System.out.println("结束等待");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
