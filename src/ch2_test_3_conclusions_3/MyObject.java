package ch2_test_3_conclusions_3;

/**
 * Created by xu on 2017/6/1.
 */
public class MyObject {

     public void speedPrintString() {
        synchronized (this){
            System.out.println("speedPrintString____getLock time="+System.currentTimeMillis()+" run ThreadName="+
                    Thread.currentThread().getName());
            System.out.println("--------------------------------------------");
            System.out.println("speedPrintString____releaseLock time="+System.currentTimeMillis()+" run ThreadName="+
                    Thread.currentThread().getName());
        }
    }
}
