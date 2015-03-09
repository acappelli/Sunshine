package org.acappelli.sunshine;

import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author Andrea Cappelli
 */
public class Utils {

    public static String getDate(long millis) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
        Date now = new Date();
        now.setTime(millis);
        return sdf.format(now);
    }
}
