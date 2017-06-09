package ch2_setNewString_twoLocks;

import ch2_sync_block_string.Service;

/**
 * Created by xu on 2017/6/1.
 */
public class ThreadB extends Thread{
    private MyService service;
    public ThreadB (MyService s){
        super();
        this.service = s;
    }
    @Override
    public void run() {
        service.testMethod();
    }
}
