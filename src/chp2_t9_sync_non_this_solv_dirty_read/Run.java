package chp2_t9_sync_non_this_solv_dirty_read;

import ch2_syncLockIn_2.MyThread;

/**
 * Created by xu on 2017/6/1.
 */
public class Run {
    /*脏读
    当两个线程执行带有分之判断的方法时（if），会出现逻辑上的错误，可能出现脏读

    输出结果
    线程A 执行add方法
    线程B 执行add方法
    List Size=2

    问题原因：
    两个线程以异步的方式返回list参数的size()大小，解决方法就是同步化
    对list参数对象进行同步处理即可

    结果
    线程B 执行add方法
    线程A 无法执行add方法
    List Size=1

    * */
     public static void main(String[] args){
         MyOneList list = new MyOneList();
         MyThread1 thread1 = new MyThread1(list);
         MyThread2 thread2 = new MyThread2(list);

         thread1.setName("A");
         thread2.setName("B");
         thread1.start();
         thread2.start();
         try {
             Thread.sleep(7000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
         System.out.println("List Size=" +list.getSize());

     }
}
