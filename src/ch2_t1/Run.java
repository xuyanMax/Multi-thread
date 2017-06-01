package ch2_t1;

/**
 * Created by xu on 2017/5/30.
 */
public class Run {
     public static void main(String[] args){

         /*
         ThreadA ThreadB 方法内步的私有变量为"线程安全"，不存在"非线程安全"
         如果是类中的实例变量，则会出现"非线程安全"问题
          */
         HasSelfPrivateNum numRef = new HasSelfPrivateNum();
         ThreadA threadA = new ThreadA(numRef);
         threadA.start();

         ThreadB threadB = new ThreadB(numRef);
         threadB.start();

         System.out.println("main end.");
     }
}
