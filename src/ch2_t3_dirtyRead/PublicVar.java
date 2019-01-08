package ch2_t3_dirtyRead;

/**
 * Created by xu on 2017/5/30.
 */
public class PublicVar {
    public String username = "A";
    public String password = "AA";

    synchronized public void setValue(String username, String password) {
        try {
            this.username = username;

            Thread.sleep(5000);

            this.password = password;
            System.out.println("setValue Method, thread name=" + Thread.currentThread().getName() +
                    ", username=" + this.username + ", password=" + this.password);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // 加synchronized
    synchronized public void getValue() {
        System.out.println("getValue Method, thread name=" + Thread.currentThread().getName() + ", username=" + username +
                ", password=" + password);
    }
}
