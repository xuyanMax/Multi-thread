package ch2_volatile_synchronized_alike;

/**
 * Created by xu on 2017/6/4.
 */
public class Service {

    //可以使用volatile
    private volatile Boolean isContinueRun = true;

    public void startMethod() {
        String anyString = new String();

        while (isContinueRun == true) {
//            synchronized (isContinueRun) {// 或者 synchronized(anyString) 去掉volatile
//            }
        }
        System.out.println("停下来了！");

    }

    public void stopMethod() {
        isContinueRun = false;
    }


}
