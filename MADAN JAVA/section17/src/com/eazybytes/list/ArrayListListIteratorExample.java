package com.eazybytes.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListListIteratorExample {
  public static void main(String[] args) {
    List<String> countryNames = new ArrayList<>();
    countryNames.add("Nigeria");
    countryNames.add("canada");
    countryNames.add("USA");
    countryNames.add("Nigeria");
    countryNames.add("India");

    ListIterator<String> listIterator = countryNames.listIterator();
    while(listIterator.hasNext()){
      String country = listIterator.next();
      System.out.println(country);
    }
    System.out.println();
    while(listIterator.hasPrevious()){
      String country = listIterator.previous();
      System.out.println(country);
    }
  }
}
