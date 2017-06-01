package ch2_syncMethod_lock_object_2;

/**
 * Created by xu on 2017/5/30.
 */
public class MyObject {


    synchronized public void methodA(){

        try {
            System.out.println("begin methodA() threadName="+Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("methodA() endtime " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    // 添加或删除 synchronized 关键字 来反映被锁住对象的其他方法（同步或非同步方法）被调用时的效果
    synchronized public void methodB() {
        try {
            System.out.println("begin methodB() threadName="+Thread.currentThread().getName() +" "
                    + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("methodB() end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
