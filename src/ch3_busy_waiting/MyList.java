package ch3_busy_waiting;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xu on 2017/6/5.
 */
public class MyList {
    volatile private List<Integer> list = new ArrayList<>();
    public void add() {
        list.add(1);
    }

    public int size() {
        return list.size();
    }

}
