package chp2_t9_sync_non_this_solv_dirty_read;

/**
 * Created by xu on 2017/6/1.
 */
public class MyService {
    public MyOneList addServiceMethod(MyOneList list, String data) {
        try {
            // 同步处理
            synchronized (list) {
                if (list.getSize() < 1) {
                    System.out.println("线程" + Thread.currentThread().getName() + " 执行add方法");
                    Thread.sleep(2000);//模拟从远程花费2秒取回数据
                    list.add(data);
                } else {
                    System.out.println("线程" + Thread.currentThread().getName() + " 无法执行add方法");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return list;
    }
}
