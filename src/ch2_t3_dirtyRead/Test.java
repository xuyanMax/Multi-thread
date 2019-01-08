package ch2_t3_dirtyRead;

/**
 * Created by xu on 2017/5/30.
 */
public class Test {
    public static void main(String[] args) {
         /*
         脏读
         本例中多个线程调用同一个方法时，出现脏读现象（在读取实例变量时，此值已经被其他线程更改过）
         原因在于：支队写操作／赋值进行了同步，而没有对取值／读操作进行同步

         输出结果：
         getValue Method, thread name=main, username=B, password=AA
         setValue Method, thread name=Thread-0, username=B, password=BB

         对getValue方法添加synchronized关键字后
         输出结果：
         setValue Method, thread name=Thread-0, username=B, password=BB
         getValue Method, thread name=main, username=B, password=BB

         可见setValue和getValue被依次执行：当threadA线程调用PublicVar对象中的synchronized关键字的setValue方法时，
         threadA线程获得PublicVar对象的对象锁，所以其他线程（这里是main线程）必须等threadA线程执行完毕后才可以调用setValue方法和其他
         声明了synchronized关键字的非setValue方法；

         * */
        try {
            PublicVar pv = new PublicVar();
            ThreadA threadA = new ThreadA(pv);
            threadA.start();

            Thread.sleep(200); //打印结果受此值影响

            pv.getValue();


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
