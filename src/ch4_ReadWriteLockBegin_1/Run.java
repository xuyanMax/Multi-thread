package ch4_ReadWriteLockBegin_1;

/**
 * Created by xu on 2017/6/19.
 */
public class Run {
     public static void main(String[] args){
         /*从控制台打印的时间来看，两个线程几乎同时进入 lock.readLock().lock()方法后的代码，说明此处使用读锁能够提高程序运行的效率*/
         Service service = new Service();
         ThreadA a = new ThreadA(service);
         ThreadB b = new ThreadB(service);
         a.setName("A");
         b.setName("B");
         a.start();
         b.start();
     }
}
