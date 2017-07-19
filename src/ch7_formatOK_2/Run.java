package ch7_formatOK_2;

import java.text.SimpleDateFormat;

/**
 * Created by xu on 18/07/2017.
 */
public class Run {
     public static void main(String[] args){
         //添加DateTools类和LocalThread
         SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
         String[] dateStringArray = new String[]{"2001-01-01","2001-01-02","2001-01-03","2001-01-04",
                 "2001-01-05","2001-01-06","2001-01-07","2001-01-08","2001-01-09","2001-01-10"};

         MyThread[] threadArray = new MyThread[10];
         for (int i=0; i<10; i++)
             threadArray[i] = new MyThread(simpleDateFormat, dateStringArray[i]);

         for (int i=0; i<10; i++)
             threadArray[i].start();
     }
}
