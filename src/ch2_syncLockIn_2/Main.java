package ch2_syncLockIn_2;

/**
 * Created by xu on 2017/5/30.
 */
public class Main {
    public int i = 10;
    synchronized public void operateMain() {
        try {
            i--;
            System.out.println("Main i="+i);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
