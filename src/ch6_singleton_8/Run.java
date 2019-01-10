package ch6_singleton_8;

/**
 * Created by xu on 2017/7/2.
 */
public class Run {
    /*
     *  使用静态代码块来实现单例设计模式
     * */
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t1.start();
        t2.start();
        t3.start();

    }
}
