package ch3_wait_notify_size5;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by xu on 2017/6/5.
 */
public class MyList {
    private static List<Integer> list = new ArrayList<>();
    public static void add() {
        list.add(1);
    }

    public static int size() {
        return list.size();
    }

}
