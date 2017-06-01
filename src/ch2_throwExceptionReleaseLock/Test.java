package ch2_throwExceptionReleaseLock;

/**
 * Created by xu on 2017/5/31.
 */
public class Test {
     public static void main(String[] args){

//         System.out.println(Integer.parseInt("12")); // ok
//         System.out.println(Integer.parseInt("a")); // throw number-format-exception
         /*
         * 出现异常，对象锁自动释放
         * 当一个线程执行的Service类的实例对象在调用testMethod方法是会抛出number-format-exception异常，其所持有的锁自动释放
         *
         *  输出结果
         *  ThreadName=a run beginTime1496196091969
            ThreadName=a run exceptionTime=1496196093346
            Exception in thread "a" java.lang.NumberFormatException: For input string: "a"
            Thread B run time=1496196093346
                at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
                at java.lang.Integer.parseInt(Integer.java:580)
                at java.lang.Integer.parseInt(Integer.java:615)
                at ch2_throwExceptionReleaseLock.Service.testMethod(Service.java:15)
                at ch2_throwExceptionReleaseLock.ThreadA.run(ThreadA.java:13)

             可见线程a出现异常并释放锁，线程b进入方法正常打印，实验啊的结论就是出现异常的锁被自动释放了

         * */
         try {
             Service service = new Service();
             ThreadA threadA = new ThreadA(service);
             threadA.setName("a");
             threadA.start();

             Thread.sleep(500);

             ThreadB threadB = new ThreadB(service);
             threadB.setName("b");
             threadB.start();

         } catch (InterruptedException e) {
             e.printStackTrace();
         }


     }
}
