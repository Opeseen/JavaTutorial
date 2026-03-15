package com.eazybytes.legacy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormattingDemo {
  public static void main(String[] args) throws ParseException {
    Date currentDate = new Date();
    System.out.println(currentDate);
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String formatDate = dateFormat.format(currentDate);
    System.out.println(formatDate);
    System.out.println();

    SimpleDateFormat dateFormat1 = new SimpleDateFormat("MM/dd/yyyy");
    String formatDate1 = dateFormat1.format(currentDate);
    System.out.println(formatDate1);

    String dateString = "2100-09-26 14:30:00";
    SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Date formatDate2 = dateFormat2.parse(dateString);
    System.out.println(formatDate2);
  }
}
