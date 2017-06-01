package ch2_t6_sync_slv_weakness;

/**
 * Created by xu on 2017/5/31.
 */
public class Run {
     public static void main(String[] args){
         /*
            使用同步代码块解决同步方法的弊端，但是同步代码块真是同步的吗？真的持有电墙调用对象的锁吗？答案是，参考sync_block_half

            输出结果
            begin task.A
            begin task.B
            长时间处理任务后从远程返回的值 1 threadname=A
            长时间处理任务后从远程返回的值 2 threadname=B/A
            end task.A
            长时间处理任务后从远程返回的值 1 threadname=B
            长时间处理任务后从远程返回的值 2 threadname=B
            end task.B
            耗时：3004


           ？？？ 说明：当一个线程访问对象的一个synchronized同步块时，另一个线程扔可以访问该对象中的非synchronized（this）同步代码块

          */

         try {
             Task task = new Task();
             MyThread1 thread1 = new MyThread1(task);
             MyThread2 thread2 = new MyThread2(task);
             thread1.setName("A");
             thread2.setName("B");

             thread1.setPriority(10);
             thread1.start();
             thread2.start();
             //必须添加下句，否则返回的beginTime 和endTime 为0
             Thread.sleep(7000);

             long beginTime = Math.min(CommonUtils.beginTime1, CommonUtils.beginTime2);
             long endTime = Math.max(CommonUtils.endTimt1, CommonUtils.endTimt2);
             System.out.println("耗时：" + (endTime - beginTime) );

         } catch (InterruptedException e) {
             e.printStackTrace();
         }

     }
}
