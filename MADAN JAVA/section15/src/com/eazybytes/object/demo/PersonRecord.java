package com.eazybytes.object.demo;

public record PersonRecord(String name, String occupation) {
  public static String country = "USA"; // can only create static field in record not instance fields!
  public PersonRecord {
    if (name == null || occupation == null) {
      throw new IllegalArgumentException();
    }
  }
}
