package ch2_t3_dirtyRead;

/**
 * Created by xu on 2017/5/30.
 */
public class ThreadA extends Thread {
    private PublicVar publicVar;

    public ThreadA(PublicVar pv) {
        super();
        this.publicVar = pv;
    }

    @Override
    public void run() {
        super.run();
        this.publicVar.setValue("B", "BB");
    }
}
