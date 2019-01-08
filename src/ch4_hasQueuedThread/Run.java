package ch4_hasQueuedThread;


/**
 * Created by xu on 2017/6/17.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {

        Service service = new Service();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.waitMethod();
            }
        };
        Thread athread = new Thread(runnable);
        athread.start();

        Thread.sleep(500);

        Thread bthread = new Thread(runnable);
        bthread.start();

        Thread.sleep(500);

        System.out.println(service.lock.hasQueuedThreads());
        /*查询指定的线程是否正在等待获取此锁定*/
        System.out.println(service.lock.hasQueuedThread(athread));//false
        System.out.println(service.lock.hasQueuedThread(bthread));//true

    }
}
