package t18_priority;

/**
 * Created by xu on 2017/5/30.
 */
public class MyThread1 extends Thread{
    /*
        线程优先级的继承性
        比如A线程启动B线程，则B线程的优先级与A是一样的
     */
    @Override
    public void run() {
        System.out.println("MyThread1 run priority=" + this.getPriority());
        MyThread2 thread2 = new MyThread2();
        thread2.start();
    }
}
