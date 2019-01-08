package ch3_join_test2;

/**
 * Created by xu on 2017/6/9.
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        /*可以用join解决ch3_join_test项目中的疑惑
         * join方法的作用是使所属的线程对象X正常执行run()方法中的任务，而使当前线程Z进行无限期的阻塞，
         * 等待线程销毁后再继续执行线程main后的代码
         * */
        MyThread thread = new MyThread();
        thread.start();
        thread.join();
        Thread.sleep(1000);
        System.out.println("我想当thread对象执行完毕后我再执行");
    }
}
