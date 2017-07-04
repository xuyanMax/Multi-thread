package ch6_singleton_0;

/**
 * Created by xu on 2017/7/2.
 */
public class MyObject {
    /*立即加载 === 饿汉模式*/
    private static MyObject myObject = new MyObject();
    private MyObject(){};

    public static MyObject getInstance() {
    /*因为getInstance方法没有同步，因此有可能出现非线程安全问题*/
        return myObject;
    }
}
