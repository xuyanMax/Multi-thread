package ch4_ReentrantLock;

/**
 * Created by xu on 2017/6/15.
 */
public class Run {
     public static void main(String[] args){
         /*JDK 1.5 中新增了ReentrantLock类能实现线程之间的同步呼哧，而且功能上更加强大，比如具有嗅探锁定、多路分支通知等功能，
         * 而且使用也比synchronized更加灵活
         *
         * 线程打印的数据是分组打印，但是线程之间的顺序是随机
         * */
         MyService service = new MyService();
         MyThread a1 = new MyThread(service);
         MyThread a2 = new MyThread(service);
         MyThread a3 = new MyThread(service);
         MyThread a4 = new MyThread(service);
         MyThread a5 = new MyThread(service);
         a1.start();
         a2.start();
         a3.start();
         a4.start();
         a5.start();

     }
}
