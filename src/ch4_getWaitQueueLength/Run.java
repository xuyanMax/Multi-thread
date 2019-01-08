package ch4_getWaitQueueLength;

/**
 * Created by xu on 2017/6/17.
 */
public class Run {
    //返回等待与此锁定相关的给定条件Condition的线程估计数

    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.waitMethod();
            }
        };
        Thread[] threadArray = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threadArray[i] = new Thread(runnable);
        }
        for (Thread thread : threadArray)
            thread.start();

        Thread.sleep(2000);

        service.notifyMethod();
    }

}
