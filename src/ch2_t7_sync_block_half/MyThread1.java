package ch2_t7_sync_block_half;

/**
 * Created by xu on 2017/5/31.
 */
public class MyThread1 extends Thread{
    private Task task;
    public MyThread1(Task t){
        super();
        this.task = t;
    }
    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}
