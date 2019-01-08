package ch2_volatile_non_atomicity;

/**
 * Created by xu on 2017/6/4.
 */
public class MyThread extends Thread {
    volatile public static int count;

    private static void addCount() {
        for (int i = 0; i < 100; i++)
            count++;
        System.out.println("count=" + count);
    }

    @Override
    public void run() {
        addCount();
    }
}
