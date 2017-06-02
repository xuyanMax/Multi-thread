package ch2_sync_static_two_type_lock;

/**
 * Created by xu on 2017/6/1.
 */
public class Run {
    /*
    静态同步synchronized方法月synchronized(class) 代码块
    关键字synchronized可以用在static静态方法上，这时候，（是对该类的所有对象锁定），而不同于synchronized关键字加到static静态方法上（对对象上锁）。
    *验证synchronized关键字对静态方法和非静态方法上锁性质不同（因为不同，所以会导致异步）
    *
    * 输出结果
    *   线程名称为： C，在 1496329124062 进入同步块
        线程名称为： A，在 1496329124062 进入同步块
        线程名称为： C，在 1496329124063 离开同步块
        线程名称为： A，在 1496329127068 离开同步块
        线程名称为： B，在 1496329127068 进入同步块
        线程名称为： B，在 1496329127068 离开同步块

        A、C异步（持有不同锁）
        C、B同步
    * */
     public static void main(String[] args){
         Service service = new Service();
         ThreadA a = new ThreadA(service);
         ThreadB b = new ThreadB(service);
         ThreadC c = new ThreadC(service);
         a.setName("A");
         b.setName("B");
         c.setName("C");
         a.start();
         b.start();
         c.start();
     }

}
