package suspend_resume_test;

public class Run {

	public static void main(String[] args) {
		/*
		 * 通过suspend方法暂停线程，再通过resume方法恢复线程
		 */
		try {
			MyThread myThread = new MyThread();
			myThread.start();
			Thread.sleep(2000);
			
			//A
			myThread.suspend();
			System.out.println("A= " + System.currentTimeMillis() + " i="+myThread.getI());
			Thread.sleep(2000);//main线程休眠，测试myThread线程是否被暂停，如暂停则i值保持不变
			System.out.println("A= " + System.currentTimeMillis() + " i="+myThread.getI());
			
			
			//B
			myThread.resume();
			Thread.sleep(2000);// main休眠。测试myThread线程是否被唤醒，如是则i值增加
			System.out.println("B= " + System.currentTimeMillis() + " i="+myThread.getI());
			System.out.println("B= " + System.currentTimeMillis() + " i="+myThread.getI());
			
			//C
			myThread.suspend();
			System.out.println("C= " + System.currentTimeMillis() + " i="+myThread.getI());
			Thread.sleep(2000);//main线程休眠，测试myThread线程是否被暂停，如暂停则i值保持不变
			System.out.println("C= " + System.currentTimeMillis() + " i="+myThread.getI());
			
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
