package ch7_stateTest_3;


/**
 * Created by xu on 09/07/2017.
 */
public class Run {
/*
BLOCKED状态出现在某一个线程在等待同步锁的时候

A进入业务方法
main方法中t2状态:BLOCKED
B进入业务方法

*/
     public static void main(String[] args) throws InterruptedException {
          MyThread1 thread1 = new MyThread1();
          MyThread2 thread2 = new MyThread2();
          thread1.setName("A");
          thread2.setName("B");
         thread1.start();
         thread2.start();
         Thread.sleep(1000);
         System.out.println("main方法中t2状态:"+ thread2.getState());
     }
}
