package ch2_sync_inner_static_class_1;

/**
 * Created by xu on 2017/6/7.
 */
public class Run {
     public static void main(String[] args){
         /*锁不同，即持有的"对象监视器"不同，所以交叉打印*/

       final OutClass.Inner in = new OutClass.Inner();
       Thread thread1 = new Thread(new Runnable() {
           @Override
           public void run() {
               in.method();
           }
       }, "A");
       Thread thread2 = new Thread(new Runnable() {
           @Override
           public void run() {
               in.method2();
           }
       }, "B");
       thread1.start();
       thread2.start();


     }
}
