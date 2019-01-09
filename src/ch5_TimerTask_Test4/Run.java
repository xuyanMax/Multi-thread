package ch5_TimerTask_Test4;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by xu on 2017/6/23.
 */
public class Run {
    static public class MyTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("运行了，时间为：" + new Date());
        }

        public static void main(String[] args) {
            /*schedule(TimeTask, long)作用，当前的时间为参考时间，
            在此基础上延迟指定的时间后每隔一段时间"无限"执行此TimerTask任务*/
            MyTask task = new MyTask();
            Timer timer = new Timer();
            System.out.println("当前时间 " + new Date());
            timer.schedule(task, 5000, 500);//延迟5s，后每隔0.5无限执行片；
        }
    }
}
