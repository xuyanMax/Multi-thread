package ch3_busy_waiting;

/**
 * Created by xu on 2017/6/4.
 */
public class MyThreadB extends Thread {
    private MyList list;

    public MyThreadB(MyList l) {
        super();
        this.list = l;
    }

    @Override
    public void run() {

                try {

                    while (true) {
                        // busy waiting
                        if (list.size() != 5) {

                            System.out.println("list大小等于5了，线程=" + Thread.currentThread().getName() + "要退出了！");

                            throw new InterruptedException();
                        }
                    }
                }
                    catch(InterruptedException e){
                        e.printStackTrace();
                }

    }
}
