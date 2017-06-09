package ch3_producer_consumer_1;

import sun.awt.SunHints;

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
                if (ValueObject.value.equals("")) {
                    lock.wait();
                }
                System.out.println("get的值="+ValueObject.value);
                ValueObject.value="";
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
