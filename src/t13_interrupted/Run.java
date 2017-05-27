package t13_interrupted;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Run {

	public static void main(String[] args) {
		
		
		try {
			//控制台日志输出到文本，可查看文件
			System.setOut(new PrintStream(new FileOutputStream("output.txt"))); 
			MyThread thread = new MyThread();
			thread.start();
			thread.sleep(1000);
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
