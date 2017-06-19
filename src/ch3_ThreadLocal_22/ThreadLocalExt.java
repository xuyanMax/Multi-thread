package ch3_ThreadLocal_22;

/**
 * Created by xu on 2017/6/12.
 */
public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return "我是默认值 第一次get不再是null";
    }
}
