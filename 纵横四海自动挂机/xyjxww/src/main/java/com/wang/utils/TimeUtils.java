package com.wang.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtils {

        public static String getTime(){
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date now = new Date();
            return dateFormat.format(now);
        }

}
