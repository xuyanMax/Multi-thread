package ch2_sync_block_string;

/**
 * Created by xu on 2017/6/1.
 */
public class Run {
    /*synchronized 同步方法与 synchronized(this) 同步代码块分别有两种作用，基本一致，区别就在第二点
    * 1、对其他synchronized同步方法或者synchronized(this)同步砝码块调用呈阻塞状态
    * 2、同一时间只有一个线程可以执行synchronized/synchronized(this)同步方法中的代码. (两者的区别 /)
    *
    * Java还支持对"任意对象"作为"对象监视器"来实现同步的功能。这个"任意对象"大多数是实例变量即方法的参数，使用格式为synchronzied(非 this 对象)
    * 1、在多个线程持有"对象监视器"为同一个对象的前提下，同一时间只有一个线程可以执行synchronized（非this对象x）同步砝码块中的代码
    * 2、当持有"对象监视器"为同一个对象的前提下，同一个时间只有一个线程可以调用synchronzied（非this对象）同步代码块中的嗲吗

    * 本例验证第一点
    *
    * 输出结果
    *   线程名称为： A，在 1496283859615 进入同步块
        线程名称为： A，在 1496283862619 离开同步块
        线程名称为： B，在 1496283862619 进入同步块
        线程名称为： B，在 1496283865622 离开同步块

    * */
     public static void main(String[] args){
         Service service = new Service();
         ThreadA a = new ThreadA(service);
         ThreadB b = new ThreadB(service);
         a.setName("A");
         b.setName("B");
         a.start();
         b.start();
     }

}
