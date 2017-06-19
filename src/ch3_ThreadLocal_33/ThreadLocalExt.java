package ch3_ThreadLocal_33;

import java.util.Date;

/**
 * Created by xu on 2017/6/12.
 */
public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }
}
