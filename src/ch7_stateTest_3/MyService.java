package ch7_stateTest_3;

/**
 * Created by xu on 09/07/2017.
 */
public class MyService {
    synchronized static public void serviceMethod() {
        try {
            System.out.println(Thread.currentThread().getName() +"进入业务方法");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
