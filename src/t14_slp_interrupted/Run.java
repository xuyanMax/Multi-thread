package t14_slp_interrupted;

public class Run {

    public static void main(String[] args) {

        try {
            //控制台日志输出到文本，可查看文件
//			System.setOut(new PrintStream(new FileOutputStream("./output.txt"))); 
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(200);
            thread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("main end!");


    }

}
