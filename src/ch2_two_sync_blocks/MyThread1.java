package ch2_two_sync_blocks;

/**
 * Created by xu on 2017/5/31.
 */
public class MyThread1 extends Thread{
    private ObjectService service;
    public MyThread1(ObjectService service){
        super();
        this.service = service;
    }
    @Override
    public void run() {
        super.run();
        service.serviceMethodA();
    }
}
