package com.eazybytes.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIteration {
  public static void main(String[] args) {
    var countryNames = new LinkedList<String>();
    countryNames.add("Nigeria");
    countryNames.add("Canada");
    countryNames.add("India");
    countryNames.add("Nigeria");
    countryNames.add("USA");

    for(String country: countryNames){
      System.out.println(country.toUpperCase());
    }

    System.out.println();

    Iterator<String> iterator = countryNames.iterator();
    while (iterator.hasNext()){
      String countryName = iterator.next();
      System.out.println(countryName.toLowerCase());
    }

    System.out.println();

    ListIterator<String> listIterator = countryNames.listIterator();
    while (listIterator.hasNext()){
      String countryName = listIterator.next();
      System.out.println(countryName);
    }

    System.out.println();

    while (listIterator.hasPrevious()){
      String countryName = listIterator.previous();
      System.out.println(countryName);
    }
  }
}
