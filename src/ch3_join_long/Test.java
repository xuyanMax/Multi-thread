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
//             Thread.sleep(2000);
             thread.join();//调用线程等待该线程完成后，在执行下面一句

             System.out.println("End time = " + System.currentTimeMillis());
         } catch (InterruptedException e) {
             e.printStackTrace();
         }

     }
}
