package com.eazybytes.legacy;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class TimeZoneDateDemo {
  public static void main(String[] args) {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MMMM-dd HH:mm:ss");
    dateFormat.setTimeZone(TimeZone.getTimeZone("America/New_York"));
    String formattedDate = dateFormat.format(new Date());
    System.out.println(formattedDate);

    GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("America/New_York"));
    System.out.println(gregorianCalendar);
    int year = gregorianCalendar.get(Calendar.YEAR);
    int month = gregorianCalendar.get(Calendar.MONTH);

    System.out.println(gregorianCalendar.getTime());
  }
}
