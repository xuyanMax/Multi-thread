package ch3_p_c_stack_3;

/**
 * Created by xu on 2017/6/7.
 */
public class Run {
     public static void main(String[] args){
         /*多生产者 一消费者

         * 
         * */
         MyStack myStack = new MyStack();
         Consumer consumer = new Consumer(myStack);
         Producer Producer1 = new Producer(myStack);
         Producer Producer2 = new Producer(myStack);
         Producer Producer3 = new Producer(myStack);
         Producer Producer4 = new Producer(myStack);
         Producer Producer5 = new Producer(myStack);

         ThreadProducer threadProducer1 = new ThreadProducer(Producer1);
         ThreadProducer threadProducer2 = new ThreadProducer(Producer2);
         ThreadProducer threadProducer3 = new ThreadProducer(Producer3);
         ThreadProducer threadProducer4 = new ThreadProducer(Producer4);
         ThreadProducer threadProducer5 = new ThreadProducer(Producer5);
         ThreadConsumer threadConsumer = new ThreadConsumer(consumer);

         threadProducer1.start();
         threadProducer2.start();
         threadProducer3.start();
         threadProducer4.start();
         threadProducer5.start();

         threadConsumer.start();
     }
}
