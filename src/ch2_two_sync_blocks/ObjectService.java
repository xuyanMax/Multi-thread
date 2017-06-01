package ch2_two_sync_blocks;

/**
 * Created by xu on 2017/5/31.
 */
public class ObjectService {

    public void serviceMethodA() {
        try {
            synchronized (this) {
                System.out.println("A begin time="+System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("A end time="+System.currentTimeMillis());
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void serviceMethodB() {
        synchronized (this) {
            System.out.println("B begin time="+System.currentTimeMillis());
            System.out.println("B begin time="+System.currentTimeMillis());
        }
    }
}
