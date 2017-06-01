package ch2_t7_sync_block_half;


/**
 * Created by xu on 2017/5/31.
 */
public class Run {
     public static void main(String[] args){
         /*
            一半同步，一半异步
            非同步时，交叉打印
            同步时，排队执行

          */

        Task task = new Task();
        MyThread1 thread1 = new MyThread1(task);
        MyThread2 thread2 = new MyThread2(task);
        thread1.setName("A");
        thread2.setName("B");
        thread1.start();
        thread2.start();

     }
}
