package ch3_wait_notify_size5;


/**
 * Created by xu on 2017/6/4.
 */
public class Run {
     public static void main(String[] args) throws InterruptedException {
         /*
         等待／通知机制的实现
         日志消息"等待结束"在最后输出，说明notify()方法执行后不立刻释放锁。

         等待／通知机制必须用在被synchronized同步的Object的临界区

         通过调用wait()方法可以使处于临界区的线程处于等待状态，同时释放被同步对象的锁。
         而notify()可以欢迎一个因调用了wait()操作而处于阻塞状态的线程，使其进入"就绪状态"。被重新唤醒的线程会试图重新获得临界区的锁，并继续
         执行临界区内wait之后的代码。

         对每一个对象，都有两个队列。（1）就绪队列（2）阻塞队列

         临界区：设计共享数据部分的代码块
         * */

             Object obj = new Object();
             MyThreadA a = new MyThreadA(obj);
             MyThreadB b = new MyThreadB(obj);
             a.setName("A");
             b.setName("B");
             b.start();
             Thread.sleep(5000);

             a.start();

     }
}
