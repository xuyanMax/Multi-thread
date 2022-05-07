package threadPool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xu on 04/09/2017.
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 200,
                TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(15));

        for (int i = 0; i < 15; i++) {
            MyTask task = new MyTask(i);
            executor.execute(task);
            System.out.println("线程池中线程数目：" + executor.getPoolSize() + ", 队列中等待执行的任务数目"
                    + executor.getQueue().size() + ",已执行完成的任务数目：" + executor.getCompletedTaskCount());
        }
        executor.shutdown();
        System.out.println(Runtime.getRuntime().availableProcessors());

    }

    static class MyTask implements Runnable {
        private int taskNum;

        public MyTask(int taskNum) {
            this.taskNum = taskNum;
        }

        @Override
        public void run() {

            try {
                System.out.println("正在执行task" + taskNum);
                Thread.currentThread().sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("task" + taskNum + "执行完毕");
        }
    }

}
