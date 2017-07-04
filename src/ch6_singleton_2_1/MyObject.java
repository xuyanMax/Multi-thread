package ch6_singleton_2_1;

/**
 * Created by xu on 2017/7/2.
 */
public class MyObject {

    private static MyObject myObject;
    private MyObject(){};

    /*加入synchronized 同步方法效率太低，整个方法被上锁*/
    synchronized public static MyObject getInstance() {

    /*延迟加载*/

        try {
            if (myObject == null) {
                /*模拟在创建对象之前做一些准备性的工作*/
                Thread.sleep(3000);
                myObject = new MyObject();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }
}
