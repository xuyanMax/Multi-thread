package ch2_setNewString_twoLocks;

/**
 * Created by xu on 2017/6/7.
 */
public class Run2 {
     public static void main(String[] args) {
         MyService service = new MyService();
         ThreadA a = new ThreadA(service);
         ThreadB b = new ThreadB(service);
         a.setName("A");
         b.setName("B");

         a.start();
         b.start();
     }
}
