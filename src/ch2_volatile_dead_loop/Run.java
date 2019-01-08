package ch2_volatile_dead_loop;

/**
 * Created by xu on 2017/6/4.
 */
public class Run {
    /*死循环
    * psService.setContinuedPrint(false); 永远不会执行
    * */
     public static void main(String[] args){
         PrintString psService = new PrintString();

         psService.printStringMethod();

         System.out.println("停止printStringMethod，stopThread="+Thread.currentThread().getName());

         psService.setContinuedPrint(false);
     }
}
