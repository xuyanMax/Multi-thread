package ch5_TimerTask_Test2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by xu on 2017/6/23.
 */
public class Run_Timer_cancel_unexpected {
    static int i = 0;
    static public class MyTask extends TimerTask{
        @Override
        public void run() {
            System.out.println("i = "+i);
        }
    }
    public static void main(String[] args) throws ParseException {
/*
* 又是Timer类的cancel没有争抢到queue锁，因此TimerTask类中的任务会正常执行，如果争抢到了，
* 在当前循环中，不再执行TimerTask类中的任务
* */
        while(true) {
            i++;

            Timer timer = new Timer();
            MyTask task = new MyTask();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
            String dateString = "2017-05-01 10-10-10";
            Date dateRef = sdf.parse(dateString);
            timer.schedule(task,dateRef);
            timer.cancel();
        }
    }
}
