package t17_yield;

/**
 * Created by xu on 2017/5/27.
 * yield()方法：让出当前的CPU资源，将它交给其他的任务占用CPU执行时间
 *
 * 但是
 * 放弃的时间不确定，有可能刚刚放弃，马上又获得CPU时间片
 *
 */
public class MyThread extends Thread {
    @Override
    public void run(){
        long beginTime = System.currentTimeMillis();
        int count = 0;
        int i=0;
        while (i < 50000000) {
            // 将注释去掉后，运行时间将显著增加，因将CPU让出导致速度变慢
            Thread.yield();
            count += i++;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("用时："+ (endTime-beginTime) + "  milliseconds.");
    }
}
