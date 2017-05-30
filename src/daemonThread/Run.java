package daemonThread;

/**
 * Created by xu on 2017/5/30.
 */
public class Run {
     public static void main(String[] args){
         /*Java 线程中有两种线程，一种是用户线程，一种是守护线程*/
         /*GC 垃圾回收器是典型的守护线程，当进程中没有非守护线程（用户线程时），则垃圾回程线程也无存在的意义
         * 因此，下列测试程序：main线程休眠，守护线程工作，main线程结束，守护线程结束
         * */
         try{
             MyThread thread = new MyThread();
             thread.setDaemon(true);
             thread.start();

             Thread.sleep(5000);
             System.out.println("守护线程随着main线程的结束而结束");
             Thread.sleep(1000);
             System.out.println("守护线程随着main线程的休眠二再次工作，待main线程休眠结束，守护线程结束");
         } catch(InterruptedException e) {
             e.printStackTrace();
         }
     }
}
