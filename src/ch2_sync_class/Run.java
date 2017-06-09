package ch2_sync_class;

/**
 * Created by xu on 2017/6/1.
 */
public class Run {
    /*
      synchronized(class)代码块
      作用和synchronized static 方法的作用相同，都是对一个类的所有对象持有锁
      这个锁不同于对象锁，两个不是一种锁，所以当把printB()方法的synchronized关键字去掉，会交叉打印（锁不同）。
    * */
     public static void main(String[] args){
         Service service = new Service();
         ThreadA a = new ThreadA(service);
         ThreadB b = new ThreadB(service);
         a.setName("A");
         b.setName("B");
         a.start();
         b.start();
     }

}
