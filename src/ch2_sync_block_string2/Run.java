package ch2_sync_block_string2;
/**
 * Created by xu on 2017/6/1.
 */
public class Run {
    /*
    * 本例验证使用synchronized(非this对象x)同步代码块格式时，持有不同的对象监视器是异步的效果／。
    *
    * 输出结果
    *   a begins.
        b begins.
        b ends.
        a ends.

      由于对象监视器不同，因此运行结果就是异步的
      由于多个线程调用同一个方法是随机的，容易产生"脏读"问题


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
