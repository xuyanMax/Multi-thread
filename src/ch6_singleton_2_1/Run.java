package ch6_singleton_2_1;

/**
 * Created by xu on 2017/7/2.
 */
public class Run {
    /*延迟加载／懒汉模式
    * 就是在调用getInstance()方法时实例才被创建，常见的方法是在get方法中进行new实例化
    * 当第一个线程调用get方法后，其余线程只需要直接返回uniqueInstance即可，因此三个线程几乎是同时返回hashCode
    *
    * 问题：同步方法，效率低，下一步尝试同步代码块
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
