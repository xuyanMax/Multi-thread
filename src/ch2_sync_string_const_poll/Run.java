package ch2_sync_string_const_poll;


/**
 * Created by xu on 2017/6/1.
 */
public class Run {
    /*
    数据类型String的常量池特性
    在JVM中具有String"常量池缓存"的功能 System.out.println("a"=="a"); //true

    String aa = new String("AA");
    String ba = new String ("AA");
    System.out.println(aa==ba); // false

    String的两个值都是"AA"，因为a、b线程持有相同的锁，所以b线程未能启动


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
