package ch3_wait_interrupted;


/**
 * Created by xu on 2017/6/5.
 */
public class Run {
    /*
     * wait等待遇到interrupted
     *
     * 执行完同步代码块就会释放对象的锁
     * 执行同步代码块的过程中，遇到异常导致线程终止，锁也会被释放
     * 执行了锁所属对象的wait方法后，这个线程会释放对象锁，而此线程对象会进入线程等待池，等待唤醒
     *
     * */
    public static void main(String[] args) {

        try {
            Object lock = new Object();
            ThreadA a = new ThreadA(lock);
            a.start();
            Thread.sleep(2000);
            a.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
