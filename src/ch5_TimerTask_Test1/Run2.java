package ch5_TimerTask_Test1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by xu on 2017/6/23.
 */
public class Run2 {
    /*Timer 中允许多个TimeTask任务*/

    private static Timer timer = new Timer();

    static public class MyTask1 extends TimerTask {
        @Override
        public void run() {
            System.out.println("运行了！时间为：" + new Date());
        }
    }

    static public class MyTask2 extends TimerTask {
        @Override
        public void run() {
            System.out.println("运行了！时间为：" + new Date());
        }
    }

    public static void main(String[] args) throws ParseException {
        MyTask1 task1 = new MyTask1();
        MyTask2 task2 = new MyTask2();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String dateString1 = "2020-06-23 15:16:30";
        String dateString2 = "2017-06-23 15:16:55";
        Date dateRef1 = sdf1.parse(dateString1);
        Date dateRef2 = sdf2.parse(dateString2);
        System.out.println("字符串1时间 " + dateString1 + " 当前时间： " + new Date().toLocaleString());
        System.out.println("字符串2时间 " + dateString2 + " 当前时间： " + new Date().toLocaleString());
        timer.schedule(task1, dateRef1);
        timer.schedule(task2, dateRef2);


    }
}
