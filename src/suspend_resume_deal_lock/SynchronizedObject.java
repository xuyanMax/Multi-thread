package suspend_resume_deal_lock;
/*
 * suspend resume 缺点1独占（公共同步对象的独占，使得其他线程无法访问公共同步对象）
 * 
 * 缺点2 不同步 参见suspend_resume_async项目
 * 
 */
public class SynchronizedObject {
	synchronized public void printString(){
		System.out.println("begin");
		if(Thread.currentThread().getName().equals("a")) {
			System.out.println("a线程永远 suspend！");//调用该方法的线程一旦被暂停，则其独占该同步对象
			Thread.currentThread().suspend();
		} 
		System.out.println("end");
	}
}
