package t6_currentThread;

public class Run {
	public static void main(String[] args){
		/*
		 * MyThread构造函数是被main线程调用的
		 * run方法是Thread-0线程调用的，run方法是自动调用的方法
		 */
		MyThread thread = new MyThread();
		thread.start();
	}
}
