package ch2_t2;

/**
 * Created by xu on 2017/5/30.
 */
public class HasSelfPrivateNum {

    // difference than ch2_t1
    private int num = 0;

    //添加synchronized 可实现"线程同步"
    public void addI(String username) {

        try{
            if (username.equals("a")) {
                num = 100;
                System.out.println("a set over!");
                Thread.sleep(2000);
            } else {
                num = 200;
                System.out.println("b set over!");
            }
            System.out.println(username + " num=" + num);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
