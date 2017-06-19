package ch4_condition_many_producers_consumers;

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
        for (int i=0; i<Integer.MAX_VALUE; i++)
            service.get();
    }
}
