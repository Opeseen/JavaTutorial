package com.eazybytes.generics;

public class NonGenericCodeDemo {
  public static void main(String[] args) {
    Pair stringIntPair = new Pair("Hello", 42);
    stringIntPair.setFirst(16);
    String myString = (String) stringIntPair.getFirst(); // requires casting
    int myInt = (Integer) stringIntPair.getSecond(); // requires casting
    System.out.println(myInt);
    System.out.println(myString);
  }
}
