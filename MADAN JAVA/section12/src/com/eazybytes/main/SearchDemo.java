package com.eazybytes.main;

import java.util.Arrays;

public class SearchDemo {
  public static void main(String[] args) {
    int[] num = {36,9,42,18,73};
    Arrays.sort(num);
    int index = Arrays.binarySearch(num, 18);
    System.out.println(index);
    index = Arrays.binarySearch(num, 999);
    System.out.println(index);
  }
}
