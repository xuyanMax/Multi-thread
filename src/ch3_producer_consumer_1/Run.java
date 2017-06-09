package ch3_producer_consumer_1;

/**
 * Created by xu on 2017/6/7.
 */
public class Run {
     public static void main(String[] args){
         String lock = new String("");
         Producer producer = new Producer(lock);
         Consumer consumer = new Consumer(lock);

         ThreadConsumer threadConsumer = new ThreadConsumer(consumer);
         ThreadProducer threadProducer = new ThreadProducer(producer);

         threadConsumer.start();
         threadProducer.start();
     }
}
