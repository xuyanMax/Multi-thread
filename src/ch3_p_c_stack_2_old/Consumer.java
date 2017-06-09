package ch3_p_c_stack_2_old;


/**
 * Created by xu on 2017/6/7.
 */
public class Consumer {
    private MyStack myStack;

    public Consumer(MyStack stack) {
        super();
        this.myStack = stack;
    }
    public void popService() {
        myStack.pop();
    }
}
