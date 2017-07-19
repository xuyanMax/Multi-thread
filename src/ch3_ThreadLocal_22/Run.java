package ch3_ThreadLocal_22;

/**
 * Created by xu on 2017/6/12.
 */
public class Run {

    //解决初始值 t1.get()==null问题
    public static ThreadLocalExt t1 = new ThreadLocalExt();
    /*此案例仅仅证明了，main线程有了自己的ThreadLocal初始值（不再是null），那么其他线程是否有自己的初始值呢？*/
     public static void main(String[] args){
        if(t1.get()==null) {
            System.out.println("从未放过值");
            t1.set("我的值");
        }
         System.out.println(t1.get());
         System.out.println(t1.get());

     }
}
