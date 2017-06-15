package com.pudong.airport.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

public class DateUtil {

    public static final String YYYYMMDDHHMMSSSSS = "yyyyMMddHHmmssSSS";
    public static final String YYYYMMDDHHMMSS = "yyyyMMddHHmmss";
    public static final String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
    public static final String YYYY_MM_DD = "yyyy-MM-dd";
    public static final String YYYYMMDD = "yyyyMMdd";
    public static final String HHMMSS = "HHmmss";
    public static final String YYYY_MM = "yyyy-MM";

    public static ThreadLocal<DateFormat> threadLocal = new ThreadLocal<DateFormat>() {

        @Override
        protected synchronized DateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }

    };

    public static String format(long date) {
        return threadLocal.get().format(date);
    }

    public static String format(Date date, String pattern) {
        SimpleDateFormat df = new SimpleDateFormat();
        df.applyPattern(pattern);
        return df.format(date);
    }

    public static long getCurrentTimeSeconds() {
        long time = System.currentTimeMillis();
        return time / 1000;
    }

    public static Date parse(String dateStr, String pattern) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat();
        df.applyPattern(pattern);
        return df.parse(dateStr);
    }

    public static String format(long timestampSeconds, String pattern) {
        return format(new Date(timestampSeconds * 1000), pattern);
    }

    public static String formatTime(long timestampMillSeconds, String pattern) {
        return format(new Date(timestampMillSeconds), pattern);
    }

    public static String getDateStringByTimeZone(float timeZoneOffset) {
        if (timeZoneOffset > 13 || timeZoneOffset < -12) {
            timeZoneOffset = 0;
        }
        int newTime = (int) (timeZoneOffset * 60 * 60 * 1000);
        TimeZone timeZone;
        String[] ids = TimeZone.getAvailableIDs(newTime);
        if (ids.length == 0) {
            timeZone = TimeZone.getDefault();
        } else {
            timeZone = new SimpleTimeZone(newTime, ids[0]);
        }
        SimpleDateFormat sdf = new SimpleDateFormat(YYYY_MM_DD_HH_MM_SS);
        sdf.setTimeZone(timeZone);
        return sdf.format(new Date());
    }


}
