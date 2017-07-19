package ch7_formatOK_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by xu on 18/07/2017.
 */
public class DateTools {
    public static Date parse(String formatPattern, String dateString) throws ParseException {
        return new SimpleDateFormat(formatPattern).parse(dateString);
    }
    public static String format(String formatPattern, Date date) {
        return new SimpleDateFormat(formatPattern).format(date).toString();
    }

}
