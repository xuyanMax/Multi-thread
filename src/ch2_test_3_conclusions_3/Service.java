package ch2_test_3_conclusions_3;

/**
 * Created by xu on 2017/6/1.
 */
public class Service {
    public void testMethod1(MyObject object) {
        synchronized (object) {
            try {
                System.out.println("testMethod1____getLock time="+System.currentTimeMillis()+" run ThreadName="+
                Thread.currentThread().getName());

                Thread.sleep(5000);

                System.out.println("testMethod1____releaseLock time="+System.currentTimeMillis()+" run ThreadName="+
                        Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
