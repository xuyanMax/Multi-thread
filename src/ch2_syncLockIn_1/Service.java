package ch2_syncLockIn_1;

/**
 * Created by xu on 2017/5/30.
 */
public class Service {
    synchronized public void service1() {
        System.out.println("service 1, thread=" +Thread.currentThread().getName());
        service2();
    }
    synchronized public void service2() {
        System.out.println("service 2, thread=" +Thread.currentThread().getName());
        service3();
    }
    // synchronized
     synchronized public void service3() {
        System.out.println("service 3, thread=" +Thread.currentThread().getName());
    }
}
