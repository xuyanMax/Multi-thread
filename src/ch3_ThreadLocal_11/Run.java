package ch3_ThreadLocal_11;

/**
 * Created by xu on 2017/6/11.
 */
public class Run {
    //如何实现每一个线程都有自己的共享变量
    //类ThreadLocal主要解决每个线程绑定自己的值，可以将ThreadLocal类比喻成全局存放数据的盒子，盒子中可以存储每个线程的私有数据
    public static ThreadLocal t1 = new ThreadLocal();
    public static void main(String[] args) {
        if (t1.get() == null) {
            System.out.println("从未放过值！");
            //set
            t1.set("我的值");//赋值后顺利取出值农民工倒霉
        }
        System.out.println(t1.get());
        System.out.println(t1.get());

    }
}
