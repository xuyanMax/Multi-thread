package ch5_TimerTask_Test1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by xu on 2017/6/23.
 */
public class Run1_before {
    private static Timer timer = new Timer();

    static public class MyTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("运行了！时间为：" + new Date());
        }

        public static void main(String[] args) throws ParseException {

            /*schedule 方法 该方法的作用是在指定的日期执行一次某任务
             * 2、执行任务的时间早于当前时间：在未来执行的效果
             * 程序运行后直接执行
             * */
            Run1_after.MyTask task = new Run1_after.MyTask();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            String dateString = "2017-06-23 14:27:50";
            System.out.println("字符串时间 " + dateString + " 当前时间： " + new Date().toLocaleString());
            Date dateRef = sdf.parse(dateString);

            timer.schedule(task, dateRef);
        }
    }

}
