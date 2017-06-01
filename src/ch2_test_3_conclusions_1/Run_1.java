package ch2_test_3_conclusions_1;

/**
 * Created by xu on 2017/6/1.
 */
public class Run_1 {
    /*
    测试三个结论
    （1）当多个线程同时执行synchronzied(x){}同步代码块时呈同步效果
    （2）当其他线程执行x对象中的synchronized同步方法时同步
    （3）当其他线程执行x对象方法里的synchronized（this）代码块时，同步

    运行结果：
    testMethod1____getLock time=1496297288540 run ThreadName=A
    testMethod1____releaseLock time=1496297290544 run ThreadName=A
    testMethod1____getLock time=1496297290544 run ThreadName=B
    testMethod1____releaseLock time=1496297292547 run ThreadName=B
     */
     public static void main(String[] args){
         Service service = new Service();
         MyObject object = new MyObject();

         ThreadA a = new ThreadA(service,object);
         ThreadB b = new ThreadB(service,object);

         a.setName("A");
         b.setName("B");
         a.start();
         b.start();
     }
}
