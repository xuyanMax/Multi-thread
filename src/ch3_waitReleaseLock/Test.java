package ch3_waitReleaseLock;

/**
 * Created by xu on 2017/6/5.
 */
public class Test {

   /*
   * wait()会自动释放锁；然而notify()被执行后，不会释放锁。。
   * 输出结果
   * 开始等待
   * 开始等待
   * */
     public static void main(String[] args){
        Object lock = new Object();
        ThreadA a = new ThreadA(lock);
        ThreadB b = new ThreadB(lock);
        a.start();
        b.start();
     }

}
