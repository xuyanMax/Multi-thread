package ch2_volatile_non_atomicity;

/**
 * Created by xu on 2017/6/4.
 */
public class Run {
     public static void main(String[] args){
    /*
    * 输出结果不是10,000
    * ...
    * ...
    * count=9840
    * count=9938
    *
    * 如何输出10,000？
    * 1、addCount前加synchronzed
    * 2、去除volatile（既然加了sync，就没必要再使用volatile）
    *
    * volatile主要作用是多个线程可以感知实例变量被改变了，volatile提示线程每次从共享内存中读取变量，而不是私有内存，保证了同步数据的可见性。
    *
    * count++操作并不是一个原子操作，即非线程安全的，因此才会出现输出不是10,000
*/

        MyThread[] threadArray = new MyThread[100];
        for (int i=0; i<100; i++)
            threadArray[i] = new MyThread();
        for(int i=0; i<100; i++)
            threadArray[i].start();
     }
}
