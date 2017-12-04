package com.example.xyzreader.ui;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class DateConstants {

    public static SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.sss");
    // Use default locale format
    public static SimpleDateFormat OUTPUT_FORMAT = new SimpleDateFormat();
    // Most time functions can only handle 1902 - 2037
    public static GregorianCalendar START_OF_EPOCH = new GregorianCalendar(2,1,1);
}
