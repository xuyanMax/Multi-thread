package currentThreadExt;

public class Run2 {

    public static void main(String[] args) {
        CountOperate thread = new CountOperate();
        thread.setName("A");
        thread.start();
    }
}