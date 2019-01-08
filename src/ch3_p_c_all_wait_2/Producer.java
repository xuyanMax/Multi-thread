package ch3_p_c_all_wait_2;

/**
 * Created by xu on 2017/6/7.
 */
public class Producer {
    private String lock;

    public Producer(String lock) {
        super();
        this.lock = lock;
    }

    public void setValue() {
        try {
            synchronized (lock) {
                while (!ValueObject.value.equals("")) {
                    System.out.println("生产者" + Thread.currentThread().getName() + " 等待******");
                    lock.wait();
                }

                System.out.println("生产者" + Thread.currentThread().getName() + " 生产%%%%%%%");
                ValueObject.value = System.currentTimeMillis() + "_" + System.nanoTime();
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
