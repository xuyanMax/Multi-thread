package ch2_t8_verify_sync_lock_object;

/**
 * Created by xu on 2017/5/31.
 */
public class Task {

    // synchronized
    synchronized public void otherMethod() {
        System.out.println("--------------------run-other-method----------");
    }
    public void doLongTimeTask() {

       //synchronized 同步代码块
       synchronized (this) {
           for (int i=0; i<10000; i++)
               System.out.println("Synchronized threadName="+Thread.currentThread().getName() + ", i="+
                       (i+1));
       }

    }
}
