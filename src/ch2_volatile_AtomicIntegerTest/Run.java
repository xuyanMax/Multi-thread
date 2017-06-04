package ch2_volatile_AtomicIntegerTest;

/**
 * Created by xu on 2017/6/4.
 */
public class Run {
    /*使用原子类进行i++操作
    * 在没有锁的情形下，做到线程安全
    * */
     public static void main(String[] args){
         AddCountThread countService = new AddCountThread();
         Thread t1 = new Thread(countService);

         Thread t2 = new Thread(countService);
         Thread t3 = new Thread(countService);
         Thread t4 = new Thread(countService);
         Thread t5 = new Thread(countService);
         t1.start();
         t2.start();
         t3.start();
         t4.start();
         t5.start();

     }
}
