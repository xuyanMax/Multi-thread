package chp2_t9_sync_non_this_solv_dirty_read;


/**
 * Created by xu on 2017/5/31.
 */
public class MyThread1 extends Thread{
    private MyOneList list;
    public MyThread1(MyOneList service){
        super();
        this.list = service;
    }
    @Override
    public void run() {
        MyService msRef = new MyService();
        msRef.addServiceMethod(list, "A");
    }
}
