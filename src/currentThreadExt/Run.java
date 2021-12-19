package currentThreadExt;

public class Run {

	public static void main(String[] args) {
		CountOperate co = new CountOperate();
		Thread t1 = new Thread(co);
		t1.setName("A");
		//run()方法是自动调用的 线程为Thread-0
		t1.start();
	}
}
