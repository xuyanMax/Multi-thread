package ch7_stateTest_4;

/**
 * Created by xu on 09/07/2017.
 */
public class Run {
/*
WAITING是线程执行了Object.wait()方法后所处的状态
*/
     public static void main(String[] args) throws InterruptedException {

         MyThread t1 = new MyThread();
         t1.start();
         Thread.sleep(1000);
         System.out.println("main方法中的t状态："+ t1.getState());
     }
}
