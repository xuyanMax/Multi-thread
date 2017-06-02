package ch2_sync_string_const_poll;

/**
 * Created by xu on 2017/6/1.
 */
public class Service {

     public static void print(String str) {
         int num=0;
        try {
                synchronized (str) {
                    while(num < 10) {
                        num++;
                        System.out.println("线程名称为： " + Thread.currentThread().getName() + "，在 " + System.currentTimeMillis() +
                                " 进入同步块");

                        Thread.sleep(1000);
                    }

                }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
