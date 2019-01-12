package runStopMethod;

public class Run {

    public static void main(String[] args) {

        /*
         * 调用stop()方法会抛出java.lang.ThreadDeath异常，但在通常情况下不需要显式地捕捉
         *  stop方法被deprecated，原因：
         *  1、可能使得一些请理性的工作得不到完成
         *  2、对锁定的对象进行了“解锁”，导致数据得不到同步的处理，出现数据不一致的问题
         */

        //控制台日志输出到文本，可查看文件
//			System.setOut(new PrintStream(new FileOutputStream("./output.txt"))); 
        MyThread thread = new MyThread();
        thread.start();

    }

}
