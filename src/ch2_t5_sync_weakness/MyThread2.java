package ch2_t5_sync_weakness;

/**
 * Created by xu on 2017/5/31.
 */
public class MyThread2 extends Thread{
    private Task task;
    public MyThread2(Task t){
        super();
        this.task = t;
    }
    @Override
    public void run() {
        super.run();
        CommonUtils.beginTime2 = System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtils.endTimt2 = System.currentTimeMillis();
    }

}
