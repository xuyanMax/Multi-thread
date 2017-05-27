package suspend_resume_LockStop;

/**
 * Created by xu on 2017/5/27.
 */
public class MyThread extends Thread
{
    private long i = 0;
    @Override
    public void run(){
        while(true)
            i++;
    }
}
