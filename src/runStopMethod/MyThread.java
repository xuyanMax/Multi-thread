package runStopMethod;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        /*
         * java.lang.ThreadDeath 异常
         */
        try {
            this.stop();
        } catch (ThreadDeath e) {
            System.out.println("进入了catch方法！");
            e.printStackTrace();
        }
    }
}
