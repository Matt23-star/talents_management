package com.foe.talentmanagementback.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: Matt
 * @date: 2021/7/12/21:08
 * @description:
 */
public class DateConvert {

    public static Date dateConvert(Date date) {
        try {
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            return dateFormat.parse(dateFormat.format(date));
        } catch (ParseException parseException) {
            return date;
        }
    }
}
