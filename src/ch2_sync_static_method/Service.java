package ch2_sync_static_method;

/**
 * Created by xu on 2017/6/1.
 */
public class Service {

    synchronized public static void printA() {
        try {

                System.out.println("线程名称为： "+ Thread.currentThread().getName()+"，在 "+System.currentTimeMillis()+
                " 进入同步块");

                Thread.sleep(3000);

                System.out.println("线程名称为： "+ Thread.currentThread().getName()+"，在 "+System.currentTimeMillis()+
                        " 离开同步块");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    synchronized public static void printB(){
        System.out.println("线程名称为： "+ Thread.currentThread().getName()+"，在 "+System.currentTimeMillis()+
                " 进入同步块");

        System.out.println("线程名称为： "+ Thread.currentThread().getName()+"，在 "+System.currentTimeMillis()+
                " 离开同步块");


    }
}
