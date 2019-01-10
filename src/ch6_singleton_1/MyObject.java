package ch6_singleton_1;

/**
 * Created by xu on 2017/7/2.
 */
public class MyObject {

    private static MyObject myObject;

    private MyObject() {
    }

    public static MyObject getInstance() {

        /*延迟加载*/
        if (myObject == null)
            myObject = new MyObject();
        return myObject;
    }
}
