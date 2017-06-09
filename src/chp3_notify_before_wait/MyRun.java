package chp3_notify_before_wait;

/**
 * Created by xu on 2017/6/6.
 */
public class MyRun {
    private String lock = new String("");
    private Runnable runnableA = new Runnable() {
        @Override
        public void run() {

            try {
                synchronized (lock) {
                    System.out.println("开始等待");
                    lock.wait();
                    System.out.println("结束等待");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };
    private Runnable runnableB = new Runnable() {
        @Override
        public void run() {
                synchronized (lock) {
                    System.out.println("开始等通知");
                    lock.notify();
                    System.out.println("结束通知");
                }
        }
    };

     public static void main(String[] args) throws InterruptedException {
         /*如果通知早了，则wait方法也没必要执行了
         * 因此线程b不能比线程a先执行
         * 因此仅仅start a or b线程不能决定两者的启动顺序 需要加上Thread.sleep(waiting - time);
         * */
         MyRun run = new MyRun();
         Thread a = new Thread(run.runnableA);
         Thread b = new Thread(run.runnableB);
         a.start();
         Thread.sleep(1000);
         b.start();


     }

}

