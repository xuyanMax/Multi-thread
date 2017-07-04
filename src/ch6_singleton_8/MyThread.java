package ch6_singleton_8;

/**
 * Created by xu on 2017/7/2.
 */
public class MyThread extends Thread {
    @Override
    public void run() {

        for (int i=0; i<5; i++)
            System.out.println(MyObject.getInstance().hashCode());
    }

}
