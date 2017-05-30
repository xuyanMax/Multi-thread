package t19_priority;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Random;

/**
 * Created by xu on 2017/5/30.
 */
public class Run {
    /*第一次、设置thread1的优先级10，thread2优先级1
    * 结果显示，高优先级的线程总是'大部分'先执行完（不代表高优先级的线程'全部'先执行玩）
    * 另外，thread1限制性的原因不是其被main线程优先调用，完全是因为thread1的优先级是最高值10造成的
    *
    * 第二次、设置thread2优先级10，thread1优先级1
    * 验证：当线程优先级等级相差很大时，谁先执行玩和代码的调用顺序无关。
    * */
     public static void main(String[] args){
         try {
             System.setOut(new PrintStream(new FileOutputStream("./output.txt")));
             for (int i=0; i<5; i++) {
                 MyThread1 thread1 = new MyThread1();
                 thread1.setPriority(10);
                 thread1.start();

                 MyThread2 thread2 = new MyThread2();
                 thread2.setPriority(1);
                 thread2.start();
             }
         } catch (FileNotFoundException e) {
             e.printStackTrace();
         }

     }
}
