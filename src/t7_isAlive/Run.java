package t7_isAlive;

/*
 * isAlive()勇于测试线程是否处于活动状态，就是线程已经启动且尚未终止的状态（线程处于正在运行或者开始运行的状态，即“存活”）
 * 结果可能两种
begin ===false
end ===true //mythread线程还未执行完毕，所以输出true
run=true

begin ===false
end ===false
run=true
 */
public class Run {

	public static void main(String[] args) {
		MyThread thread = new MyThread();
		System.out.println("begin ===" + thread.isAlive());
		thread.start();
		System.out.println("end ==="+thread.isAlive() + " thread->"+ thread.currentThread().getName());
		
	}

}
