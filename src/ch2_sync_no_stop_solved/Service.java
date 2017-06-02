package ch2_sync_no_stop_solved;

/**
 * Created by xu on 2017/6/1.
 */
public class Service {
     synchronized public void methodA() {

            System.out.println("methodA begins.");
            boolean isContinue = true;
            while (isContinue);
            System.out.println("methodA ends.");
    }
     synchronized public void methodB(){
         System.out.println("methodB begins.");
         System.out.println("methodB ends.");
    }

    Object object1 = new Object();
     public void methodA_solv() {
        synchronized (object1) {
            System.out.println("methodA begins.");
            boolean isContinue = true;

            while (isContinue) ;

            System.out.println("methodA ends.");
        }
    }
    Object object2 = new Object();
     public void methodB_solv(){
         synchronized (object2) {
             System.out.println("methodB begins.");
             System.out.println("methodB ends.");
         }
    }
}
