package ch2_throwExceptionReleaseLock;

/**
 * Created by xu on 2017/5/31.
 */
public class ThreadB extends Thread{
    private Service service;
    public ThreadB(Service ser) {
        service = ser;
    }
    @Override
    public void run(){
        service.testMethod();
    }
}
