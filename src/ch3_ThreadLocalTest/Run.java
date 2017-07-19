package ch3_ThreadLocalTest;

/**
 * Created by xu on 2017/6/11.
 */
public class Run {
      public static void main(String[] args) {
          /*验证线程变量 ThreadLocal的隔离性*/
          //虽然三个线程都向t1对象中set()数据值，但每个线程还是能取出自己的数据
          try {
              ThreadA a = new ThreadA();
              ThreadB b = new ThreadB();
              a.start();
              b.start();

              for (int i = 0; i < 100; i++) {
                  Tools.t1.set("Main thread" + (i + 1));
                  System.out.println("Main get k=" + Tools.t1.get());
                  Thread.sleep(200);
              }
          } catch (InterruptedException e1) {
              e1.printStackTrace();
          }
      }

}
