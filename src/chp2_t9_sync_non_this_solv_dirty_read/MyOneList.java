package chp2_t9_sync_non_this_solv_dirty_read;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xu on 2017/6/1.
 */
public class MyOneList {
    private List list = new ArrayList();
    synchronized public void add(String data) {
        list.add(data);
    }
    synchronized public int getSize() {
        return list.size();
    }


}
