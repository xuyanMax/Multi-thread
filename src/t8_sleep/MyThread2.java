package t8_sleep;

public class MyThread2 extends Thread{

	@Override
	public void run(){
		try {
			
			System.out.println("run thread->" + this.currentThread().getName() + " begin " + System.currentTimeMillis());
			Thread.sleep(2000); 
			System.out.println("run thread->" + this.currentThread().getName() + " end" + System.currentTimeMillis());
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
