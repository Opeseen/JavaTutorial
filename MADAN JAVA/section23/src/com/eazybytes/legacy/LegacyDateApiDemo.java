package com.eazybytes.legacy;

import java.util.Date;

public class LegacyDateApiDemo {
  public static void main(String[] args) {
    Date date = new Date();
    System.out.println(date);
    Date date1 = new Date(200,8,26, 8 , 15, 39);
    System.out.println(date1);
  }
}
