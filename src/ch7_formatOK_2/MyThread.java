package ch7_formatOK_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by xu on 18/07/2017.
 */
public class MyThread extends Thread {
    private SimpleDateFormat simpleDateFormat;
    private String dateString;

    public MyThread(SimpleDateFormat simpleDateFormat, String dateString) {
        this.simpleDateFormat = simpleDateFormat;
        this.dateString = dateString;
    }

    @Override
    public void run() {
        try{
            Date dateRef = DateTools.getSimpleDateFormat("yyyy-mm-dd").parse(dateString);
            String newDateString = DateTools.getSimpleDateFormat("yyyy-mm-dd").format(dateRef).toString();
            if (!newDateString.equals(dateString)) {
                System.out.println("ThreadName="+this.getName() +
                        "报错了 日期字符串："+dateString + " 转换成的日期是"+newDateString);
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
