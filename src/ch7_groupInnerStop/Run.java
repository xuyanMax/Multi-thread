package ch7_groupInnerStop;

/**
 * Created by xu on 16/07/2017.
 */
public class Run {
    //组内的线程批量停止
    //通过将线程归属到线程组中，
    //当调用线程组ThreadGroup.interrupted()方法时，可以将该组中的所有正在运行的线程批量停止
         public static void main(String[] args) throws InterruptedException {
             ThreadGroup group = new ThreadGroup("我的线程组");
             for (int i=0; i<5; i++) {
                 MyThread thread = new MyThread(group, "线程" + i);
                 thread.start();
             }

//             Thread.sleep(5000);
             System.out.println("main中有线程组的数量"+Thread.currentThread().getThreadGroup().getName());
             group.interrupt();
             System.out.println("调用interrupted方法");
         }
}
