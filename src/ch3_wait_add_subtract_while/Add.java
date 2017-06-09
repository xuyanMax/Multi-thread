package ch3_wait_add_subtract_while;

/**
 * Created by xu on 2017/6/7.
 */
public class Add {
    private String lock;

    public Add(String lock) {
        super();
        this.lock = lock;
    }
    public void add() {

        synchronized (lock) {
            ValueObject.list.add("anything");
            lock.notifyAll();// may cause problems will two waiting subtract threads are awake with only 1 item to be subtracted
        }
    }

}
