package ch4_conditionABC_sequence;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by xu on 2017/6/19.
 */
public class Run {
    /*使用Condition对象可以对线程执行的业务进行"排序规划"*/

    volatile private static int nextPrintWho = 1;

    private static ReentrantLock lock = new ReentrantLock();
    final private static Condition conditionA = lock.newCondition();
    final private static Condition conditionB = lock.newCondition();
    final private static Condition conditionC = lock.newCondition();

    public static void main(String[] args) {
        /*Condition对象可以对线程执行的业务进行排序规划
         *
         * 输出按照线程A->B->C的顺序进行
         *
         * */
        Thread a = new Thread() {
            @Override
            public void run() {
                try {
                    lock.lock();
                    while (nextPrintWho != 1) {
                        conditionA.await();
                    }
                    for (int i = 0; i < 3; i++)
                        System.err.println("ThreadA " + (i + 1));

                    nextPrintWho = 2;
                    conditionB.signalAll();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }

            }
        };
        Thread b = new Thread() {
            @Override
            public void run() {
                try {
                    lock.lock();
                    while (nextPrintWho != 2) {
                        conditionB.await();
                    }
                    for (int i = 0; i < 3; i++)
                        System.err.println("ThreadB " + (i + 1));

                    nextPrintWho = 3;
                    conditionC.signalAll();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }

            }
        };

        Thread c = new Thread() {
            @Override
            public void run() {
                try {
                    lock.lock();
                    while (nextPrintWho != 3) {
                        conditionC.await();
                    }
                    for (int i = 0; i < 3; i++)
                        System.err.println("ThreadC " + (i + 1));

                    nextPrintWho = 1;
                    conditionA.signalAll();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }

            }
        };
        Thread[] aArray = new Thread[5];
        Thread[] bArray = new Thread[5];
        Thread[] cArray = new Thread[5];

        for (int i = 0; i < 5; i++) {
            aArray[i] = new Thread(a);
            bArray[i] = new Thread(b);
            cArray[i] = new Thread(c);

            aArray[i].start();
            bArray[i].start();
            cArray[i].start();
        }

    }
}
