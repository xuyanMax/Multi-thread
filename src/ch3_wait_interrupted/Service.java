package ch3_wait_interrupted;

/**
 * Created by xu on 2017/6/5.
 */
public class Service {
    public void testMethod(Object lock)  {



            try {
                synchronized (lock) {
                    System.out.println("开始等待，线程名" + Thread.currentThread().getName());
                    lock.wait();
//                    if (Thread.interrupted())
//                        throw new InterruptedException();

                    System.out.println("  -结束等待，线程名"+Thread.currentThread().getName());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("异常打断!");

            }

            System.out.println("  结束等待，线程名"+Thread.currentThread().getName());
        }

}
