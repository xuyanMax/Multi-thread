package t20_priority;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * Created by xu on 2017/5/30.
 */
public class Run {
    /*设置thread1的优先级5，thread2优先级6(为了使优先级等级接近)
    * 线程的优先级具有"随机性" - - 高优先级线程不一定每一次都先执行完
    *
    * */
     public static void main(String[] args){
         try {
             System.setOut(new PrintStream(new FileOutputStream("./output.txt")));
             for (int i=0; i<5; i++) {
                 MyThread1 thread1 = new MyThread1();
                 thread1.setPriority(5);
                 thread1.start();

                 MyThread2 thread2 = new MyThread2();
                 thread2.setPriority(6);
                 thread2.start();
             }
         } catch (FileNotFoundException e) {
             e.printStackTrace();
         }

     }
}
