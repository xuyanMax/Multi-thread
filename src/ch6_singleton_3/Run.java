package ch6_singleton_3;

/**
 * Created by xu on 2017/7/2.
 */
public class Run {
    /*延迟加载／懒汉模式
    * 就是在调用getInstance()方法时实例才被创建，常见的方法是在get方法中进行new实例化
    *
    *
    * 虽然部分代码被上锁，但是还是有非线程安全问题...
    * 遇到多线程的情况下还是无法结局得到用一个实例对象的结果，如何解决"懒汉模式"遇到的多线程的情况？
    *
    * 使用DCL双检查锁机制
    * */
     public static void main(String[] args){
         MyThread t1 = new MyThread();
         MyThread t2 = new MyThread();
         MyThread t3 = new MyThread();
         t1.start();
         t2.start();
         t3.start();

     }
}
