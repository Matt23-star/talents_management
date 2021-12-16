package com.foe.talentmanagementback.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateUtils {

    public static Date dateConvert(Date date) {
        try {
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            return dateFormat.parse(dateFormat.format(date));
        } catch (ParseException parseException) {
            return date;
        }
    }

    public static int getDaysInterval(Date startDate, Date endDate){

        startDate = dateConvert(startDate);

        Long startTime = startDate.getTime();
        Long endTime;
        if (endDate!=null)
        {
            endDate = dateConvert(endDate);
            endTime = endDate.getTime();
        }else
            endTime = System.currentTimeMillis();

        //获取的毫秒级时间戳，以此需要除以1000
        long daysL = (endTime-startTime)/24/60/60/1000;
        int days = (int) daysL;
        System.out.println(days);
        return days;
    }
}
