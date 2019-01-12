package randomThread;


public class Test {

    public static void main(String[] args) {
        /*
         * 线程随机性
         * start()告知线程规划起此线程ready，等待调用线程对象的run()方法
         *
         */


        try {
            MyThread myThread = new MyThread();
            myThread.setName("myThread");
            myThread.start();
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                System.out.println("main" + i + "=" + myThread.currentThread().getName());
                System.out.println("zzZZZ...main"); // sleep前后，cpu运行线程一致
                myThread.sleep(time);//交出线程，占用cpu time 秒，时间过后返回当前线程
                System.out.println("main" + i + "=" + myThread.currentThread().getName());

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
