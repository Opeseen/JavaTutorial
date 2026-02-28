package com.eazybytes.wrapper;

public class BoxingDemo {
  public static void main(String[] args) {
    int num = 16;
    // Approach 1 @Depreciated
    Integer integer = new Integer(num);
    Double doubleObj = new Double(3.14);

    // Approach 2
    Integer integer1 = Integer.valueOf(num);
    Double doubleObj1 = Double.valueOf("3.14");

    int num1 = Integer.parseInt("18");
    System.out.println(num1);
  }
}
