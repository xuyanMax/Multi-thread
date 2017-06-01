package ch2_sync_block_string2;

/**
 * Created by xu on 2017/6/1.
 */
public class Service {
    private String anyString = new String();
    public void a() {
        try {
            synchronized (anyString) {
                System.out.println("a begins.");

                Thread.sleep(3000);

                System.out.println("a ends.");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    synchronized public void b() {
        System.out.println("b begins.");
        System.out.println("b ends.");

    }
}
