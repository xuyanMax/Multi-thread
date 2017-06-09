package ch2_sync_inner_static_class_1;

/**
 * Created by xu on 2017/6/7.
 */
public class OutClass {
    static class Inner {
        public void method() {
            synchronized ("其他的锁"){
                for (int i=1; i<=10; i++) {
                    System.out.println(Thread.currentThread().getName() + ", i="+i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        public synchronized void method2() {
            for (int i=1; i<=10; i++) {
                System.out.println(Thread.currentThread().getName() + ", i="+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
