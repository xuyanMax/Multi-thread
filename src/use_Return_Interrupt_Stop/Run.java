package use_Return_Interrupt_Stop;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Run {

	public static void main(String[] args) {
	
		try {
			System.setOut(new PrintStream(new FileOutputStream("./output.txt"))); 
			MyThread thread = new MyThread();
			
			thread.start();
			Thread.sleep(500); //main睡眠，切换到myThread,run方法执行0.5秒后，
			
			thread.interrupt();//中断myThread
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
