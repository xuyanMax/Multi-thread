package ch3_producer_consumer_1;

/**
 * Created by xu on 2017/6/7.
 */
public class ThreadProducer extends Thread{
    private Producer producer;

    public ThreadProducer(Producer producer) {
        super();
        this.producer = producer;
    }

    @Override
    public void run() {
        while(true)
            producer.setValue();
    }
}
