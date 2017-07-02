package ch5_TimerTask_Test1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by xu on 2017/6/23.
 */
public class Run1_TimerMadeToDaemon {
    // Timer made to 守护线程
    // TimerTask中的任务不再运行
    private static Timer timer = new Timer(true);
    static public class MyTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("运行了！时间为："+ new Date());
        }
        public static void main(String[] args) throws ParseException {

            /*schedule 方法 该方法的作用是在指定的日期执行一次某任务
            * 创建一个Timer就是启动一个新的线程，这个新启动的线程不是守护线程，它一致运行
            * */
            Run1_after.MyTask task = new Run1_after.MyTask();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            String dateString = "2017-06-23 14:32:50";
            System.out.println("字符串时间 "+ dateString + " 当前时间： "+ new Date().toLocaleString());
            Date dateRef = sdf.parse(dateString);

            timer.schedule(task, dateRef);
        }
    }

}
