package t18_priority;

import suspend_resume_LockStop.MyThread;

/**
 * Created by xu on 2017/5/30.
 */
public class Run {
    /*
    main线程启动thread1线程，thread1启动thread2线程
    因此，main线程的优先级被thread1 线程 和thread1线程启动的thread2线程继承

    将注释部分去掉，再次运行，优先级被更改后再次被继承

    * */

     public static void main(String[] args){
         System.out.println("main thread begin priority="+Thread.currentThread().getPriority());

//         Thread.currentThread().setPriority(6);
         System.out.println("main thread end priority="+ Thread.currentThread().getPriority());

         MyThread1 thread1 = new MyThread1();

         thread1.start();

     }
}
