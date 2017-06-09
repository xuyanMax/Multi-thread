package ch3_wait_add_subtract_while;

/**
 * Created by xu on 2017/6/7.
 */
public class Run {
     public static void main(String[] args) throws InterruptedException {
         String lock = new String("");

         Add add = new Add(lock);
         Subtract sub = new Subtract(lock);

         ThreadAdd threadAdd1 = new ThreadAdd(add);
         ThreadAdd threadAdd2 = new ThreadAdd(add);

         ThreadSub threadSub1 = new ThreadSub(sub);
         ThreadSub threadSub2 = new ThreadSub(sub);

         threadSub1.start();
         threadSub2.start();
         Thread.sleep(1000);

         threadAdd1.start();
         threadAdd2.start();

     }
}
