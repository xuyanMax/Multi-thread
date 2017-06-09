package ch3_wait_notify_insert_test;

/**
 * Created by xu on 2017/6/9.
 */
public class DBTools {
    volatile private boolean prevIsA = false;
    synchronized public void backupA() {
        try {
            while (prevIsA == true)
                this.wait();

            for (int i=0; i<5; i++)
                System.out.println("AAAAAAA");
            prevIsA = true;
            notifyAll();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    synchronized public void backupB() {
        try {
            while (prevIsA == false)
                this.wait();

            for (int i=0; i<5; i++)
                System.out.println("BBBBBBB");
            prevIsA = false;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
