package ch2_test_3_conclusions_2;

/**
 * Created by xu on 2017/6/1.
 */
public class MyObject {
    //x对象中的synchronized同步方法
    synchronized public void speedPrintString() {
        System.out.println("speedPrintString____getLock time="+System.currentTimeMillis()+" run ThreadName="+
                Thread.currentThread().getName());
        System.out.println("--------------------------------------------");
        System.out.println("speedPrintString____releaseLock time="+System.currentTimeMillis()+" run ThreadName="+
                Thread.currentThread().getName());
    }
}
