package use_Return_Interrupt_Stop;

public class MyThread extends Thread{
/*
 * 将interrupt方法与return结合使用也能实现停止线程的效果
 * 
 */
	private int i=0;
	@Override
	public void run(){
		while (true) {
			if (this.interrupted()){
			    System.out.println("停止了！");
				return;
			}
			System.out.println("i="+(i++ + 1) + Thread.currentThread().getName());
			
		}
	}
}
