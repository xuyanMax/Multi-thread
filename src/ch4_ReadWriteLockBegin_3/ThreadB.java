package ch4_ReadWriteLockBegin_3;

/**
 * Created by xu on 2017/6/19.
 */
public class ThreadB extends Thread{
    private Service service;
    public ThreadB (Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.write();
    }
}
