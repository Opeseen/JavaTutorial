package com.eazybytes.main;

public class ArrayLengthDemo {
  public static void main(String[] args) {
    int[] nums = {1,2,3,4,5};
    String[] names = new String[]{"Madan", "John", "Lucy"};
    int[] mobileNumbers = new int[116];

    System.out.println(nums.length);
    System.out.println(names.length);
    System.out.println(mobileNumbers.length);

    double[] prices = new double[1000];
    System.out.println(prices.length);

    char[] grades = new char[0];
    int[] emptyArray = {}; // in real project, empty array is of no use as we won't be able to store any data in them

    System.out.println(grades.length);
    System.out.println(emptyArray.length);
  }
}
