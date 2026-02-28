package com.eazybytes.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayVsArrayList {
  public static void main(String[] args) {
    ArrayList<String > countryNames = new ArrayList<>();
    countryNames.add("Nigeria");
    countryNames.add("Canada");
    countryNames.add("USA");
    countryNames.add("Nigeria");
    countryNames.add("India");

    String[] countries = countryNames.toArray(new String[countryNames.size()]);
    System.out.println(Arrays.toString(countries));

    List<String> newList = Arrays.asList(countries);
    System.out.println(newList);
  }
}
