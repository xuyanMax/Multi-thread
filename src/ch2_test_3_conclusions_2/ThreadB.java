package ch2_test_3_conclusions_2;

/**
 * Created by xu on 2017/5/31.
 */
public class ThreadB extends Thread{
    private Service service;
    private MyObject object;
    public ThreadB(Service ser, MyObject obj) {
        service = ser;
        object = obj;
    }
    @Override
    public void run(){
        super.run();
        object.speedPrintString();
    }
}
