package ch2_setNewProperties_same_object_lock;

/**
 * Created by xu on 2017/6/7.
 */
public class Run {
     public static void main(String[] args) throws InterruptedException {
         Service service = new Service();
         UserInfo userInfo = new UserInfo();
         ThreadA a = new ThreadA(service, userInfo);
         ThreadB b = new ThreadB(service, userInfo);
         a.start();
         Thread.sleep(50);
         b.start();


     }

}
