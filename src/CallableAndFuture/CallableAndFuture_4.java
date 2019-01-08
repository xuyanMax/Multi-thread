package CallableAndFuture;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by xu on 22/09/2017.
 */
public class CallableAndFuture_4 {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(4);
        Future<List<Integer>> future = threadPool.submit(new Callable<List<Integer>>() {
            @Override
            public List<Integer> call() throws Exception {
                List<Integer> ret = new ArrayList<>();
                for (int i = 0; i < 50; i++) {
                    int taskID = i * i;
                    ret.add(taskID);
                }
                return ret;
            }
        });

//        FutureTask<Integer> futureTask  = new FutureTask<Integer>(new Callable<Integer>() {
//            @Override
//            public Integer call() throws Exception {
//                return 1;
//            }
//        });

        try {
            List<Integer> result = future.get();
            System.out.println(future.isDone());
            for (int n : result)
                System.out.println(n);
             threadPool.shutdown();
//             threadPool.shutdownNow();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
