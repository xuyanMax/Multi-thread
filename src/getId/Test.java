package getId;

public class Test {

    /*
     * 线程名main 线程id 1
     */
    public static void main(String[] args) {
        Thread curr = Thread.currentThread();
        System.out.println(curr.getName() + " " + curr.getId());

    }

}
