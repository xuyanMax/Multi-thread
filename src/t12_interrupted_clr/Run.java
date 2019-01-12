package t12_interrupted_clr;

public class Run {
    /*
     * 线程无法被打断
     */
    public static void main(String[] args) {

        MyThread thread = new MyThread();
        thread.start();

        Thread.interrupted();// 返回布尔值

        System.out.println("是否停止1？=" + Thread.interrupted());

        System.out.println("是否停止2？=" + Thread.interrupted());

    }

}
