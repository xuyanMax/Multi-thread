package ch3_p_c_stack_2_new;

/**
 * Created by xu on 2017/6/7.
 */
public class Run {
     public static void main(String[] args){
         /*一生产者 多消费者
         * 出现"假死"
         *
         * */
         MyStack myStack = new MyStack();
         Producer producer = new Producer(myStack);
         Consumer consumer1 = new Consumer(myStack);
         Consumer consumer2 = new Consumer(myStack);
         Consumer consumer3 = new Consumer(myStack);
         Consumer consumer4 = new Consumer(myStack);
         Consumer consumer5 = new Consumer(myStack);

         ThreadConsumer threadConsumer1 = new ThreadConsumer(consumer1);
         ThreadConsumer threadConsumer2 = new ThreadConsumer(consumer2);
         ThreadConsumer threadConsumer3 = new ThreadConsumer(consumer3);
         ThreadConsumer threadConsumer4 = new ThreadConsumer(consumer4);
         ThreadConsumer threadConsumer5 = new ThreadConsumer(consumer5);
         ThreadProducer threadProducer = new ThreadProducer(producer);

         threadConsumer1.start();
         threadConsumer2.start();
         threadConsumer3.start();
         threadConsumer4.start();
         threadConsumer5.start();

         threadProducer.start();
     }
}
