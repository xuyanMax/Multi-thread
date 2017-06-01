package ch2_t8_verify_sync_lock_object;

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
