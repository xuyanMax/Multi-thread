package t11_interrup;

public class Run {
    /*
     * 线程无法被打断
     */
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(2000);
            Thread.interrupted();// 返回布尔值
            System.out.println("==========\n\n\n");

        } catch (InterruptedException e) {

        }


    }

}
