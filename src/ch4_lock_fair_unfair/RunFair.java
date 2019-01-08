package ch4_lock_fair_unfair;

/**
 * Created by xu on 2017/6/17.
 */
public class RunFair {
    public static void main(String[] args) {
        /*公平锁，打印结果基本是呈有序的状态（先启动start()的线程基本上先获得锁）*/
        final Service service = new Service(true);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("线程" + Thread.currentThread().getName() + "运行中");
                service.serviceMethod();
            }
        };
        Thread[] threadArray = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threadArray[i] = new Thread(runnable);
        }
        for (Thread thread : threadArray)
            thread.start();
    }

}
