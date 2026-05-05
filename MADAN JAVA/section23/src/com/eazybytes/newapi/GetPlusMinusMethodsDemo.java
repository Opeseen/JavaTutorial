package com.eazybytes.newapi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class GetPlusMinusMethodsDemo {
  public static void main(String[] args) {
    LocalDate localDate = LocalDate.of(2015, 3, 18);
    int year =  localDate.getYear();
    Month month = localDate.getMonth();
    int dayOfMonth = localDate.getDayOfMonth();
    DayOfWeek dayOfWeek = localDate.getDayOfWeek();

    LocalDateTime localDateTime = LocalDateTime.now();
    int hour = localDateTime.getHour();

    LocalDate ld1 = localDate.plusDays(6);
    LocalDate ld2 = localDate.plusMonths(6);
    LocalDate ld3 = localDate.minusMonths(9);

  }
}
