package t14_interrupted_slp;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Run {
/* output 
 * 
	main end!
	run begin
	在sleep中被中断！进入catch！停止状态值：false
	java.lang.InterruptedException: sleep interrupted
		at java.lang.Thread.sleep(Native Method)
		at t14_interrupted_slp.MyThread.run(MyThread.java:14)
 *		
 */
	public static void main(String[] args) {
		
			//控制台日志输出到文本，可查看文件
			try {
				System.setOut(new PrintStream(new FileOutputStream("./output.txt")));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} 
			MyThread thread = new MyThread();
			thread.start(); // 2、myThread 线程睡眠，
			thread.interrupt(); // 1、main线程使--myThread线程中断
		
		System.out.println("main end!"); //1、
		

	}

}
