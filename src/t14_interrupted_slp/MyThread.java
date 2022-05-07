package t14_interrupted_slp;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        /*
         * 在线程interrupted状态下睡眠线程，效果是：
         * 直接进入catch语句，并且清除停止状态值，使之变为false
         */
        try {
            for (int i = 0; i < 100000; i++) {
                System.out.println("i=" + (i + 1));
            }
            System.out.println("run begin");
            Thread.sleep(10000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("先中断后遇到sleep！进入catch！停止状态值：" + this.isInterrupted());
            e.printStackTrace();
        }
    }
}
