package ch2_t5_sync_weakness;

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
        CommonUtils.beginTime1 = System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtils.endTimt1 = System.currentTimeMillis();
    }
}
