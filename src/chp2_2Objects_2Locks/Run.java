package chp2_2Objects_2Locks;

/**
 * Created by xu on 2017/5/30.
 */
public class Run {
    /**
     * 打印结果：虽然addI()方法有 synchronized 但是打印结果缺失异步的方式。
     * 原因：
     * - 本例是两个线程分别访问同一个类的两个不同实例的相同名称的同步方法，在系统中会产生2个锁是，所以运行结果是异步（交叉）的，
     * 打印的效果就是先打印b，再打印a
     * - synchronized 取得的锁都是"对象锁"，而不是把一段代码或者方法（函数）当作锁，如果多个线程访问的是同一个对象，那么当某线程执行了
     * 待synchronized关键字的方法后，该线程就持有该方法所属对象的锁，则其他线程需要等待
     * - 如果是多个线程访问多个对象则不同，JVM会创造处多个锁。本例产生了两个对象，因此会产生两个锁。
     * <p>
     * todo:可以尝试 添加ThreadC类，并创建实例threadC，该实例访问 threadA相同的对象，可以看出同步和异步的效果
     * <p>
     * a set over!
     * b set over!
     * b num=200
     * a num=100
     * <p>
     * 同步的结果应该如下
     * <p>
     * a set over!
     * a num = 100
     * b set over!
     * b num = 200!
     *
     * @param args
     */
    public static void main(String[] args) {

        HasSelfPrivateNum numRefA = new HasSelfPrivateNum();
        HasSelfPrivateNum numRefB = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(numRefA);
        threadA.start();

        ThreadB threadB = new ThreadB(numRefB);
        threadB.start();

        System.out.println("main end.");
    }
}
