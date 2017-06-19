package ch3_ThreadLocalTest;

/**
 * Created by xu on 2017/6/11.
 */
public class Run {
      public static void main(String[] args) {
          /*验证线程变量 ThreadLocal的隔离性*/
          try {
              ThreadA a = new ThreadA();
              ThreadB b = new ThreadB();
              a.start();
              b.start();

              for (int i = 0; i < 100; i++) {
                  Tools.t1.set("Main thread" + (i + 1));
                  System.out.println("ThreadA get k=" + Tools.t1.get());
                  Thread.sleep(200);
              }
          } catch (InterruptedException e1) {
              e1.printStackTrace();
          }
      }

}
