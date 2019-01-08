package ch2_DeadLock_Test;

/**
 * Created by xu on 2017/6/2.
 */
public class DeadThread implements Runnable {
    public String username;
    public Object lock1 = new Object();
    public Object lock2 = new Object();

    public void setFlag(String un) {
        this.username = un;
    }

    @Override
    public void run() {
        if (username.equals("a")) {
            synchronized (lock1) {
                try {
                    System.out.println("username=" + username);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //inside
                synchronized (lock2) {
                    System.out.println("按lock1--->>>lock2代码顺序执行！");
                }
            }

        }
        if (username.equals("b")) {
            synchronized (lock2) {
                try {
                    System.out.println("username=" + username);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //inside s
                synchronized (lock1) {
                    System.out.println("按lock2--->>>lock1代码顺序执行！");

                }

            }

        }
    }
}
