package CallableAndFuture;

import java.util.Random;
import java.util.concurrent.*;

/**
 * Created by xu on 22/09/2017.
 */
public class CallableAndFuture_2 {

    //这里通过ExecutorService创建线程池的方式来管理多线程操作
    public static void main(String[] args){
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future future = executor.submit(new Callable<Integer>(){
            @Override
            public Integer call() throws Exception {
                return new Random().nextInt(100);
            }
        });
        try {

            Thread.sleep(2000);
            System.out.println(future.get());

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
