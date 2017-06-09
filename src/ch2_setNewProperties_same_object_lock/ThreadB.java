package ch2_setNewProperties_same_object_lock;

/**
 * Created by xu on 2017/6/7.
 */
public class ThreadB extends Thread {
    private Service service = new Service();
    private UserInfo info = new UserInfo();

    public ThreadB(Service service, UserInfo info) {
        super();
        this.service = service;
        this.info = info;
    }

    @Override

    public void run() {
        service.serviceMethodA(info);
    }
}
