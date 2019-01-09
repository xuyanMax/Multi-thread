package ch5_TimerTask_Test5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by xu on 2017/6/23.
 */
public class Run4 {
    private static Timer timer = new Timer();
    private static int runCount = 0;

    static public class MyTask extends TimerTask {
        @Override
        public void run() {

            try {
                System.out.println("1运行了，时间为：" + new Date());
                Thread.sleep(5000);
                System.out.println("   1 end 时间为：" + new Date());
                runCount++;
                if (runCount == 5)
                    timer.cancel();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public static void main(String[] args) throws ParseException {

            MyTask task = new MyTask();
            String dateString1 = "2019-01-06 08:08:08";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

            Date dateRef1 = simpleDateFormat.parse(dateString1);

            System.out.println("当前时间 " + new Date());

            timer.schedule(task, dateRef1, 20000);//延迟5s，后每隔0.5无限执行片；
        }
    }
}
