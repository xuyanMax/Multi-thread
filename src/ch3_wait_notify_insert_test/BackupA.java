package ch3_wait_notify_insert_test;


/**
 * Created by xu on 2017/6/9.
 */
public class BackupA extends Thread{
    private DBTools dbTools;
    public BackupA (DBTools db) {
        super();
        dbTools = db;
    }

    @Override
    public void run() {
        dbTools.backupA();
    }
}
