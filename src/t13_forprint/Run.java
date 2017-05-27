package t13_forprint;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Run {

	public static void main(String[] args) {
		
		/*
		 * myThread 线程虽然停止，但是，如果for语句下方仍然有语句，还是会继续运行..因此会输出“end”
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
