package ch4_mustUseConditionsOK;

/**
 * Created by xu on 2017/6/15.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        ThreadB b = new ThreadB(service);

        a.setName("A");
        b.setName("B");
        a.start();
        b.start();
        Thread.sleep(1000);

        service.signalAll_A();
    }
}
