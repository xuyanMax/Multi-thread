package t1_Thread;
public class Run {
	/*
	 * 两种结果
	 */
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();
		System.out.println("运行结束");

	}

}
