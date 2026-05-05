package com.eazybytes.legacy;

import java.util.TimeZone;

public class TimeZoneIDList {
  public static void main(String[] args) {
    String[] timeZoneIds = TimeZone.getAvailableIDs();
    for(String timeZoneId: timeZoneIds){
      System.out.println(timeZoneId);
    }
  }
}
