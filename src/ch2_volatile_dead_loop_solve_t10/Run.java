package ch2_volatile_dead_loop_solve_t10;

/**
 * Created by xu on 2017/6/4.
 */
public class Run {
    /*解决死循环
    * 但是，如果运行在JVM设置为Server服务器的环境中，仍会出现死循环
    * 原因如下：
    * 当 new Thread(psService).start()启动时，变量isContinuedPrint = true；存在于"公共堆栈"以及线程的"私有堆栈"中。
    * JVM被设置为-server模式时，为了线程运行的效率，线程一致在"私有堆栈"中取得isContinuedPrint的值为true，而代码
    * psService.setContinuedPrint(false);虽然被执行，但是更新的缺失"公共堆栈"中的变量isContinuedPrint，因此死循环
    *
    * 这个问题实质是：私有堆栈中的值和公共堆栈中的值不同步造成的，解决关键是使用volatile关键字，它的主要作用是当线程访问变量isContinuedPrint时，
    * 强制性从公共堆栈中取值。
    * 在变量isContinuedPrint 前  加 volatile
    *
    * volatile 与 synchronized区别
    * 1、volatile是线程同步的轻量级实现，所以volatile性能可能比synchronized好，并且volatile只修饰变量；而synchronized修饰方法、代码块
    *
    * 2、多线程访问volatile不会发生阻塞，而sync会
    *
    * 3、volatile能保证数据的"可见性"，但不能保证"原子性"；而sync可以保证原子性，也可间接保证可见行，因为它会将私有内存和公共内存中的数据做同步。
    *
    * 4、volatile解决的是变量在多个线程之间的可见性，而sync解决的是多个线程之间访问资源的同步性
    *
    * */
     public static void main(String[] args){
         PrintString psService = new PrintString();

         new Thread(psService).start();

         System.out.println("停止printStringMethod，stopThread="+Thread.currentThread().getName());

         psService.setContinuedPrint(false);
     }
}
