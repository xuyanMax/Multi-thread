package ch6_singleton_7;

/**
 * Created by xu on 2017/7/2.
 */
public class MyObject {

    private MyObject() {
    }


    public static class MyObjectHandler {
        private static MyObject myObject = new MyObject();
    }

    public static MyObject getInstance() {
        return MyObjectHandler.myObject;
    }
}
