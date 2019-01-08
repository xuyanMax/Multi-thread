package ch4_awaitUniterruptibly_1;

/**
 * Created by xu on 2017/6/18.
 */
public class Run {
     public static void main(String[] args) throws InterruptedException {
         Service service = new Service();
         MyThread myThread = new MyThread(service);
         myThread.start();
         Thread.sleep(3000);
         System.out.println("asd");
         myThread.interrupted();
         System.out.println("asdasd");
     }
}
