package ch3_joint_test;

/**
 * Created by xu on 2017/6/9.
 */
public class Test {
     public static void main(String[] args) throws InterruptedException {
         MyThread thread = new MyThread();
         thread.start();
//         Thread.sleep(?);
         System.out.println("我向当thread对象执行完毕后我再执行");
         System.out.println("但是代码中的sleep()中应该写多少？");
         System.out.println("答案是：我根本不能确定");
     }
}
