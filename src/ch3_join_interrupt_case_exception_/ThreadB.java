package ch3_join_interrupt_case_exception_;

/**
 * Created by xu on 2017/6/9.
 */
public class ThreadB extends Thread {
    @Override
    public void run() {

        try {
            ThreadA a = new ThreadA();
            a.start();
            a.join();
            System.out.println("线程B在run end 处打印");
        } catch (InterruptedException e) {
            System.out.println("线程B在catch处打印");
            e.printStackTrace();
        }

    }
}
