package ch3_busy_waiting;

/**
 * Created by xu on 2017/6/4.
 */
public class MyThreadA extends Thread {
    private MyList list;

    public MyThreadA(MyList l) {
        super();
        this.list = l;
    }

    @Override
    public void run() {

        try {
            for (int i = 0; i < 10; i++) {
                list.add();
                System.out.println("添加了" + (i + 1) + "个元素" + list.size());
                Thread.sleep(1000);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
