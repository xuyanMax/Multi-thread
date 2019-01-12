package t12_interrupted_clr;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
//		try { 
        //自己添加用于测试
//			Thread.sleep(0); //当前线程即，MyThread休眠
        for (int i = 0; i < 500000; i++)
            System.out.println(i);


//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
    }
}
