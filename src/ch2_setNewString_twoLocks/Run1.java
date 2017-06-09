package ch2_setNewString_twoLocks;

/**
 * Created by xu on 2017/6/7.
 */
public class Run1 {

    /*50ms 的main线程休眠，过后，线程b取得的lock锁为"456"，不同于"123"，因此异步执行*/
     public static void main(String[] args){
         MyService service = new MyService();
         ThreadA a = new ThreadA(service);
         ThreadB b = new ThreadB(service);
         a.setName("A");
         b.setName("B");

         a.start();

         try {
             Thread.sleep(50);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
         b.start();
     }
}
