package ch7_groupAddThredMoreLevel;

/**
 * Created by xu on 09/07/2017.
 */
public class Run {
/*
多级关联 - - 父对象中有子对象，子对象中再创建子对象，也就是子孙对象的效果。
JDK提供了支持多级关联的线程树结构
*/
     public static void main(String[] args){
            //在main组中添加一个线程组A，然后在这个A组中添加线程对象group
            ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
            ThreadGroup group = new ThreadGroup(mainGroup, "group");
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println("runMethod");
                        Thread.sleep(1000);//线程必须在运行状态才可以接受管理
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            Thread newThread1 = new Thread(group, runnable);
            newThread1.setName("threadA");

            newThread1.start();
            Thread newThread2 = new Thread(group, runnable);
            newThread2.setName("threadB");
            newThread2.start();

            ThreadGroup[] listGroup = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];

            mainGroup.enumerate(listGroup);

            System.out.println("main线程组中有多少个子线程组？" + listGroup.length);
            System.out.println("其中一个名字为："+listGroup[0].getName());


            Thread[] listThread = new Thread[listGroup[0].activeCount()];

            listGroup[0].enumerate(listThread);
            for (Thread t:listThread)
                System.out.println(group.getName() +" 线程名字："+t.getName());


     }
}
