package ch7_stateTest_2;

/**
 * Created by xu on 09/07/2017.
 */
public class Run {
     public static void main(String[] args){
/*
TIMED_WAITING代表线程执行了Thread.sleep()，呈等待状态，等待时间到达

Begin sleep
main 方法中的状态：TIMED_WAITING
  End sleep

*/
         try {
             MyThread t = new MyThread();
             t.start();
             Thread.sleep(1000);
             System.out.println("main 方法中的状态："+ t.getState());
         } catch (InterruptedException e) {
             e.printStackTrace();

         }
     }
}
