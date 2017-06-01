package ch2_t7_sync_block_half;

/**
 * Created by xu on 2017/5/31.
 */
public class Task {

//    private int i;
    /*
    对象方法内部的私有变量不存在"非线程安全问题"，都是线程安全的
    因此，非同步代码块，两个线程异步调用；同步代码块，两个线程排队后同步调用，
     */

    public void doLongTimeTask() {

        for (int i=0; i<100; i++)
           System.out.println("Asynchronized threadName="+Thread.currentThread().getName() + ", i="+
                   (i+1));

       System.out.println("");

       //synchronized 同步代码块
       synchronized (this) {
           for (int i=0; i<100; i++)
               System.out.println("Synchronized threadName="+Thread.currentThread().getName() + ", i="+
                       (i+1));
       }

    }
}
