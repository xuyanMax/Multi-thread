package t8_sleep;

public class Run2 {
    /*
     * 调用start()
     * 则有两个线程，main和myThread2异步执行
     *
     * main 线程与myThread2(被阻塞)线程异步执行，所以首先打印的信息为begin和end
     * 而MyThread2随后运行
     */
    public static void main(String[] args) {
        MyThread2 myThread = new MyThread2();
        System.out.println("begin =" + System.currentTimeMillis());
        myThread.start();
        System.out.println("end =" + System.currentTimeMillis());

    }

}
