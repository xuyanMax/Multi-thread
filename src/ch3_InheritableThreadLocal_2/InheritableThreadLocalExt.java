package ch3_InheritableThreadLocal_2;

import java.util.Date;

/**
 * Created by xu on 2017/6/12.
 */
public class InheritableThreadLocalExt extends InheritableThreadLocal {
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }

    @Override
    protected Object childValue(Object parentValue) {
        return parentValue + " 我在子线程加的...";
    }
}
