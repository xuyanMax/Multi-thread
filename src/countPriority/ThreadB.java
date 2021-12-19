package countPriority;

/**
 * Created by xu on 2017/5/30.
 */
public class ThreadB extends Thread{
    private long count = 0;
    public long getCount() {
        return count;
    }
    @Override
    public void run() {
        while(!this.isInterrupted())
            count++;
    }
}
