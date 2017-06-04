package ch2_volatile_synchronized_alike;

/**
 * Created by xu on 2017/6/4.
 */
public class Run {
     public static void main(String[] args){
         try {
             Service service = new Service();
             MyThreadA a = new MyThreadA(service);
             MyThreadB b = new MyThreadB(service);
             a.start();

             Thread.sleep(1000);
             b.start();
             System.out.println("已经发起停止命令");
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
}
