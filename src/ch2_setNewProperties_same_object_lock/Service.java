package ch2_setNewProperties_same_object_lock;

/**
 * Created by xu on 2017/6/7.
 */
public class Service {
    public void serviceMethodA(UserInfo userInfo) {
        synchronized (userInfo) {
            try {
                System.out.println(Thread.currentThread().getName());

                //change properties of the lock object dosen't change the object itselfch2
                userInfo.setUsername("PeterJointTheLegend");

                Thread.sleep(3000);
                System.out.println("End! time="+System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
