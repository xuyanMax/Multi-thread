package ch2_test_3_conclusions_1;

/**
 * Created by xu on 2017/6/1.
 */
public class Run_2 {
    /*
      结果
        testMethod1____getLock time=1496296991734 run ThreadName=A
        testMethod1____getLock time=1496296991734 run ThreadName=B
        testMethod1____releaseLock time=1496296993737 run ThreadName=B
        testMethod1____releaseLock time=1496296993737 run ThreadName=A

    * */
     public static void main(String[] args){
         Service service = new Service();
         MyObject object = new MyObject();
         MyObject object2 = new MyObject();

         ThreadA a = new ThreadA(service,object);
         ThreadB b = new ThreadB(service,object2);

         a.setName("A");
         b.setName("B");
         a.start();
         b.start();
     }
}
