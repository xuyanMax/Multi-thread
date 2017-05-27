package t7_isAlive;

public class MyThread extends Thread{
	@Override
	public void run(){
		System.out.println("run="+this.isAlive()+ " thread->"+this.currentThread().getName());
	}
}
