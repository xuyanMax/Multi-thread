package ch7_stateTest_1;

/**
 * Created by xu on 09/07/2017.
 */
public class Run {
     public static void main(String[] args){
/*
NEW状态是线程实例化后还从未执行start()方法时的状态，
而RUNNABLE状态是线程进入运行的状态，
TERMINATED是线程被销毁时的状态

构造方法中的状态：RUNNABLE
main 方法中的状态-1：NEW
run 方法中的状态：RUNNABLE
main 方法中的状态-2：TERMINATED

构造方法中的日志其实是现实main祝线程的状态为RUNNABLE
*/
         try {
             MyThread t = new MyThread();
             System.out.println("main 方法中的状态-1："+t.getState());//NEW
             Thread.sleep(1000);
             t.start();
             Thread.sleep(1000);
             System.out.println("main 方法中的状态-2："+ t.getState());//TERMINATED
         } catch (InterruptedException e) {
             e.printStackTrace();

         }
     }
}
