package ch2_throwExceptionReleaseLock;

/**
 * Created by xu on 2017/5/31.
 */
public class Service {
    synchronized public void testMethod() {
        if (Thread.currentThread().getName().equals("a")) {
                System.out.println("ThreadName=" + Thread.currentThread().getName()+" run beginTime"+System.currentTimeMillis());
                int i = 1;
                while (i==1) {
                    if (("" + Math.random()).substring(0,8).equals("0.123456")) { // 产生小数点后七位的-随机数
                        System.out.println("ThreadName=" + Thread.currentThread().getName() +
                        " run exceptionTime="+System.currentTimeMillis());
                        Integer.parseInt("a");// will throw number-format-exception
                    }
                }
        } else{
            System.out.println("Thread B run time="+ System.currentTimeMillis());
        }
    }
}
