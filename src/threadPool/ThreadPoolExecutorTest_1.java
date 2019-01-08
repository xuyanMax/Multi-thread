package threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by xu on 04/09/2017.
 */
public class ThreadPoolExecutorTest_1 {
    public static void main(String[] args) {
//        线程池为无限大，当执行第二个任务时第一个任务已经完成，会复用执行第一个任务的线程，而不用每次新建线程。
//        也就是说来了任务就创建线程运行，当线程空闲超过60秒，就销毁线程。
        ExecutorService cachedThreadPoll = Executors.newCachedThreadPool();

        for (int i=0; i<10; i++) {
            final int index = i;
            try {
                Thread.sleep(index * 200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cachedThreadPoll.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+" "+ index);
                }
            });
        }
    }
}
