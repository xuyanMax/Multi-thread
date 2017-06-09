package ch3_join_interrupt_case_exception_;

/**
 * Created by xu on 2017/6/9.
 */
public class Run {
     public static void main(String[] args){
         /*在join过程中，如果当前线程被中断，则当前线程出现异常
         *
         *
         *
         * */

         try {
             ThreadB threadB = new ThreadB();
             threadB.start();
             Thread.sleep(500);
             ThreadC threadC = new ThreadC(threadB);

             threadC.start();

         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
}
