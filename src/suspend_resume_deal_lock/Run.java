package suspend_resume_deal_lock;

public class Run {

	public static void main(String[] args) {
		try {
			final SynchronizedObject object = new SynchronizedObject();
			
			Thread thread1 = new Thread(){
				@Override
				public void run(){
					object.printString();	
				}
			};
			
			thread1.setName("a");
			thread1.start();//将会独占SynchronizedObject同步类对象
			Thread.sleep(1000);

			Thread thread2 = new Thread(){
				@Override
				public void run(){
//					object.printString();
					System.out.println("thread2 启动，但无法进入printString()方法！只打印一个begin");//说明thread1独占，stuck
                    System.out.println("因为printString()方法被thread1线程锁定且永远suspend了！");//说明thread1独占，stuck
                    //试图调用
                    object.printString();
				}
			};
			thread2.start();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
