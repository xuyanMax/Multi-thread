package ch4_awaitUntil;

/**
 * Created by xu on 2017/6/19.
 */
public class Run2 {
    public static void main(String[] args){
        /*说明线程在等待时间到达前，可以被其他线程唤醒*/
        Service service = new Service();
        MyThreadA athread = new MyThreadA(service);
        MyThreadB bthread = new MyThreadB(service);

        athread.start();
        bthread.start();


    }
}
