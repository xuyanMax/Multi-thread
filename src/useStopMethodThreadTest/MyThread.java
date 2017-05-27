package useStopMethodThreadTest;

public class MyThread extends Thread{
	private int i = 0;
	@Override
	public void run (){
		super.run();
		/*
		 * 在线程interrupted状态下睡眠线程，效果是：
		 * 直接进入catch语句，并且清楚停止状态值，使之变为false
		 */
		
				try {
					while (true){
						i++;
						System.out.println("i="+i);
						Thread.sleep(1000);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
	}
}
