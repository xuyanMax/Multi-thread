package ch2_t2;

/**
 * Created by xu on 2017/5/30.
 */
public class Run {
     public static void main(String[] args){

         /*
          输出结果
            a set over!
            b set over!
            b num=200
            a num=200

          不同步原因：多个线程同时访问1个对象中（HasSelfPrivateNum）的实例变量（此变量非芳芳内部的私有变量）
          如果该对象有多个实例变量，则运行的结果可能出现"交叉"的情况；
          如果只有1个实例变量，则可能出现"覆盖"。

          解决方案：
          在方法addI()前架关键字 synchronized即可 (注意打印结果也是同步的)
            a set over!
            a num=100
            b set over!
            b num=200

          */
         HasSelfPrivateNum numRef = new HasSelfPrivateNum();
         ThreadA threadA = new ThreadA(numRef);
         threadA.start();

         ThreadB threadB = new ThreadB(numRef);
         threadB.start();

         System.out.println("main end.");
     }
}
