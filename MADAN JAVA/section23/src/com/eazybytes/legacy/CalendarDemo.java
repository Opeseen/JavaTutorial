package com.eazybytes.legacy;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarDemo {
  public static void main(String[] args) {
    Calendar currentDate = Calendar.getInstance();
    System.out.println(currentDate);
    Date currentDateObj = currentDate.getTime();
    System.out.println();
    System.out.println(currentDateObj);
    GregorianCalendar gregorianCalendar = new GregorianCalendar(2100, Calendar.JANUARY, 1);
    Date gregorianCalendarObj = gregorianCalendar.getTime();
    System.out.println(gregorianCalendarObj);

    int year = gregorianCalendar.get(Calendar.YEAR);
    int month = gregorianCalendar.get(Calendar.MONTH);

    gregorianCalendar.set(Calendar.YEAR, 2101);
    gregorianCalendar.set(Calendar.MONTH, Calendar.FEBRUARY);

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String formatDate = dateFormat.format(gregorianCalendar.getTime());
    System.out.println(formatDate);

    gregorianCalendar.add(Calendar.HOUR, 2);
    gregorianCalendar.add(Calendar.HOUR, -3);
    formatDate = dateFormat.format(gregorianCalendar.getTime());
    System.out.println(formatDate);

    boolean isLeapYear = gregorianCalendar.isLeapYear(2048);
    System.out.println(isLeapYear);
  }
}
