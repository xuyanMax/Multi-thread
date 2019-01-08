package ch4_isHeldByCurrentThread;

/**
 * Created by xu on 2017/6/17.
 */
public class Run {
    public static void main(String[] args) {
        /*检查当前线程是否保持此锁*/
        Service service = new Service(true);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.serviceMethod();
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
