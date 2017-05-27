package randomThread;

public class MyThread extends Thread{
	@Override
	public void run(){
		
			
			try {
				for (int i=0; i<10; i++) {
					int time = (int) (Math.random() * 1000);
					System.out.println("run"+i+"=" + Thread.currentThread().getName());
					Thread.sleep(time);
					System.out.println("zzZZZ...myThread");
					System.out.println("run"+i+"=" + Thread.currentThread().getName());
				
				}
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
	}
}
