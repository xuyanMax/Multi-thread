package ch2_sync_block_string;

/**
 * Created by xu on 2017/6/1.
 */
public class Service_non_this {
    private String usernameParam;
    private String passwordParam;

    public void setUsernamePassword(String username, String password) {
        try {
            //改动部分
            String anyString = new String();
            synchronized (anyString) {
                System.out.println("线程名称为： "+ Thread.currentThread().getName()+"，在 "+System.currentTimeMillis()+
                        " 进入同步块");
                this.usernameParam = username;

                Thread.sleep(3000);

                this.passwordParam = password;
                System.out.println("线程名称为： "+ Thread.currentThread().getName()+"，在 "+System.currentTimeMillis()+
                        " 离开同步块");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
