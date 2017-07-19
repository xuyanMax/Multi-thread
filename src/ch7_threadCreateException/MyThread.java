package ch7_threadCreateException;

/**
 * Created by xu on 19/07/2017.
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        //出错原因，空指针异常
        String username = null;
        System.out.println(username.hashCode());
    }
}
