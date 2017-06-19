package ch4_awaitUniterruptibly_2;

/**
 * Created by xu on 2017/6/18.
 */
public class Run {
     public static void main(String[] args) throws InterruptedException {
         /*对 ch4_awaitUniterruptibly_1 Service 稍加改动*/
         Service service = new Service();
         MyThread myThread = new MyThread(service);
         myThread.start();
         Thread.sleep(3000);
         Thread.interrupted();


     }
}
