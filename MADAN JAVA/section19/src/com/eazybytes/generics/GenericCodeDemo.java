package com.eazybytes.generics;

public class GenericCodeDemo {
  public static void main(String[] args) {
    GenericPair<String, Integer> stringIntPair = new GenericPair<>("Hello", 42);
    stringIntPair.setFirst("Another String");
    stringIntPair.setSecond(123);
    String myString = stringIntPair.getFirst(); // requires casting
    int myInt =  stringIntPair.getSecond(); // requires casting
    System.out.println(myInt);
    System.out.println(myString);
  }
}
