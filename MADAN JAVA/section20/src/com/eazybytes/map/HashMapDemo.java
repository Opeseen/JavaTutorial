package com.eazybytes.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
  public static void main(String[] args) {
    Map<String, String> countryMap = new HashMap<>();
    countryMap.put("India", "New Delhi");
    countryMap.put("USA", "Washington DC");
    countryMap.put("Nigeria", "Abuja");
    countryMap.put(null, null);

    System.out.println(countryMap.get("India"));
    System.out.println(countryMap.get(null));
    System.out.println(countryMap.size());
  }
}
