package CallableAndFuture;

import java.util.concurrent.*;

/**
 * Created by xu on 22/09/2017.
 */
public class CallableAndFuture_5 {
    public static void main(String[] args) {
        MyCallable callable1 = new MyCallable(1000);
        MyCallable callable2 = new MyCallable(4000);

        ExecutorService threadPool = Executors.newFixedThreadPool(2);

        FutureTask<String> futureTask1 = new FutureTask<String>(callable1);
        FutureTask<String> futureTask2 = new FutureTask<String>(callable2);

        threadPool.execute(futureTask1);
        threadPool.execute(futureTask2);

        while (true) {

            try {
                System.out.println(".....");
                if (futureTask1.isDone() && futureTask2.isDone()) {
                    System.out.println("At last, Both done.");
                    threadPool.shutdownNow();
                    return;
                }

                if (!futureTask1.isDone())
                    System.out.println("FutureTask1 not done." + futureTask1.get());

                System.out.println("WAITING FOR FUTURETASK2 TO COMPLETE");
//                     String s = futureTask2.get(1000L, TimeUnit.MILLISECONDS); //等待若干时间后，便获取结果；可能返回null

                String s = futureTask2.get();//调用get会等到futuretask完成任务并返回后才结束
                System.out.println("Waiting done");
                if (s != null)
                    System.out.println("futuretask2 " + s);

            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }

}

class MyCallable implements Callable<String> {
    private long waitTime;

    public MyCallable(long time) {
        this.waitTime = time;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(waitTime);
        return Thread.currentThread().getName();
    }
}
