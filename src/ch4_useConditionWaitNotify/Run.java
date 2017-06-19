package ch4_useConditionWaitNotify;

/**
 * Created by xu on 2017/6/15.
 */
public class Run {
     public static void main(String[] args){
         /*输出一个字母A
         * A
         *
         * 原因是调用了Condition对象的await()方法，使得当前执行任务的线程进入了等待WAITING状态
         *
         * */
         MyService service  = new MyService();
         ThreadA a = new ThreadA(service);
         a.start();
     }
}
