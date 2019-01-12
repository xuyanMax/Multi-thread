package t13_forprint;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        /*
         * 在线程中用for语句判断一下线程是否停止状态，如果停止，则for下面代码不再运行
         * 结果
         * 会执行
         */

        for (int i = 0; i < 500000; i++) {
            if (this.interrupted()) {
                System.out.println("已经是停止状态了！我要推出了！");
                break;
            }
            System.out.println("i=" + (i + 1));
        }
        // 验证线程结束，如是则下列语句不执行
        System.out.println("我被输出，如果此代码是for又继续运行，线程并未停止！");
    }
}
