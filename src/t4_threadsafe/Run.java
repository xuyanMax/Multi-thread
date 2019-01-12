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

   a bb
   a aa

   数据不同步分析：
    Thread-0
	Thread-1
	Thread-1username=b password=bb
	Thread-0username=b password=aa

	0线程进入servlet，对username赋值为"a"后，休眠；
	1线程进入servlet，对username重新赋值"b"，继续对password赋值"bb"，输出 b bb
	0线程休眠结束，对password重新赋值"aa"，输出 b aa
	此时，数据不同步，非线程安全

 */
public class Run {

    public static void main(String[] args) {
        ALogin a = new ALogin();

        BLogin b = new BLogin();
        a.start();
        b.start();

    }

}
