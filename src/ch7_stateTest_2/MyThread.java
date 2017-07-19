package ch7_stateTest_2;

/**
 * Created by xu on 09/07/2017.
 */
public class MyThread extends Thread {

    @Override
    public void run() {

        try {
            System.out.println("Begin sleep");
            Thread.sleep(5000);
            System.out.println("  End sleep");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
