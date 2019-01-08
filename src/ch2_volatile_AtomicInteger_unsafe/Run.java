package ch2_volatile_AtomicInteger_unsafe;

import ch2_sync_class.Service;

/**
 * Created by xu on 2017/6/4.
 */
public class Run {
    public static void main(String[] args) {
        /* 原子类并不完全安全
         * 输出结果具有随意性（最终结果正确）
         *
         * 改进方法
         * 添加synchronized 与addNum前 其他不变
         * */
        try {
            MyService service = new MyService();
            MyThread[] threadArray = new MyThread[5];
            for (int i = 0; i < 5; i++)
                threadArray[i] = new MyThread(service);

            for (int i = 0; i < 5; i++)
                threadArray[i].start();

            Thread.sleep(1000);
            System.out.println(service.aiRef.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
