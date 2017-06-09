package ch2_sync_inner_static_class_2;

import com.sun.org.apache.bcel.internal.classfile.InnerClass;

/**
 * Created by xu on 2017/6/7.
 */
public class OutClass {
    static class Inner1 {
        public void method() {
            synchronized (Inner2.class){//类锁
                System.out.println("进入Inner1类中的method方法");
                for (int i=1; i<=10; i++) {
                    System.out.println(Thread.currentThread().getName() + ", i="+i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("离开Inner1类中的method方法");
            }
        }
        public synchronized void method2() { //对象锁
            System.out.println("进入Inner1类中的method2方法");
            for (int i=1; i<=10; i++) {
                System.out.println(Thread.currentThread().getName() + ", i="+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("离开Inner1类中的method2方法");
        }
    }
    static class Inner2 {
        synchronized public void method() {
            System.out.println("进入Inner2类中的method方法");
                for (int i=1; i<=10; i++) {
                    System.out.println(Thread.currentThread().getName() + ", i="+i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            System.out.println("离开Inner2类中的method2方法");

        }
        public synchronized void method2() {//对象锁但是与inner1是不同对象
            for (int i=1; i<=10; i++) {
                System.out.println(Thread.currentThread().getName() + ", i="+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
