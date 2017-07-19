package ch7_mainGroup;

/**
 * Created by xu on 16/07/2017.
 */
public class Run {
     public static void main(String[] args){

         //用显式的方式在线程组中添加一个子线程组

         System.out.println("线程组名称："
                    + Thread.currentThread().getThreadGroup().getName());
         System.out.println("线程组中活动的线程数量:"
                    + Thread.currentThread().getThreadGroup().activeCount()
         );

         System.out.println("线程组中线程组的数量 - 加之前:"
                 + Thread.currentThread().getThreadGroup().activeGroupCount()
         );

         //添加线程组new group到 main(当前)线程组中
         ThreadGroup tg = new ThreadGroup(Thread.currentThread().getThreadGroup(), "new group");

         System.out.println("线程组中线程组的数量 - 加之后:"
                 + Thread.currentThread().getThreadGroup().activeGroupCount()
         );
         System.out.println("父线程组名称："+ Thread.currentThread().getThreadGroup().getParent().getName() );
     }
}
