package ch6_singleton_2;

/**
 * Created by xu on 2017/7/2.
 */
public class MyObject {

    private static MyObject myObject;
    private MyObject(){};

    public static MyObject getInstance() {

    /*延迟加载*/

        try {
            if (myObject == null) {
                Thread.sleep(3000);
                myObject = new MyObject();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }
}
