package ch4_awaitUntil;

/**
 * Created by xu on 2017/6/19.
 */
public class Run1 {
     public static void main(String[] args){

         /*线程等待10秒后自动唤醒*/
         Service service = new Service();
         MyThreadA athread = new MyThreadA(service);
         athread.start();

     }
}
