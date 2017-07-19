package ch7_threadCreateException;

/**
 * Created by xu on 19/07/2017.
 */
public class Main3 {
    public static void main(String[] args){
        //caughtExceptionHandler类，可以对线程中的异常进行"捕捉
        //setUncaughtExceptionHandler()：对指定的线程对象设置默认的异常处理器
        //setDefaultUncaughtExceptionHandler()可以对所有线程对象设置异常处理器
        MyThread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("线程："+ t.getName() + " 出现了异常：");
                e.printStackTrace();
            }
        });
        MyThread t1 = new MyThread();
        t1.setName("t1");
        MyThread t2 = new MyThread();
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}
