package ch3_wait_add_subtract_while;

/**
 * Created by xu on 2017/6/7.
 */
public class ThreadAdd extends Thread {
    private Add add;

    public ThreadAdd(Add add) {
        super();
        this.add = add;
    }

    @Override
    public void run() {
        add.add();
    }
}
