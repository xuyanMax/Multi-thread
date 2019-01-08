package ch3_busy_waiting;


/**
 * Created by xu on 2017/6/4.
 */
public class Run {
    public static void main(String[] args) {
         /*虽然两个线程实现了通信，但是弊端是：线程b忙等待，不停地通过while语句轮询机制来检测某个条件，浪费CPU资源
         我们将使用wait/notify 机制改善这个问题
         * */

        MyList list = new MyList();
        MyThreadA a = new MyThreadA(list);
        MyThreadB b = new MyThreadB(list);
        a.setName("A");
        b.setName("B");
        a.start();

        b.start();

    }
}
