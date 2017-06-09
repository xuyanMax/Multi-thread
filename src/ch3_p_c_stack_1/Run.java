package ch3_p_c_stack_1;

/**
 * Created by xu on 2017/6/7.
 */
public class Run {
     public static void main(String[] args){
         MyStack myStack = new MyStack();
         Producer producer = new Producer(myStack);
         Consumer consumer = new Consumer(myStack);

         ThreadConsumer threadConsumer = new ThreadConsumer(consumer);
         ThreadProducer threadProducer = new ThreadProducer(producer);

         threadConsumer.start();
         threadProducer.start();
     }
}
