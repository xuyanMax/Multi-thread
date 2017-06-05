package ch3_wait_notify_size5;

/**
 * Created by xu on 2017/6/4.
 */
public class MyThreadA extends Thread{
//    private MyList list;
    private Object lock;

    public MyThreadA(Object o) {
        super();
        this.lock = o;
    }

    @Override
    public void run() {

        try {
            synchronized (lock) {
                for (int i = 0; i < 10; i++) {
                    MyList.add();
                    if (MyList.size() == 5) {
                        lock.notify();
                        System.out.println("已发出唤醒通知");
                    }

                    System.out.println("添加了" + (i + 1) + "个元素" + MyList.size());
                    Thread.sleep(100);
                }
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
