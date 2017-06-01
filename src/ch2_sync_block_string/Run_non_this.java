package ch2_sync_block_string;

/**
 * Created by xu on 2017/6/1.
 */
public class Run_non_this {
     public static void main(String[] args){
            /*
            对service进行改动

            输出结果
            线程名称为： A，在 1496284836036 进入同步块
            线程名称为： B，在 1496284836036 进入同步块
            线程名称为： B，在 1496284839040 离开同步块
            线程名称为： A，在 1496284839040 离开同步块

            可见，当不同线程执行anyString对象，因为不是同一个对象，不是同一个"对象监视器"，因此出现交叉运行
            所以，使用synchronized(非this对象)同步代码块进行同步操作时，对象监视器必须是同一个对象！
            * */
             Service_non_this service = new Service_non_this();
             ThreadA_non_this a = new ThreadA_non_this(service);
             ThreadB_non_this b = new ThreadB_non_this(service);
             a.setName("A");
             b.setName("B");
             a.start();
             b.start();

     }

}
