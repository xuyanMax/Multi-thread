package ch3_wait_notify_size5;

/**
 * Created by xu on 2017/6/4.
 */
public class MyThreadB extends Thread {
    //    private MyList list;
    private Object lock;

    public MyThreadB(Object o) {
        super();
        this.lock = o;
    }

    @Override
    public void run() {

        try {

            synchronized (lock) {
//                        while (true) {
                // busy waiting
                if (MyList.size() != 5) {

                    System.out.println("等待开始 " + System.currentTimeMillis());
                    lock.wait();
                    System.out.println("等待结束 " + System.currentTimeMillis());
                }
            }
//                    }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
