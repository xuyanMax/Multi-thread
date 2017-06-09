package ch3_join_interrupt_case_exception_;

/**
 * Created by xu on 2017/6/9.
 */
public class ThreadA extends Thread {

    @Override
    public void run() {
        for (int i=0; i<Integer.MAX_VALUE; i++) {
            String newString = new String();
            Math.random();
        }
    }
}
