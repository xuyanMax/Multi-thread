package t13_interrupted;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        /*
         * 在线程中用for语句判断一下线程是否停止状态，如果停止，则后面代码不再运行
         * 结果
         * 不再执行
         */
        for (int i = 0; i < 500000; i++) {
            if (this.interrupted()) {
                System.out.println("已经是停止状态了！我要推出了！");
                break;
            }
            System.out.println("i=" + (i + 1));
        }
        System.out.println();
        System.out.println("虽然线程中断，但是for{}循环外，后面的语句仍会执行");

    }
}
