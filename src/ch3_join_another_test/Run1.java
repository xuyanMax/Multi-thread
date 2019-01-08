package ch3_join_another_test;

/**
 * Created by xu on 2017/6/9.
 */
public class Run1 {
    public static void main(String[] args) {
        /*join方法后面的代码提前执行*/
        // b线程永远在a线程后执行
        // b.join(500)先抢到b锁，后释放，然后a线程抢到b锁，因此a优先执行于b

        try {
            ThreadB b = new ThreadB();
            ThreadA a = new ThreadA(b);
            a.start();
            b.start();

            b.join(500);

            System.out.println("       main end, time" + System.currentTimeMillis());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
