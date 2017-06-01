package t3_Var_thread_safety;

public class Run {
	/*
	 * 一共创建三个线程，每个线程有各 自的count变量，不共享，自己减少自己的count变量的值，
	 * 此实例并不存在多个线程访问同一个实例变量的情况。
	 * 如何是心啊多个线程访问同一个变量，见 t4_var_t_s_share

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
