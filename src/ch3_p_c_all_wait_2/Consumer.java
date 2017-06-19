package ch3_p_c_all_wait_2;

/**
 * Created by xu on 2017/6/7.
 */
public class Consumer {
    private String lock;

    public Consumer(String lock) {
        this.lock = lock;
    }
    public void getValue() {

        try {
            synchronized (lock) {
                while (ValueObject.value.equals("")) {
                    System.out.println("消费者"+Thread.currentThread().getName()+" 等待******");
                    lock.wait();
                }
                System.out.println("消费者"+Thread.currentThread().getName()+" 消费¥¥¥¥¥¥¥");
                ValueObject.value="";
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
