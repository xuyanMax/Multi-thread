package t14_slp_interrupted;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        /*
         * 在线程sleep()状态下中断（interrupt）线程，效果是：
         * 直接进入catch语句，并且清除停止状态值，使之变为false
         */
        try {
            System.out.println("run begin");
            Thread.sleep(200000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("在sleep中被中断！进入catch！停止状态值：" + this.isInterrupted());
            e.printStackTrace();
        }
    }
}
