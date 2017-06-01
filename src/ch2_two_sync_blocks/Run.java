package ch2_two_sync_blocks;


/**
 * Created by xu on 2017/5/31.
 */
public class Run {
     public static void main(String[] args){
         /*
            synchronized代码块间的同步性

            当一个线程访问对象的一个同步代码块时，其他线程对同一个对象的所有其他同步代码块的访问将被阻塞
            说明synchronized使用的"对象监视器"只有一个。

            输出结果 （排队执行）
            A begin time=1496203088982

            A end time  =1496203090987
            B begin time=1496203090987
            B begin time=1496203090987
          */

        ObjectService service = new ObjectService();
        MyThread1 thread1 = new MyThread1(service);
        MyThread2 thread2 = new MyThread2(service);
        thread1.setName("A");
        thread2.setName("B");
        thread1.start();
        thread2.start();

     }
}
