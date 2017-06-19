package ch3_ThreadLocal_s5;

import java.util.Date;

/**
 * Created by xu on 2017/6/12.
 */
public class ThreadB extends Thread{
    @Override
    public void run() {
        try {
            for (int i=0; i<20; i++) {
                if (Tools.t1.get() == null) {
                    Tools.t1.set(new Date());
                }
                System.out.println("B " + Tools.t1.get().getTime());
                Thread.sleep(100);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
