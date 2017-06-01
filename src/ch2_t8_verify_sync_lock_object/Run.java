package ch2_t8_verify_sync_lock_object;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * Created by xu on 2017/5/31.
 */
public class Run {
     public static void main(String[] args){
         /*
            验证同步代码块是锁定当前对象的。

            输出结果
            Synchronized threadName=A, i=1
            --------------------run-other-method----------
            Synchronized threadName=A, i=2


             若将synchronized关键字加在 otherMethod方法前

             输出结果

            Synchronized threadName=A, i=9999
            Synchronized threadName=A, i=10000
            --------------------run-other-method----------
          */
         try {
             System.setOut(new PrintStream(new FileOutputStream("./output.txt")));
         } catch (FileNotFoundException e) {
             e.printStackTrace();
         }

        Task task = new Task();
        MyThread1 thread1 = new MyThread1(task);
        MyThread2 thread2 = new MyThread2(task);
        thread1.setName("A");
        thread2.setName("B");
        thread1.start();
        thread2.start();

     }
}
