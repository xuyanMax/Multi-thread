package ch7_stateTest_3;

/**
 * Created by xu on 09/07/2017.
 */
public class MyThread1 extends Thread {

    @Override
    public void run() {
        MyService.serviceMethod();
    }
}
