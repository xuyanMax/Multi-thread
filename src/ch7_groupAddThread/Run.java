package ch7_groupAddThread;

/**
 * Created by xu on 09/07/2017.
 */
public class Run {
      public static void main(String[] args){
/*
控制太打印的信息表示线程组中有两个线程，并且打印除了线程组的名称。另外，两个线程一致无限的并且间隔3秒打印日志
活动线程数：2
B
A
线程组名称:线程组
B
A
B
A
B
A
*/
          ThreadA runnableA = new ThreadA();

          ThreadB runnableB = new ThreadB();

          ThreadGroup group = new ThreadGroup("线程组");
          Thread aThread = new Thread(group, runnableA);
          Thread bThread = new Thread(group, runnableB);
          aThread.setName("A");
          bThread.setName("B");
          aThread.start();
          bThread.start();
          System.out.println("活动线程数："+group.activeCount());
          System.out.println("线程组名称："+group.getName());
      }
}
