package ch3_p_c_stack_2_old;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xu on 2017/6/7.
 */
public class MyStack {
    private List list = new ArrayList();
    synchronized public void push() {

        try {
            if (list.size() == 1) {
                System.out.println(".........push, "+"生产者线程等待中... ...");
                this.wait();
            }


            list.add("anything="+Math.random()*100);
            this.notify();
            System.out.println("push(生产), list size = "+list.size());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    synchronized public String pop() {
        String returnValue = "";
        try {
            if (list.size() == 0) {
                System.out.println(".........pop, "+"消费者线程等待中... ...");
                this.wait();
            }

            returnValue = "" + list.get(0);

            list.remove(0);

            this.notify();
            System.out.println("pop(消费), "+ returnValue+", "+ "list.size="+ list.size());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return returnValue;
    }
}
