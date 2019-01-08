package ch2_DeadLock_Test;

/**
 * Created by xu on 2017/6/2.
 */
public class Test {
    /*
     多线程的死锁
     双方互相持有对方的锁的情况，本试验使用synchronized嵌套的代码结构来实现死锁，其实不使用嵌套的synchronized代码结构也会出现死锁。
     用java自带工具探寻死锁
     终端输入 /usr/libexec/java_home -V
     进入 contents->jdk->bin

     输入jps得到线程的pid
     输入jstack pid即可

     */
    public static void main(String[] args) throws InterruptedException {

        DeadThread t1 = new DeadThread();

        t1.setFlag("a");
        Thread thread1 = new Thread(t1);
        thread1.start();

        Thread.sleep(100);

        t1.setFlag("b");
        Thread thread2 = new Thread(t1);
        thread2.start();

    }
}
