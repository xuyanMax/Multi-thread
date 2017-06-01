package ch2_t6_sync_slv_weakness;

/**
 * Created by xu on 2017/5/31.
 */
public class Task {
    private String getData1;
    private String getData2;
    public void doLongTimeTask() {

        try {

            System.out.println("begin task." + Thread.currentThread().getName());
            Thread.sleep(3000);
            System.out.println(Thread.currentThread());
            String privateGetData1 = "长时间处理任务后从远程返回的值 1 threadname=" + Thread.currentThread().getName();
            String privateGetData2 = "长时间处理任务后从远程返回的值 2 threadname=" + Thread.currentThread().getName();

            //同步代码块
            synchronized (this) {
                getData1 = privateGetData1;
                getData2 = privateGetData2;
            }
            System.out.println(getData1);
            System.out.println(getData2);
            System.out.println("end task1." + Thread.currentThread().getName());
            System.out.println("end task2." + Thread.currentThread().getName());

        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
}
