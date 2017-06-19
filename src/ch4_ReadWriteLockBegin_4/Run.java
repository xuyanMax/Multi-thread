package ch4_ReadWriteLockBegin_4;

/**
 * Created by xu on 2017/6/19.
 */
public class Run {
     public static void main(String[] args) throws InterruptedException {
         /*从控制台打印的时间来看，两个线程异步,说明"写读"操作是互斥的*/
         Service service = new Service();
         ThreadA a = new ThreadA(service);// read
         ThreadB b = new ThreadB(service);// write
         a.setName("A");
         b.setName("B");
         b.start();

         Thread.sleep(1000);

         a.start();
     }
}
