package ch4_lockInterruptibly;

/**
 * Created by xu on 2017/6/18.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        /*lockInterruptibly() 如果当前线程未被中断，则获取锁定，如果已经被中断则出现异常*/

        final Service service = new Service();
        Runnable runnableRef = new Runnable() {
            @Override
            public void run() {
                service.waitMethod();
            }
        };
        Thread a = new Thread(runnableRef);
        a.setName("A");
        a.start();
//         Thread.sleep(500);

        Thread b = new Thread(runnableRef);
        b.setName("B");
        b.start();
        b.interrupt(); //线程被中断 测试lock.lockInterruptibly()报出异常
        System.out.println("main end");

    }
}
