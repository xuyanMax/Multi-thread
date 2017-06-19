package ch4_condition_producer_consumer;

/**
 * Created by xu on 2017/6/15.
 */
public class Run {
     public static void main(String[] args){
         /*交替打印*/
         MyService service = new MyService();
         ThreadA a = new ThreadA(service);
         ThreadB b = new ThreadB(service);
         a.start();
         b.start();
     }
}
