package ch2_syncLockIn_2;

/**
 * Created by xu on 2017/5/30.
 */
public class Sub extends Main{
    synchronized public void operateSub() {
        try {
            while (i>0) {
                i--;
                System.out.println("Sub i="+i);
                Thread.sleep(1000);
                this.operateMain();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
