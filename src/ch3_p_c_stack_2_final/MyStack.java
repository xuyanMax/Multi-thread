package ch3_p_c_stack_2_final;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xu on 2017/6/7.
 */
public class MyStack {
    private List list = new ArrayList();
    synchronized public void push() {

        try {

            while (list.size() == 1) {
                System.out.println(".........push, "+"生产者线程"+Thread.currentThread().getName()+"等待中... ...");
                this.wait();
            }


            list.add("anything="+Math.random()*100);
            // thange notify ->notifyAll
            this.notifyAll();
            System.out.println("push(生产"+Thread.currentThread().getName()+"), list size = "+list.size());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    synchronized public String pop() {
        String returnValue = "";
        try {

            while (list.size() == 0) {
                System.out.println(".........pop, "+"消费者线程"+Thread.currentThread().getName()+"等待中... ...");
                this.wait();
            }

            returnValue = "" + list.get(0);

            list.remove(0);

            // thange notify ->notifyAll
            this.notifyAll();
            System.out.println("pop(消费线程"+Thread.currentThread().getName()+"), "+ returnValue+", "+ "list.size="+ list.size());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return returnValue;
    }
}
