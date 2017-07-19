package ch7_getGroupParent;

/**
 * Created by xu on 16/07/2017.
 */
public class Run {
     public static void main(String[] args){

         /*
         * 获取根线程组
         * 运行结果说明JVM的根线程组就是system，再取其父线程组则出现空异常(null exception)
         * */
         System.out.println("线程："+ Thread.currentThread().getName()
                 + " 所在的线程组名为："
                 + Thread.currentThread().getThreadGroup().getName()
         );
         System.out.println("main线程所在的线程组的父线程组的名称是:"
                 + Thread.currentThread().getThreadGroup().getParent().getName()
         );
         System.out.println("main线程所在的线程组的父线程组的父线程组的名称是："
                 + Thread.currentThread().getThreadGroup().getParent().getParent().getName()
         );

     }
}
