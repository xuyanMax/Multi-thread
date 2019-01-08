package ch4_ReadWriteLockBegin_2;

/**
 * Created by xu on 2017/6/19.
 */
public class Run {
    public static void main(String[] args) {
         /*从控制台打印的时间来看，两个线程异步进入 lock.writeLock().lock()方法后的代码，说明此处使用写锁同一时间只允许一个线程
         执行lock()后代码*/
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        ThreadB b = new ThreadB(service);
        a.setName("A");
        b.setName("B");
        a.start();
        b.start();
    }
}
