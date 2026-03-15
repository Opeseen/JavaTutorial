package com.eazybytes.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
  public static void main(String[] args) {
    Set<String> visitedCountries = new HashSet<>();
    visitedCountries.add("India");
    visitedCountries.add("Nigeria");
    visitedCountries.add("USA");
    visitedCountries.add("Nigeria");
    visitedCountries.add("Liverpool");
    visitedCountries.add("Ghana");
    System.out.println(visitedCountries.size());
    System.out.println(visitedCountries);

    boolean contains = visitedCountries.contains("USA");
    boolean contains2 = visitedCountries.contains("Dubai");
    visitedCountries.remove("Ghana");
  }
}
