package com.eazybytes.wrapper;

public class UnboxingDemo {
  public static void main(String[] args) {
    int num = 16;
    // Boxing
    Integer integer1 = Integer.valueOf(num);
    Double doubleObj1 = Double.valueOf("3.14");

    // Unboxing
    int num1 = integer1.intValue();
    double num2 = doubleObj1.doubleValue();

    System.out.println(num1);
    System.out.println(num2);
  }
}
