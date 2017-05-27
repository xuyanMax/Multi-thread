package t4_var_t_s_share;
/*
 * 此例(注释部分)是“非线程安全的”，即多个线程对同一个对象中的同一个实例变量进行操作时，会出现值被更改，值不同步的情况，
 * 进而影响程序的执行流程；
 * 此例中，当count--（三部：取值，计算count-1，重新赋值）发生时，多个线程同时访问，那么会出现非线程安全
 * 
 * 非线程安全下，输出的结果有重复
 * 
 * 加synchronized 变线程安全；他使多个线程在执行run方法时，以排队的方式进行处理。当一个线程调用run前，先判断run方法有没有被上锁，
 * 如果上锁，说明其他线程正在调用run方法，必须等其他线程调用结束菜课执行run方法。这样也就实现了调用run方法排队，从而按顺序对count变量减一的效果。
 * 
 * 当一个线程想要执行synchronized方法里面的代码时，线程首先尝试取拿这把锁，如果拿到，执行；否则，不断尝试拿锁直到拿到为止
 */
public class MyThread extends Thread{
	private int count = 5;

	//	@Override
//	public void run(){
//		super.run();;
//		count--;
//		System.out.println("由" + this.currentThread().getName()+" 计算，count="+count);
//	}
	
	@Override
	synchronized public void run(){
		super.run();;
		count--;
		System.out.println("由" + this.currentThread().getName()+" 计算，count="+count);
	}
}
