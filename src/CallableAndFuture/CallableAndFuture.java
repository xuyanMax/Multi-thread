package CallableAndFuture;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created by xu on 22/09/2017.
 */
public class CallableAndFuture {
     public static void main(String[] args){
         // Callable接口类似于Runnable，Runnable不会返回结果，并且无法抛出返回结果的异常，Callable可以返回值
         //这个返回值被Future拿到
         Callable<Integer> callable = new Callable<Integer>() {
             @Override
             public Integer call() throws Exception {
                 return new Random().nextInt();
             }
         };

         FutureTask<Integer> future = new FutureTask<Integer>(callable);

         // futuretask 实现了runnable和Future两个接口
         // 可以作为Runnable被线程执行，又可以作为Future得到Callable的返回值
         Thread thread = new Thread(future);
         thread.start();

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
