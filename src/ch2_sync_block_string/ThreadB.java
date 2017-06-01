package ch2_sync_block_string;

/**
 * Created by xu on 2017/6/1.
 */
public class ThreadB extends Thread{
    private Service service;
    public ThreadB (Service s){
        super();
        this.service = s;
    }
    @Override
    public void run() {
        service.setUsernamePassword("b","bb");
    }
}
