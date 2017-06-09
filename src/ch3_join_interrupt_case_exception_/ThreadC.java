package ch3_join_interrupt_case_exception_;

/**
 * Created by xu on 2017/6/9.
 */
public class ThreadC extends Thread {
    private ThreadB threadB;

    public ThreadC(ThreadB threadB) {
        super();
        this.threadB = threadB;
    }

    @Override
    public void run() {
        threadB.interrupt();
    }
}
