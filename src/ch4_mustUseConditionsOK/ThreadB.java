package ch4_mustUseConditionsOK;

/**
 * Created by xu on 2017/6/15.
 */
public class ThreadB extends Thread {
    private MyService service;

    public ThreadB(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.awaitB();
    }
}
