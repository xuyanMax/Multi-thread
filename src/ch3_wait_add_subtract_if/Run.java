package ch3_wait_add_subtract_if;

/**
 * Created by xu on 2017/6/7.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        /*出现异常的原因是有两个实现删除的remove()操作的线程，他们在Thread.sleep()之后都执行了wait方法，呈等待状态，
         * 当加操作的线程在1秒后被运行时，通知了所有呈wait等待状态的减操作的线程，那么第一个实现减操作的线程能够正常的删除list中索引为0的数据，
         * 但是第二个实现减操作的线程则出现索引溢出的异常，因为list中仅仅添加了一个数据，也只能删除1一个数据，没有多余的数据可供删除*/
        String lock = new String("");

        Add add = new Add(lock);
        Subtract sub = new Subtract(lock);

        ThreadAdd threadAdd1 = new ThreadAdd(add);
        ThreadAdd threadAdd2 = new ThreadAdd(add);

        ThreadSub threadSub1 = new ThreadSub(sub);
        ThreadSub threadSub2 = new ThreadSub(sub);

        threadSub1.start();
        threadSub2.start();
        Thread.sleep(1000);

        threadAdd1.start();
//         threadAdd2.start();

    }
}
