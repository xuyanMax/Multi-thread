package ch2_syncMethod_lock_object;

import ch2_t1.HasSelfPrivateNum;

/**
 * Created by xu on 2017/5/30.
 */
public class Run {
     public static void main(String[] args){
         /*
            synchronized 方法与锁对象的实例

            MyObject方法不添加关键字synchronized时
            可以看出"两个线程一同进入methodA()方法"，造成"非线程安全"

            输出结果
            begin methodA() threadName=A
            begin methodA() threadName=B
            methodA() end
            methodA() end

            代码修改：添加synchronized关键字与methodA() 前

            输出结果
            begin methodA() threadName=A
            methodA() end
            begin methodA() threadName=B
            methodA() end

            结论：
            调用关键字synchronized声明的方法一定是排队运行的。

            p.s
            只有共享资源的读写访问需要同步化，如果部是共享资源，根本没必要同步！


          */

         MyObject objecet = new MyObject();
         ThreadA threadA = new ThreadA(objecet);
         threadA.setName("A");

         ThreadB threadB = new ThreadB(objecet);
         threadB.setName("B");

         threadA.start();
         threadB.start();
     }
}
