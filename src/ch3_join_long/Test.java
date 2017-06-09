package ch3_join_long;

/**
 * Created by xu on 2017/6/9.
 */
public class Test {
     public static void main(String[] args){
         /*join(time) 设定等待的时间*/
         try {
             MyThread thread = new MyThread();
             thread.start();

             thread.join(2000);

             Thread.sleep(2000);

             System.out.println("End time = " + System.currentTimeMillis());
         } catch (InterruptedException e) {
             e.printStackTrace();
         }

     }
}
