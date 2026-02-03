package com.eazybytes.main;

public class ArrayForLoopDemo {
  public static void main(String[] args) {
    int[] mobileNumbers = new int[116];
    mobileNumbers[0] = 123456789;
    mobileNumbers[16] = 111111111;
    mobileNumbers[24] = 222222222;
    mobileNumbers[38] = 333333333;
    mobileNumbers[94] = 444444444;
    for(int i = 0;i < mobileNumbers.length;i++){
      System.out.println("The element at index: " + i + " is: "+ mobileNumbers[i]);
    }

    String[] names = new String[3];
    names[2] = "Madan";
    for(int i = 0;i < names.length;i++){
      System.out.println("The element at index: " + i + " is: "+ names[i]);
    }

  }
}
