package ch2_sync_two_no_stop_solved;

/**
 * Created by xu on 2017/6/1.
 */
public class Run {
    /*
      同步synchronized方法，无限等待在a线程，导致b线程无法运行
      此为死循环
      不同的循环都在等待根本不可能释放的锁，因而导致所有的任务都无法继续完成。
      解决方法，对methodA()使用同步代码块

    * */
     public static void main(String[] args){
         Service service = new Service();
         ThreadA a = new ThreadA(service);
         ThreadB b = new ThreadB(service);
         a.setName("A");
         b.setName("B");
         a.start();
         b.start();
     }

}
