package ch7_threadGroup_1;

/**
 * Created by xu on 19/07/2017.
 */
public class MyThread extends Thread {
    private String num;

    public MyThread(ThreadGroup group, String name, String num) {
        super(group, name);
        this.num = num;
    }

    @Override
    public void run() {
        int numInt = Integer.parseInt(num);
        while(true) {
            System.out.println("死循环中："+Thread.currentThread().getName());
        }
    }
}
