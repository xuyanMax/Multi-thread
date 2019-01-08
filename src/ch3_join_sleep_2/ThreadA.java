package ch3_join_sleep_2;

/**
 * Created by xu on 2017/6/9.
 */
public class ThreadA extends Thread {
    private ThreadB b;

    public ThreadA(ThreadB b) {
        super();
        this.b = b;
    }

    @Override
    public void run() {
        try {
            synchronized (b) {
                b.start();
                System.out.println("IN threadA waits until threadB completes");
                b.join();// a线程释放b对象的锁, b先执行完再执行A，因为释放了b的锁，因此线程C也可以调用线程b的方法

                for(int i=0 ; i<100; i++) {
                    System.out.print("i="+ (i+1)+" ");
                }

            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
