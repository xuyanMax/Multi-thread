package ch4_ReadWriteLockBegin_4;

/**
 * Created by xu on 2017/6/19.
 */
public class ThreadA extends Thread{
    private Service service;
    public ThreadA (Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.read();
    }
}
