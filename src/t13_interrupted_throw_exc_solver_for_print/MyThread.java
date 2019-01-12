package t13_interrupted_throw_exc_solver_for_print;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        /*
         * 在线程中用for语句判断一下线程是否停止状态，如果停止，则后面代码不再运行
         * 结果
         * 不再执行
         */

        try {
            for (int i = 0; i < 500000; i++) {
                if (this.interrupted()) {
                    System.out.println("已经是停止状态了！我要退出了！");
                    throw new InterruptedException();

                }
                System.out.println("i=" + (i + 1));
            }
            // 验证线程结束，如是则下列语句不执行
            System.out.println("我在for下面！不会执行！");
        } catch (InterruptedException e) {
            System.out.println("进MyThread,java类run方法中的catch了！");
            e.printStackTrace();
        }

    }


}
