package com.eazybytes.set;

import java.util.LinkedHashSet;
import java.util.SequencedSet;

public class LinkedHashSetDemo {
  public static void main(String[] args) {
    var visitedCountries = new LinkedHashSet<String>();
    visitedCountries.add("India");
    visitedCountries.add("Nigeria");
    visitedCountries.add("USA");
    visitedCountries.add("Dubai");
    visitedCountries.add("Liverpool");
    visitedCountries.add("France");

    for(String countryNames: visitedCountries){
      System.out.println(countryNames);
    }

    SequencedSet<String> reversedCountry = visitedCountries.reversed();
    System.out.println(reversedCountry);

  }
}
