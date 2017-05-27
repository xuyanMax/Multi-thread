package t4_threadsafe;

/*
 * 实现一个非线程安全的环境：不加synchronized
 * 线程安全或非线程安全，输出结果都有两种
 * 解决非线程安全的方法是使用synchronized关键字
 * 
 * 线程安全
 * username=b password=bb
   username=a password=aa
   
   username=a password=aa
   username=b password=bb
   
   非线程安全
   a aa
   b aa
   
   b bb
   b aa
 */
public class Run {

	public static void main(String[] args) {
		ALogin a = new ALogin();
		
		BLogin b = new BLogin();
		a.start();
		b.start();

	}

}
