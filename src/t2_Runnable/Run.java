package t2_Runnable;

public class Run {
    /*
     * 当一个类已经有一个父类时，只能通过实现Runnable接口实现多线程
     * 另外，Thread类也实现了Runnable接口
     *
     * 同样地，结果有两种不同的顺序。
     */
    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("运行结束");
    }
}
