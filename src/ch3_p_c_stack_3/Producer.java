package ch3_p_c_stack_3;

/**
 * Created by xu on 2017/6/7.
 */
public class Producer {
    private MyStack myStack;

    public Producer(MyStack stack) {
        super();
        this.myStack = stack;
    }
    public void pushService() {
        myStack.push();
    }
}
