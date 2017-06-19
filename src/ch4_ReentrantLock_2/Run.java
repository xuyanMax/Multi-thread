package ch4_ReentrantLock_2;

/**
 * Created by xu on 2017/6/15.
 */
public class Run {
     public static void main(String[] args) throws InterruptedException {
         /*调用lock.lock()的线程就有了"对象监视器"，其他线程只有等待锁被释放后再次争抢，效果和synchronzied关键字一样，线程之间还是顺序执行的*/
         MyService service = new MyService();
         ThreadA a = new ThreadA(service);
         ThreadB b = new ThreadB(service);
         ThreadAA aa = new ThreadAA(service);
         ThreadBB bb = new ThreadBB(service);
         a.setName("A");
         b.setName("B");
         aa.setName("AA");
         bb.setName("BB");
         a.start();
         aa.start();
         Thread.sleep(2000);

         b.start();
         bb.start();
     }
}
