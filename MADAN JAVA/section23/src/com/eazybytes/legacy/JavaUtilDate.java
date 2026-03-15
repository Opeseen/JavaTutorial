package com.eazybytes.legacy;

import java.util.Date;

public class JavaUtilDate {
  public static void main(String[] args) {
    Date currentDate = new Date();
    currentDate.setYear(200);
    long timeImMs = currentDate.getTime();
    System.out.println(timeImMs);

    Date futureDate = new Date(200,8,26, 8 , 15, 39);
    System.out.println(futureDate);
    long timeInMs =  futureDate.getTime();
    System.out.println(timeInMs);
    Date date = new Date(timeInMs + 86400000);
    System.out.println(date);

    boolean isAfter = futureDate.after(date);
    System.out.println(isAfter);
  }
}
