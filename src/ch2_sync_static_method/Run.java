package ch2_sync_static_method;

/**
 * Created by xu on 2017/6/1.
 */
public class Run {
    /*
    静态同步synchronized方法月synchronized(class) 代码块
    关键字synchronized可以用在static静态方法上，这时候，是对该类的锁定，而不同于synchronized关键字加到static静态方法上（对对象上锁）。
    * 输出结果
    *   线程名称为： A，在 1496283859615 进入同步块
        线程名称为： A，在 1496283862619 离开同步块
        线程名称为： B，在 1496283862619 进入同步块
        线程名称为： B，在 1496283865622 离开同步块

    * */
     public static void main(String[] args){
         ThreadA a = new ThreadA();
         ThreadB b = new ThreadB();
         a.setName("A");
         b.setName("B");
         a.start();
         b.start();
     }

}
