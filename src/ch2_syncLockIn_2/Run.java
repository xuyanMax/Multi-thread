package ch2_syncLockIn_2;

/**
 * Created by xu on 2017/5/30.
 */
public class Run {
     public static void main(String[] args){
         /*
         父子类继承中的可重入锁
         ？当存在父子类继承关系时，子类是可以通过"可重入锁"调用父类的同步的方法

         * */
         MyThread thread = new MyThread();

         thread.start();

     }
}
