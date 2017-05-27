package sameNum;

public class Run {

	public static void main(String[] args) {
	MyThread mythread = new MyThread();
	// 将mythread中的run方法交由其他的线程进行调用
	Thread t1 = new Thread(mythread);

	Thread t2 = new Thread(mythread);

	Thread t3 = new Thread(mythread);

	Thread t4 = new Thread(mythread);
	
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	

	}

}
