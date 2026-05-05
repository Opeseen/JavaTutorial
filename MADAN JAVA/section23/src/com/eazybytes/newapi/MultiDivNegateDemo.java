package com.eazybytes.newapi;

import java.time.Duration;
import java.time.Period;

public class MultiDivNegateDemo {
  public static void main(String[] args) {
    Duration originalDuration = Duration.ofMinutes(30);
    Duration multiplyDuration = originalDuration.multipliedBy(3);
    Duration dividedDuration = originalDuration.dividedBy(2);
    Duration negatedDuration = originalDuration.negated();

    Period originalPeriod = Period.ofDays(3);
    Period multiplyPeriod = originalPeriod.multipliedBy(3);
    Period negatedPeriod = originalPeriod.negated();
  }
}
