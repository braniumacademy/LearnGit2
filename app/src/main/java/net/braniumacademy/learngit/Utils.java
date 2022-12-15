package net.braniumacademy.learngit;

import android.annotation.SuppressLint;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
    private static final String format = "dd/MM/yyyy";
    @SuppressLint("SimpleDateFormat")
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat(format);

    public String dateToString(Date date) {
        if(date == null) {
            return "";
        } else {
            return dateFormat.format(date);
        }
    }
}
