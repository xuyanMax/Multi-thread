package t8_sleep;

public class Run1 {

    /*
     * 暂停main线程两秒
     * 直接调用run（）方法,则只有一个main线程
     */
    public static void main(String[] args) {
        MyThread1 myThread = new MyThread1();
        System.out.println("begin =" + System.currentTimeMillis());
        myThread.run();
        System.out.println("end =" + System.currentTimeMillis());

    }

}
