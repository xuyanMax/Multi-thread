package ch6_singleton_1;

/**
 * Created by xu on 2017/7/2.
 */
public class Run {
    /*延迟加载／懒汉模式
     * 就是在调用getInstance()方法时实例才被创建，常见的方法是在get方法中进行new实例化
     *
     * 控制台打印不是同一个值，说明对象不是同一个
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
