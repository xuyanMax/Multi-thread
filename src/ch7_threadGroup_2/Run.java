package ch7_threadGroup_2;

/**
 * Created by xu on 19/07/2017.
 */
public class Run {
     public static void main(String[] args){
         MyThreadGroup group = new MyThreadGroup("我的线程组");
         MyThread[] myThreads = new MyThread[10];
         for (int i=0; i<10; i++) {
             myThreads[i] = new MyThread(group, "线程"+i, "1");
             myThreads[i].start();
         }
         // "a"，参数错误报错， 如何让其他线程因为异常的出现而全部停止运行呢？
         MyThread newT = new MyThread(group, "报错线程", "a");
         newT.start();
     }
}
