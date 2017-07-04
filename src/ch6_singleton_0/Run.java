package ch6_singleton_0;

/**
 * Created by xu on 2017/7/2.
 */
public class Run {
    /*立即加载／饿汉模式
    * 直接new实例化，在类的使用时已经将对象创建完毕
    *
    * 控制台打印同一个值，说明对象是用一个，也就实现了立即加载型单例设计模式
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
