package ch7_groupRecurseTest;

/**
 * Created by xu on 17/07/2017.
 */
public class Run {
     public static void main(String[] args){
         //递归与非递归取得组内对象
         // true     false
         ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
         ThreadGroup groupA = new ThreadGroup(mainGroup, "A");
         Runnable runnable = new Runnable() {
             @Override
             public void run() {
                 try {
                     System.out.println("runMethod");
                     Thread.sleep(3000);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }
         };
         ThreadGroup groupB = new ThreadGroup(groupA, "B");
         //分配空间，并用完
         ThreadGroup[] listGroup1 = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];


         //传入true - 是递归取得子组及子孙组
         Thread.currentThread().getThreadGroup().enumerate(listGroup1, true);
         System.out.println(listGroup1.length);

         for (int i=0; i<listGroup1.length; i++) {
             if (listGroup1[i] != null)
                 System.out.println(listGroup1[i].getName());
         }
         //分配空间，但是没有用完
         ThreadGroup[] listGroup2 = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];

        //传入false - 是无法递归取得子组及子孙组
         Thread.currentThread().getThreadGroup().enumerate(listGroup2, false);
         System.out.println(listGroup2.length);

         for (int i=0; i<listGroup2.length; i++) {
             if (listGroup2[i] != null)
                 System.out.println(listGroup2[i].getName());
         }

     }
}
