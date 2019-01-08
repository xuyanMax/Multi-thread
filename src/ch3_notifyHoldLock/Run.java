package ch3_notifyHoldLock;

/**
 * Created by xu on 2017/6/5.
 */
public class Run {
    /*
    * notify不释放锁
    * notify()方法所在的同步synchronized代码块全部执行完后才释放锁！！
    *
    * */
     public static void main(String[] args){
         Object lock = new Object();
         ThreadA a = new ThreadA(lock);
         a.start();

         NotifyThread nt1 = new NotifyThread(lock);
         NotifyThread2 nt2 = new NotifyThread2(lock);
         nt1.start();
         nt2.start();

     }
}
