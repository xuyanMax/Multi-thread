package countPriority;

/**
 * Created by xu on 2017/5/30.
 */
public class Run {

    public static void main(String[] args) {
// 看哪个线程运行的快
//        System.out.println(Integer.MAX_VALUE); // 2^32 - 1
//        System.out.println(Long.MAX_VALUE); // 2^64 - 1
        try {
            ThreadA a = new ThreadA();

            a.setPriority(Thread.NORM_PRIORITY - 3);
            a.start();

            ThreadB b = new ThreadB();
            b.setPriority(Thread.NORM_PRIORITY + 3);
            b.start();

            Thread.sleep(5000);

            a.interrupt();
            b.interrupt();
            System.out.println("a=" + a.getCount());
            System.out.println("b=" + b.getCount());
        } catch (InterruptedException e) {
            System.out.println("aaa");
            e.printStackTrace();
        }


    }
}
