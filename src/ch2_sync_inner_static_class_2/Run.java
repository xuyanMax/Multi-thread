package ch2_sync_inner_static_class_2;

/**
 * Created by xu on 2017/6/7.
 */
public class Run {
     public static void main(String[] args){
         /*锁不同，两个类锁，两个不同的对象锁，
         持有类锁的两个线程同步执行，a-d
         持有不同锁的两个线程异步执行 a-b-c
         即持有的"对象监视器"不同，所以交叉打印*/

       final OutClass.Inner1 in1 = new OutClass.Inner1();
         final OutClass.Inner2 in2 = new OutClass.Inner2();
       Thread thread1 = new Thread(new Runnable() {
           @Override
           public void run() {
               in1.method();
           }
       }, "A");
       Thread thread2 = new Thread(new Runnable() {
           @Override
           public void run() {
               in1.method2();
           }
       }, "B");
         Thread thread3 = new Thread(new Runnable() {
             @Override
             public void run() {
                 in2.method();
             }
         }, "C");
         Thread thread4 = new Thread(new Runnable() {
             @Override
             public void run() {
                 in1.method();
             }
         }, "D");
       thread1.start();//类锁
       thread2.start();//in1对象锁
       thread3.start();//in2对象锁
       thread4.start();//类锁



     }
}
