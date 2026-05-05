package com.eazybytes.newapi;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTImeDSTDemo {
  public static void main(String[] args) {
    // Flight departure in PST
    ZonedDateTime departure = ZonedDateTime.of(2024, 3, 9, 21, 0, 0, 0, ZoneId.of("America/Los_Angeles"));
    // Expected arrival in NYC (assuming flight duration is 4 hours)
    ZonedDateTime arrival = departure.plusHours(4).withZoneSameInstant(ZoneId.of("America/New_York"));
    System.out.println("Departure (PST): " + departure);
    System.out.println("Arrival (EST): " + arrival);
  }
}
