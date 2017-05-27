package suspend_resume_async;

/**
 * Created by xu on 2017/5/27.
 */
public class Run {
     public static void main(String[] args){


         try {
             final MyObject obj = new MyObject(); // "1", "11"
             Thread thread1 = new Thread(){
                 @Override
                 public void run(){
                     obj.setValue("a", "aa");
                 }
             };
             thread1.setName("a");

             thread1.start();
             // thread1 线程将被暂停，导致username被更新而password未被更新，数据不同步！
             Thread.sleep(500);

             //当thread2线程调用obj对象并显示其成员参数时，验证数据未同步
             //输出
             // 停止a线程
             //a 11
             // 我们期待的是 a aa
             //因此要谨慎使用suspend方法
             Thread thread2 = new Thread(){
                 @Override
                 public void run(){
                     obj.printUserNamePssd();
                 }
             };

             thread2.start();

         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }

}
