package currentThreadExt;

public class CountOperate extends Thread {
    public CountOperate() {
        System.out.println("CountOperate --- begin");
		// 仅仅是在实例化，没有用到线程，因此调用这个函数的线程是main
        System.out.println("Thread.currentThread().getName()=" + Thread.currentThread().getName());
		//this代表的是类对象的引用，是个线程类，但是没有设置名字，于是默认给了一个 Thread-0 ne12q
        System.out.println("this.getName()=" + this.getName());
        System.out.println("this.isAlive()=" + this.isAlive());
        System.out.println("Thread.currentThread().isAlive()=" + Thread.currentThread().isAlive());
        System.out.println("CountOperate --- end");
    }

	//
    @Override
    public void run() {
        System.out.println("run --- begin");
        System.out.println("Thread.currentThread().getName()=" + Thread.currentThread().getName());
        System.out.println("this.getName()=" + this.getName());
        System.out.println("this.isAlive()=" + this.isAlive());
        System.out.println("Thread.currentThread().isAlive()=" + Thread.currentThread().isAlive());
        System.out.println("run --- end");
    }
}
