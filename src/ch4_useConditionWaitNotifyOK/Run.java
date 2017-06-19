package ch4_useConditionWaitNotifyOK;

/**
 * Created by xu on 2017/6/15.
 */
public class Run {
     public static void main(String[] args) throws InterruptedException {
         /*输出
         * await 开始时间=1497531958830
         * signal 开始时间=1497531960833
         *
         * 成功实现了等待／通知模式
         * Object类中的wait(long timeout)方法相当于Condition 类中的await(long time, TimeUnit unit)方法
         * Object类中的notify()方法相当于Condition类中的signal()方法
         * Object类中的notifyAll()方法相当于Condition类中的signalAll()方法
         * */
         MyService service  = new MyService();
         ThreadA a = new ThreadA(service);
         a.start();

         Thread.sleep(2000);
         service.signal();
     }
}
