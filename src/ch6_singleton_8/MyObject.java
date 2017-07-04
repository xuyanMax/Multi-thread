package ch6_singleton_8;

/**
 * Created by xu on 2017/7/2.
 */
public class MyObject {

    private static MyObject myObject=null;
    private MyObject(){};

    static {
     myObject = new MyObject();
    }
    public static MyObject getInstance() {
        return myObject;
    }
}
