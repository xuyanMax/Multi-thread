package t3_Var_thread_safety;

public class Run {
	/*
	 * 一共创建三个线程，每个线程有各自的count变量，不共享。
	 * 多个线程不可访问同一个实例变量
	 */

	public static void main(String[] args) {
		MyThread a = new MyThread("A");
		MyThread b = new MyThread("B");
		MyThread c = new MyThread("C");
		a.start();
		b.start();
		c.start();

	}

}
