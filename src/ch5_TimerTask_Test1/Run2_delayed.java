package ch5_TimerTask_Test1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by xu on 2017/6/23.
 */
public class Run2_delayed {
/*
Timer 中允许多个TimeTask任务
TimeTask 是以队列的方式一个一个被顺序执行的，所以执行的时间有可能和预期的时间不一致，
因为前面的任务有可能消耗的时间较长，则后面的任务运行的时间也会被延迟
* */

    private static Timer timer = new Timer();

    static public class MyTask1 extends TimerTask {
        @Override
        public void run() {

            try {
                System.out.println("1 开始运行了！时间为：" + new Date());
                Thread.sleep(2000);
                System.out.println("    1 结束运行！时间为：" + new Date());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static public class MyTask2 extends TimerTask {
        @Override
        public void run() {
            System.out.println("2 运行了！时间为：" + new Date());
        }
    }

    public static void main(String[] args) throws ParseException {
        MyTask1 task1 = new MyTask1();
        MyTask2 task2 = new MyTask2();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String dateString1 = "2017-06-23 15:21:30";
        String dateString2 = "2017-06-23 15:21:31";
        Date dateRef1 = sdf1.parse(dateString1);
        Date dateRef2 = sdf2.parse(dateString2);
        System.out.println("字符串1时间 " + dateString1 + " 当前时间： " + new Date().toLocaleString());
        System.out.println("字符串2时间 " + dateString2 + " 当前时间： " + new Date().toLocaleString());
        timer.schedule(task1, dateRef1);
        timer.schedule(task2, dateRef2);

    }

}
