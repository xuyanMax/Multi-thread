package ch3_join_another_test;

/**
 * Created by xu on 2017/6/9.
 */
public class RunFirst {
    public static void main(String[] args) {
          /*
          main end 首先执行，得出结论
          Run1中的 b.join(2000)大部分是先运行的，就是先抢到ThreadB的锁，然后快速进行释放。
          */
        ThreadB b = new ThreadB();
        ThreadA a = new ThreadA(b);
        a.start();
        b.start();
        System.out.println("  main end, time=" + System.currentTimeMillis());

    }
}
