package suspend_resume_async;

/**
 * Created by xu on 2017/5/27.
 */
public class MyObject {
    private String username = "1";
    private String pssd = "11";
    public void setValue(String u, String p){
        this.username = u;
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("停止a线程");
            Thread.currentThread().suspend();
        }
        this.pssd = p;
    }
    public void printUserNamePssd(){
        System.out.println(username + " " + pssd);
    }

}
