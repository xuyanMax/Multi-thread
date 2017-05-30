package t18_priority;

/**
 * Created by xu on 2017/5/30.
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread2 run priority=" + this.getPriority());
    }
}
