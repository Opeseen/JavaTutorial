package com.eazybytes.enumeration;

import java.util.EnumSet;

public class EnumSetDemo {
  public static void main(String[] args) {
    EnumSet<Day> allDays = EnumSet.allOf(Day.class);
    for(Day day: allDays){
      System.out.println(day);
    }
    System.out.println();
    EnumSet<Day> someDays = EnumSet.of(Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY);
    for(Day day: someDays){
      System.out.println(day);
    }
    System.out.println();
    EnumSet<Grades> passGrades = EnumSet.range(Grades.A, Grades.C);
    for(Grades grades: passGrades){
      System.out.println(grades);
    }
    System.out.println();
    EnumSet<Grades> failedGrades = EnumSet.complementOf(passGrades);
    for(Grades grades: failedGrades){
      System.out.println(grades);
    }
  }
}
