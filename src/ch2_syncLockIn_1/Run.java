package ch2_syncLockIn_1;

/**
 * Created by xu on 2017/5/30.
 */
public class Run {

     public static void main(String[] args){
         /*
         * 可重入锁：自己可以再次获取自己的内部锁
         * thread线程获得了Service对象的锁，此时这个对象锁还没释放，当该线程想要再次获取这个对象的锁的时候还是可以获取的，
         * 否则陷入死锁。
         * 这也说明 synchronized方法／块的内部调用本类的其他synchronized方法／块时，是永远可以得到锁的！
         *
         *  输出结果
         *  service 1
            service 2
            service 3
         *
         * */

         try {
             MyThread thread = new MyThread();
             thread.setName("A");
             MyThread thread2 = new MyThread();
             thread2.setName("B");

             thread.start();
             thread2.start();
             Thread.sleep(2000);

         } catch (InterruptedException e) {
             e.printStackTrace();
         }


     }
}
