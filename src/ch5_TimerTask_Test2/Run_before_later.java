package ch5_TimerTask_Test2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by xu on 2017/6/23.
 */
public class Run_before_later {
    private static Timer timer = new Timer();
    static public class MyTask extends TimerTask{
        @Override
        public void run() {
            System.out.println("运行了！时间为："+ new Date());
        }
         public static void main(String[] args) throws ParseException {

            /*schedule（TimerTask, Date, long)方法
            * 1、执行任务的时间晚于当前时间：在未来执行的效果
            * 创建一个Timer就是启动一个新的线程，这个新启动的线程不是守护线程，它一致运行
            * 2、若早于当前时间，则程序运行后立即执行
            * */
             MyTask task = new MyTask();
             SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
             String dateString = "2017-06-23 14:29:30";
             System.out.println("字符串时间 "+ dateString + " 当前时间： "+ new Date().toLocaleString());
             Date dateRef = sdf.parse(dateString);

             timer.schedule(task, dateRef, 4000);//每隔period 4s 运行一次
         }
    }
}
