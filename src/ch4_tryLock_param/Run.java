package ch4_tryLock_param;

/**
 * Created by xu on 2017/6/18.
 */
public class Run {
    public static void main(String[] args){
        /*如果锁定在给定等待时间内没有被另一个线程保持，且当线程未被中断，则获取该锁定*/
        final MyService service = new MyService();
        Runnable runnableRef = new Runnable() {
            @Override
            public void run() {
                System.out.println("调用waitMethod时间="+System.currentTimeMillis() + ", "+Thread.currentThread().getName());
                service.waitMethod();
            }
        };

        Thread a = new Thread(runnableRef);

        a.setName("A");a.start();

        Thread b = new Thread(runnableRef);
        b.setName("B");b.start();



    }
}
