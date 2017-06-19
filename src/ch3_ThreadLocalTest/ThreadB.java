package ch3_ThreadLocalTest;

/**
 * Created by xu on 2017/6/11.
 */
public class ThreadB extends Thread{
    @Override
    public void run() {
        try {
            for (int i=0; i<100; i++) {
                Tools.t1.set("ThreadA" + (i+1));
                System.out.println("ThreadA get i="+ Tools.t1.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
