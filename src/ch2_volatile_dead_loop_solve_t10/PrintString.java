package ch2_volatile_dead_loop_solve_t10;

/**
 * Created by xu on 2017/6/4.
 */
public class PrintString implements Runnable{
    private boolean isContinuedPrint = true;
    public boolean getIsContinuedPrint() {
        return isContinuedPrint;
    }
    public void setContinuedPrint(boolean isC) {
        this.isContinuedPrint = isC;
    }
    public void printStringMethod() {
        try {

            while (isContinuedPrint == true) {
                System.out.println("run printStringMethod threadName="+Thread.currentThread().getName());
            }
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void run() {
        printStringMethod();
    }
}
