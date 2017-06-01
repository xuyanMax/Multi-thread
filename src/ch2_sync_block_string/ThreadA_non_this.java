package ch2_sync_block_string;

/**
 * Created by xu on 2017/6/1.
 */
public class ThreadA_non_this extends Thread{
    private Service_non_this service;
    public ThreadA_non_this (Service_non_this s){
        super();
        this.service = s;
    }
    @Override
    public void run() {
        service.setUsernamePassword("a","aa");
    }
}
