package ch3_join_test2;

/**
 * Created by xu on 2017/6/9.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            int secondValue = (int) (Math.random() * 5);
//            System.out.printf("%f", secondValue);
            System.out.println(secondValue);
            Thread.sleep(secondValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
