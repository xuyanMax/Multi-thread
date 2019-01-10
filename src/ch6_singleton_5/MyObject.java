package ch6_singleton_5;

/**
 * Created by xu on 2017/7/2.
 */
public class MyObject {

    /*使用双检查锁机制，既保证了不需要同步代码的异步执行型，
     * 又保证了单例的效果*/
    volatile private static MyObject myObject;

    private MyObject() {
    }

    ;

    public static MyObject getInstance() {

        /*延迟加载*/

        try {
            if (myObject != null) {
                /*模拟在创建对象之前做一些准备性的工作*/
                Thread.sleep(3000);

                synchronized (MyObject.class) {
                    /*这个判断很重要*/
                    if (myObject == null)
                        myObject = new MyObject();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }
}
