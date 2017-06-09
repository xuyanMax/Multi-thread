package ch2_setNewString_twoLocks;

/**
 * Created by xu on 2017/6/7.
 */
public class MyService {
    private String lock = "123";
    public void testMethod() {
        try {
          synchronized (lock) {
              System.out.println(Thread.currentThread().getName() + " begins " + System.currentTimeMillis());
              lock = "456";
              Thread.sleep(2000);
              System.out.println(Thread.currentThread().getName() + " ends " + System.currentTimeMillis());
          }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
