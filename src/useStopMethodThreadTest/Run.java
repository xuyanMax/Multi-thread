package useStopMethodThreadTest;

public class Run {

	public static void main(String[] args) {
		
		/*
		 * 暴力停止线程，线程被暴力停止后，图标呈现灰色
		 * 方法不建议使用
		 * 
		 * 结果
		 * i=1
		 * main end!

		 */
		try {
			//控制台日志输出到文本，可查看文件
//			System.setOut(new PrintStream(new FileOutputStream("./output.txt"))); 
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(200);
			thread.stop(); // deprecated
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("main end!");
		

	}

}
