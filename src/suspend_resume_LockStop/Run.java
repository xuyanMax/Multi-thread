package suspend_resume_LockStop;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * Created by xu on 2017/5/27.
 */
public class Run {
    public static void main(String[] args){

        /*控制台打印main end 信息*/
        try {
            System.setOut(new PrintStream(new FileOutputStream("./output.txt")));

            MyThread thread = new MyThread();
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
