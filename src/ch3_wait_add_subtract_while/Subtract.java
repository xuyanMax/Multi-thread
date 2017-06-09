package ch3_wait_add_subtract_while;

/**
 * Created by xu on 2017/6/7.
 */
public class Subtract {
    private String lock;

    public Subtract(String lock) {
        super();
        this.lock = lock;
    }
    public void subtract() {
        try {
            synchronized (lock) {
                while (ValueObject.list.size() == 0) {
                    System.out.println("等待开始，线程=" + Thread.currentThread().getName());
                    lock.wait();
                    System.out.println("等待结束，线程=" + Thread.currentThread().getName());
                }
                ValueObject.list.remove(0);
                System.out.println("list.size=" + ValueObject.list.size());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
