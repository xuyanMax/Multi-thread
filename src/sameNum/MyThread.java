package sameNum;

/*
 * 留意i--与System.out.println()的非线程安全问题
 * 虽然printLn()方法是同步的，但是i--操作确实在进入println之前发生的，所有仍有几率发生非线程安全问题
 */
public class MyThread extends Thread{
	private int i = 5;
	@Override
	/*
	 * 为了防止非线程安全问题，应该使用同步
	 */
	synchronized public void run(){
		
		System.out.println("i="+i--+" thread name = "+Thread.currentThread().getName());
		//
	}
}
