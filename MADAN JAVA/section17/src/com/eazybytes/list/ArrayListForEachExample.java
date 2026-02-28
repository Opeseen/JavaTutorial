package com.eazybytes.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListForEachExample {
  public static void main(String[] args) {
    List<String> countryNames = new ArrayList<>();
    countryNames.add("Nigeria");
    countryNames.add("canada");
    countryNames.add("USA");
    countryNames.add("Nigeria");
    countryNames.add("India");

    for(String country: countryNames ){
      System.out.println(country);
    }

  }
}
