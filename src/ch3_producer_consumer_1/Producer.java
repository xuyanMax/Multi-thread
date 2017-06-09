package ch3_producer_consumer_1;

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
        try{
            synchronized (lock) {
                if (!ValueObject.value.equals("")) {
                    lock.wait();
                }
                System.out.println("set值"+System.currentTimeMillis()+"_"+System.nanoTime());
                ValueObject.value = System.currentTimeMillis()+"_"+System.nanoTime();
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
