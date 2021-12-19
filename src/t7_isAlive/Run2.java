package t7_isAlive;

public class Run2 {

    public static void main(String[] args) {
        /*
         * 两个线程，一个main主线程，一个是myThread中run方法自带线程 Thread-0
         * Thread.sleep(1000)的加入(当前正在执行的线程(this.currentThread()返回的线程)，休眠)，会使得end === false
         * 因为如果myThread run 正在执行，则其休眠，非存活状态
         * 如果main 休眠，myThread run方法在一秒内执行完毕
         *
         * 加入sleep()
         */
        try {
            MyThread thread = new MyThread();
            System.out.println("begin ===" + thread.isAlive());
            thread.start();

            System.out.println(Thread.currentThread().getName());

            Thread.sleep(1000);//当前执行的线程休眠

            System.out.println("end ===" + thread.isAlive() + " thread->" + Thread.currentThread().getName());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
