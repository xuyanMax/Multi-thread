package ch4_hasWaiters;


/**
 * Created by xu on 2017/6/17.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        /*
        boolean hasWaiters()
        查询是否有线程正在等待与此锁有关的 condition 条件*/
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
