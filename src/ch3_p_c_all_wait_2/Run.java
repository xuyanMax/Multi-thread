package ch3_p_c_all_wait_2;


/**
 * Created by xu on 2017/6/7.
 */
public class Run {
    /*多生产者多消费者，操作值-假死
    * 假死的主要原因是有可能联系唤醒同类

    * 解决方法
    * 不关唤醒同类，将异类一同唤醒就解决了！
    *
    *
    * */
     public static void main(String[] args) throws InterruptedException {
         String lock = new String("");
         Producer producer = new Producer(lock);
         Consumer consumer = new Consumer(lock);

         ThreadConsumer[] threadConsumer = new ThreadConsumer[2];
         ThreadProducer[] threadProducer = new ThreadProducer[2];
         for (int i=0; i<2; i++) {
             threadConsumer[i] = new ThreadConsumer(consumer);
             threadProducer[i] = new ThreadProducer(producer);

             threadConsumer[i].setName("消费者"+(i+1));
             threadProducer[i].setName("圣战者"+(i+1));
             threadProducer[i].start();
             threadConsumer[i].start();
         }

         Thread.sleep(1000);


         Thread[] threadArray = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
         Thread.currentThread().getThreadGroup().enumerate(threadArray);
         for (int i=0; i<threadArray.length; i++) {
             System.out.println(threadArray[i].getName() + ", " + threadArray[i].getState());
         }
     }
}
