package stopThrowLock;

public class Run {

    public static void main(String[] args) {
        try {
            SynchronizedObject object = new SynchronizedObject();//"a", "aa"
            MyThread thread = new MyThread(object);


            thread.start();
            System.out.println(object.getUsername() + " " + object.getPsswd());
            Thread.sleep(1000);//main线程休眠时间要比MyThread短才能看出效果
            thread.stop();

            System.out.println(object.getUsername() + " " + object.getPsswd());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
