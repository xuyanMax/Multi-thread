package ch4_isFair;

import ch4_hasWaiters.*;

/**
 * Created by xu on 2017/6/17.
 */
public class Run {
     public static void main(String[] args){
         /*lock.isFair()  - - - 判断是否是公平锁*/
         final Service service = new Service(true);
         Runnable runnable  = new Runnable() {
             @Override
             public void run() {
                 service.serviceMethod();
             }
         };
         Thread thread = new Thread(runnable);
         thread.start();
         final Service service2 = new Service(false);

         runnable  = new Runnable() {
             @Override
             public void run() {
                 service2.serviceMethod();
             }
         };
         thread = new Thread(runnable);
         thread.start();

     }
}
