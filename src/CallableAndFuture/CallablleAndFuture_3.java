package CallableAndFuture;

import java.util.concurrent.*;

/**
 * Created by xu on 22/09/2017.
 */
public class CallablleAndFuture_3 {

    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newCachedThreadPool();

        CompletionService<Integer> cs = new ExecutorCompletionService<Integer>(threadPool);
        for (int i = 0; i < 5; i++) {
            final int taskID = i * i;
            cs.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    return taskID;
                }
            });
        }

        try {
            for (int i = 0; i < 5; i++)
                System.out.println(cs.take().get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
