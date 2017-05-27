package t13_solver_for_print;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Run {

	public static void main(String[] args) {
		
		/*
		 * for下面语句不再执行，解决方法是在MyThread类的run方法中抛出一个中断异常
		 */
		try {
			//控制台日志输出到文本，可查看文件
			System.setOut(new PrintStream(new FileOutputStream("./output.txt"))); 
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(1000);
			thread.interrupt();
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("end!");
		

	}

}
