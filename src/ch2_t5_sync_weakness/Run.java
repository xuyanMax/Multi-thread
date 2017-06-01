package ch2_t5_sync_weakness;

/**
 * Created by xu on 2017/5/31.
 */
public class Run {
     public static void main(String[] args){
         /*
         本例反映synchronized关键字声明方法在某些情况下有弊端，
         比如thread1线程调用同步方法执行一个长时间的任务（这里为3s），则thread2线程必须等待3s后执行。

            输出结果
            begin task.
            长时间处理任务后从远程返回的值 1 threadname=A
            长时间处理任务后从远程返回的值 2 threadname=A
            end task.
            begin task.
            长时间处理任务后从远程返回的值 1 threadname=B
            长时间处理任务后从远程返回的值 2 threadname=B
            end task.
            耗时：6003


         解决方法：使用synchronized同步块

          */

         try {
             Task task = new Task();
             MyThread1 thread1 = new MyThread1(task);
             MyThread2 thread2 = new MyThread2(task);
             thread1.setName("A");
             thread2.setName("B");

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
