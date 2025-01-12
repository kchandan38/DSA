package com.datastructure.java8course.ch1;

import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class ConvertingDates {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime());
    }
}
