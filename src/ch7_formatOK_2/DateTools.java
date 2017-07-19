package ch7_formatOK_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by xu on 18/07/2017.
 */
public class DateTools {
    private static ThreadLocal<SimpleDateFormat> t1 = new ThreadLocal<>();

    public static SimpleDateFormat getSimpleDateFormat(String datePattern) {
        SimpleDateFormat sdf = null;
        sdf = t1.get();
        if (sdf == null) {
            sdf = new SimpleDateFormat(datePattern);
            t1.set(sdf);
        }
        return sdf;

    }

}
