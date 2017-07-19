package ch7_threadRunSyn;

/**
 * Created by xu on 17/07/2017.
 */
public class Run {
     public static void main(String[] args){
         /*线程在运行时多个线程之间执行任务的时机是无序的*/
         Object lock = new Object();
         MyThread a = new MyThread(lock, "A", 1);
         MyThread b = new MyThread(lock, "B", 2);
         MyThread c = new MyThread(lock, "C", 0);
         a.start();
         b.start();
         c.start();
     }
}
