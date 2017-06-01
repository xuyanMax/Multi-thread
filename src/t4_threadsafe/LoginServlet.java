package t4_threadsafe;

// 本地模拟一个Servlet组件
public class LoginServlet {
	
		private static String usernameRef;
		private static String passwordRef;
		
//		synchronized
		public static void doPost(String username, String password) {
			try {
				//测试
				System.out.println(Thread.currentThread().getName());
				usernameRef = username;
				if (usernameRef.equals("a"))
					Thread.sleep(2000);
				passwordRef = password;
				// 体现线程不安全的地方为 usernameRef 被改写,可能对应的passwordRef 与对其进行改写的password不等
				//这种情况在添加synchronized后解决
				System.out.println(Thread.currentThread().getName()+"username="+usernameRef+" password="+password);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
}
