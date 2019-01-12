package chp2_t9_sync_non_this_solv_dirty_read;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xu on 2017/6/1.
 */
public class MyList {
    private List list = new ArrayList();

    synchronized public void add(String username) {
        System.out.println("线程名称：" + Thread.currentThread().getName() + ", 执行了add方法！");
        list.add(username);
        System.out.println("线程名称：" + Thread.currentThread().getName() + ", 退出了add方法！");
    }

    synchronized public int getSize() {
        System.out.println("线程名称：" + Thread.currentThread().getName() + ", 执行了add方法！");
//        list.size();
        System.out.println("线程名称：" + Thread.currentThread().getName() + ", 退出了add方法！");

        return list.size();
    }
}
