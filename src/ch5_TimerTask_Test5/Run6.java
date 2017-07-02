package ch5_TimerTask_Test5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by xu on 2017/6/23.
 */
public class Run6 {
    /*任务追赶... scheduleAtFixedRate
   * 以前的任务被迅速执行，无关period
   * */
    private static Timer timer = new Timer();

    static public class MyTask extends TimerTask {
        @Override
        public void run() {

                System.out.println("1运行了，时间为："+ new Date());

                System.out.println("   1 end 时间为："+ new Date());
        }
        public static void main(String[] args) throws ParseException {
            /*schedule(TimeTask, long)作用，当前的时间为参考时间，在此基础上延迟指定的时间后每隔一段时间"无限"执行此TimerTask任务*/
            MyTask task = new MyTask();
            String dateString1 = "2014-05-06 08:08:08";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

            Date dateRef1 = simpleDateFormat.parse(dateString1);

            System.out.println("当前时间 " + new Date());

            timer.scheduleAtFixedRate(task, dateRef1, 2000);
        }
    }
}
