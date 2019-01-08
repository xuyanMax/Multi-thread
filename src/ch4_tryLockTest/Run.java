package ch4_tryLockTest;

/**
 * Created by xu on 2017/6/18.
 */
public class Run {
    public static void main(String[] args) {
        /*仅在调用时锁定未被了ing一个线程保持的情况虾，获得该锁*/
        final MyService service = new MyService();
        Runnable runnableRef = new Runnable() {
            @Override
            public void run() {
                System.out.println("调用waitMethod时间=" + System.currentTimeMillis() + ", " + Thread.currentThread().getName());
                service.waitMethod();
            }
        };

        Thread a = new Thread(runnableRef);

        a.setName("A");
        a.start();

        Thread b = new Thread(runnableRef);
        b.setName("B");
        b.start();


    }
}
