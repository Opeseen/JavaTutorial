package com.eazybytes.exception;

import java.io.*;

public class UnCheckedExceptionDemo {
  public static void main(String[] args) {
    String input = null;
    input = "Madan";
    input = input.toUpperCase();
    input = input.substring(1,10);
  }
}
