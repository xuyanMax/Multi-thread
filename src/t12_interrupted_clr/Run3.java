package t12_interrupted_clr;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Run3 {
    /*
     * isInterrupted()方法
     * 判断是否中断，但是不清楚状态标志
     */
    public static void main(String[] args) {
        try {
            //控制台日志输出到文本，可查看文件
            System.setOut(new PrintStream(new FileOutputStream("output.txt")));
            MyThread thread = new MyThread();
            thread.start();
            thread.sleep(1000);
            thread.interrupt();
            System.out.println("是否停止1？=" + Thread.interrupted()); //ture
            System.out.println("是否停止2？=" + Thread.interrupted()); //false
            System.out.println("end");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
