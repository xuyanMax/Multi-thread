package ch3_join_sleep_2;

/**
 * Created by xu on 2017/6/9.
 */
public class ThreadA extends Thread {
    private ThreadB b;

    public ThreadA(ThreadB b) {
        super();
        this.b = b;
    }

    @Override
    public void run() {
        try {
            synchronized (b) {
                b.start();
                System.out.println("IN threadA waits until threadB completes");
                b.join();//说明join方法 释放b对象的锁, b先执行

                for(int i=0 ; i<Integer.MAX_VALUE; i++) {
                    System.out.println("i="+ (i+1));
                }

            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
