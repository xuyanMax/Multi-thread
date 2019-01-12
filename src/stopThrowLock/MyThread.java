package stopThrowLock;

public class MyThread extends Thread {
    private SynchronizedObject object;

    public MyThread(SynchronizedObject object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {

        try {
            if (this.interrupted())
                throw new InterruptedException();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        object.printString("b", "bb");
    }

}
