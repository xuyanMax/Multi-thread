package ch5_TimerTask_Test2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by xu on 2017/6/23.
 */
public class Run_Timer_cancel {
    private static Timer timer = new Timer();

    static public class MyTaskA extends TimerTask {
        @Override
        public void run() {
            System.out.println("A运行了！时间为：" + new Date());
            // Timer cance
//            this.cancel();//从队列中清除自己
            timer.cancel();
        }

        static public class MyTaskB extends TimerTask {
            @Override
            public void run() {
                System.out.println("B运行了！时间为：" + new Date());
            }

            public static void main(String[] args) throws ParseException {

                /*schedule（TimerTask, Date, long)方法
                 * Timer- cancel()作用是将自任务队列中清空
                 * */
                MyTaskA taskA = new MyTaskA();
                MyTaskA.MyTaskB taskB = new MyTaskA.MyTaskB();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                String dateString = "2017-06-23 14:31:50";
                System.out.println("字符串时间 " + dateString + " 当前时间： " + new Date().toLocaleString());
                Date dateRef = sdf.parse(dateString);

                timer.schedule(taskA, dateRef, 4000);//每隔period 4s 运行一次
                timer.schedule(taskB, dateRef, 500);
            }
        }
    }


}
