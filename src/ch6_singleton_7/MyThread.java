package ch6_singleton_7;

/**
 * Created by xu on 2017/7/2.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }

}
