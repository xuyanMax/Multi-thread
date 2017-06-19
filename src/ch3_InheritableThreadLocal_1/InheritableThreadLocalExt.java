package ch3_InheritableThreadLocal_1;

import java.util.Date;

/**
 * Created by xu on 2017/6/12.
 */
public class InheritableThreadLocalExt extends InheritableThreadLocal {
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }
}
