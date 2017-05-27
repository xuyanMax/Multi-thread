package suspend_resume_LockStop;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * Created by xu on 2017/5/27.
 */
public class Run_println {
    public static void main(String[] args){

        /*控制台将不打印main end信息
        * 原因时间是，当程序运行到 MyThread_println中的 println()方法内部停止时，同步锁未被释放。处于"暂停"。
        * main线程的println方法调用将不成功
        * */
        try {
            System.setOut(new PrintStream(new FileOutputStream("./output.txt")));
            MyThread_println thread = new MyThread_println();
            thread.start();
            Thread.sleep(1000);
            thread.suspend();

            System.out.println("main end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
