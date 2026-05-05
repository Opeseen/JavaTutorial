package com.eazybytes.newapi;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {
  public static void main(String[] args) {
    LocalDate localDate1 = LocalDate.of(2013,1,1);
    LocalDate localDate2 = LocalDate.of(2015, 3, 18);
    Period period = Period.between(localDate1, localDate2);
    Period oneYearTwoMonth = Period.of(1,2,0);
    Period threeDays = Period.ofDays(3);
    LocalDate localDate3 = localDate1.plus(oneYearTwoMonth);

  }
}
