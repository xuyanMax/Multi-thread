package ch3_ThreadLocal_s5;

/**
 * Created by xu on 2017/6/12.
 */
public class Run  {
     public static void main(String[] args){
         //再次验证数据的隔离型
         /*第一次ThreadLocal类的get()方法返回值是null*/
         try {
             ThreadA a = new ThreadA();
             ThreadB b = new ThreadB();
             a.start();
             Thread.sleep(1000);

             b.start();
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
}
