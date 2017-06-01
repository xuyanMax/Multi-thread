package ch2_syncMethod_lock_object;

/**
 * Created by xu on 2017/5/30.
 */
public class MyObject {

    // 添加或删除 synchronized 关键字
    synchronized public void methodA(){

        try {
            System.out.println("begin methodA() threadName="+Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("methodA() end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
