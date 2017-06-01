package ch2_sync_not_extends;

import ch2_syncLockIn_2.MyThread;

/**
 * Created by xu on 2017/5/31.
 */
public class Test {
     public static void main(String[] args){
         /* 同步不具有继承性
           Sub方法不同步，main方法同步
         * 输出结果 （sub testMethod方法不添加synchronized关键字时）
         *
         *  int sub, 下一步 sleep begin, threadName=A,time=1496196933557
            int sub, 下一步 sleep begin, threadName=b,time=1496196933558
            int sub, 下一步 sleep end, threadName=b,time=1496196938558
            int sub, 下一步 sleep end, threadName=A,time=1496196938558
            int main, 下一步 sleep begin, threadName=b,time=1496196938558
            int main, 下一步 sleep end, threadName=b,time=1496196943560
            int main, 下一步 sleep begin, threadName=A,time=1496196943560
            int main, 下一步 sleep end, threadName=A,time=1496196948563

            从1-4行可以看出，线程a调用非同步方法对象subRef的testMethod后休眠，线程b可以异步调用同一个对象subRef的testMethod方法
            若想要达到同步的效果，需要在Sub类中的testMethod方法前加synchronzied关键字

            输出结果如下：
            int sub, 下一步 sleep begin, threadName=A,time=1496197401631
            int sub, 下一步 sleep end, threadName=A,time=1496197406636
            int main, 下一步 sleep begin, threadName=A,time=1496197406636
            int main, 下一步 sleep end, threadName=A,time=1496197411639
            int sub, 下一步 sleep begin, threadName=B,time=1496197411639
            int sub, 下一步 sleep end, threadName=B,time=1496197416640
            int main, 下一步 sleep begin, threadName=B,time=1496197416640
            int main, 下一步 sleep end, threadName=B,time=1496197421640

            --将Sub方法设为同步，main方法设为不同步

            输出结果如下
            int sub, 下一步 sleep begin, threadName=A,time=1496197320838
            int sub, 下一步 sleep end, threadName=A,time=1496197325843
            int main, 下一步 sleep begin, threadName=A,time=1496197325843
            int main, 下一步 sleep end, threadName=A,time=1496197330848
            int sub, 下一步 sleep begin, threadName=B,time=1496197330848
            int sub, 下一步 sleep end, threadName=B,time=1496197335850
            int main, 下一步 sleep begin, threadName=B,time=1496197335850
            int main, 下一步 sleep end, threadName=B,time=1496197340851
         * */
         Sub subRef = new Sub();
         ThreadA a = new ThreadA(subRef);
         a.setName("A");
         a.start();

         ThreadB b = new ThreadB(subRef);
         b.setName("B");
         b.start();
     }

}
