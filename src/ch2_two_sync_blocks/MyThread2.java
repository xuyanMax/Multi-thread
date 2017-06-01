package ch2_two_sync_blocks;


/**
 * Created by xu on 2017/5/31.
 */
public class MyThread2 extends Thread{
    private ObjectService task;
    public MyThread2(ObjectService service){
        super();
        this.task = service;
    }
    @Override
    public void run() {
        super.run();
        task.serviceMethodB();
    }

}
