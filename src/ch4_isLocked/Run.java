package ch4_isLocked;

/**
 * Created by xu on 2017/6/17.
 */
public class Run {
    public static void main(String[] args){
        /*检查此锁是否有任意线程保持着*/
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
