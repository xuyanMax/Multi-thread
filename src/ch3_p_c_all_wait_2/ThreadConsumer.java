package ch3_p_c_all_wait_2;


/**
 * Created by xu on 2017/6/7.
 */
public class ThreadConsumer extends Thread {
    private Consumer consumer;

    public ThreadConsumer(Consumer consumer) {
        super();
        this.consumer = consumer;
    }

    @Override
    public void run() {
        while (true)
            consumer.getValue();
    }
}
