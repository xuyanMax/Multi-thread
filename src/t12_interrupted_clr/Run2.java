package t12_interrupted_clr;

public class Run2 {

    public static void main(String[] args) {
        /*
         * interrupted()方法判断线程是否是停止状态，但是第二个布尔值为false...
         * 因为，interrupted()方法将线程的中断状态清除
         */

        Thread.currentThread().interrupt();//此为中断
        System.out.println("是否停止1？=" + Thread.interrupted()); //ture
        System.out.println("是否停止2？=" + Thread.interrupted()); //false
        System.out.println("end");

    }

}
