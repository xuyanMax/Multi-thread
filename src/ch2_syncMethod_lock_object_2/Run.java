package ch2_syncMethod_lock_object_2;

/**
 * Created by xu on 2017/5/30.
 */
public class Run {
     public static void main(String[] args){
         /*
            methodB() 去除synchronized关键字

            输出结果如下
            begin methodA() threadName=A
            begin methodB() threadName=B 1496131135723
            methodB() end
            methodA() endtime 1496131140726

            可见，虽然线程A率先持有了object对象的锁，但是线程B完全可以"异步调用"非synchronized类型的方法

            methodB() 添加synchronized关键字

            输出结果如下

            begin methodA() threadName=A
            methodA() endtime 1496131289052
            begin methodB() threadName=B 1496131289052
            methodB() end

            线程A、B同步运行

            结论：
            (1) A线程先持有object对象的Lock锁，B线程可以以异步的方式调用object对象中的非synchronzied类型的方法

            (2) A线程先持有object对象的Lock锁，B线程不可以以异步的方式调用object对象中的synchronzied类型的方法，必须排队等待

          */

         MyObject objecet = new MyObject();
         ThreadA threadA = new ThreadA(objecet);
         threadA.setName("A");

         ThreadB threadB = new ThreadB(objecet);
         threadB.setName("B");

         threadA.start();
         threadB.start();
     }
}
