package ch2_sync_not_extends;

/**
 * Created by xu on 2017/5/31.
 */
public class Main {
    synchronized public void serviceMethod() {
        try {
            System.out.println("int main, 下一步 sleep begin, threadName="+Thread.currentThread().getName() +
                    ",time="+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int main, 下一步 sleep end" +
                    ", threadName="+Thread.currentThread().getName() +
                    ",time="+System.currentTimeMillis());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
