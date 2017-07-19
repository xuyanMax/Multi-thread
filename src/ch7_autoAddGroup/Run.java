package ch7_autoAddGroup;

/**
 * Created by xu on 16/07/2017.
 */
public class Run {
     public static void main(String[] args){
         //线程组自动归属属性
         //本实验要证明的是，在实例化一个ThreadGroup线程组x时，如果不指定所属的线程组，则x线程组自动归到当前线程对象所属的线程组
         //也就是隐式地在一个线程组中添加一个子线程组，所以在控制台中打印的线程组数量由0-----变------1

         //方法activeGroupCount()取得当前线程组对象中的子线程组数量
         //方法enumerate()的作用是将线程组中的子线程组以复制的形式
         // 拷贝到ThreadGroup[] 数组对象中
         System.out.println("A处线程："+Thread.currentThread().getName()
                 + " 所属的线程组名为："
                 + Thread.currentThread().getThreadGroup().getName()
                 + " 中有线程组数量："
                 + Thread.currentThread().getThreadGroup().activeGroupCount()
         );
         ThreadGroup group = new ThreadGroup("新的组");//自动添加到main组中
         System.out.println("B处线程：" + Thread.currentThread().getThreadGroup()
                 + " 所属的线程组名为："
                 + Thread.currentThread().getThreadGroup().getName()
                 + " 中有线程组数量："
                 + Thread.currentThread().getThreadGroup().activeGroupCount()
         );
         ThreadGroup[] threadGroups = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
         Thread.currentThread().getThreadGroup().enumerate(threadGroups);
         for (ThreadGroup tg:threadGroups)
             System.out.println("第一个线程组名称为："+tg.getName());
     }
}
