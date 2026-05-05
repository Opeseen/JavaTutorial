package com.eazybytes.newapi;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;

public class InstantDemo {
  public static void main(String[] args) {
    Instant i1 = Instant.ofEpochSecond(1000);
    Instant i2 = Instant.now();
    long seconds = i2.getEpochSecond();
    long nanoSeconds = i2.getNano();

    Duration d1 = Duration.ofDays(5);
    Duration d2 = Duration.ofMinutes(10);
    Duration d3 = Duration.ofSeconds(30);
    Duration d4 = Duration.ofSeconds(-13);
    Duration d5 = d3.plus(d4);

    Instant i3 = i1.plus(d1);
    Instant i4 = i2.minus(d2);
    boolean isAfter = i3.isAfter(i4);
    boolean isBefore = i3.isBefore(i4);

    Duration durationObj = Duration.between(i1, i3);

  }
}
