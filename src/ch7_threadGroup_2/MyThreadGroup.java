package ch7_threadGroup_2;

/**
 * Created by xu on 19/07/2017.
 */
public class MyThreadGroup extends ThreadGroup {
    public MyThreadGroup(String name) {
        super(name);
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        super.uncaughtException(t, e);
        //重写该方法，添加中断行为，注意每个线程对象中的run方法内部不要有异常catch语句，否则uncaughtException()不执行！！
        this.interrupt();
    }
}
