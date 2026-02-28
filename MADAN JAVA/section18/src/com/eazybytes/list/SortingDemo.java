package com.eazybytes.list;

import java.util.*;

public class SortingDemo {
  public static void main(String[] args) {
    List<Integer> numbers = new LinkedList<>();
    numbers.add(60);
    numbers.add(-50);
    numbers.add(40);
    numbers.add(30);
    numbers.add(-20);
    numbers.add(10);
    numbers.add(0);
    System.out.println(numbers);
    Collections.sort(numbers);
    System.out.println(numbers);
    Collections.sort(numbers, Comparator.reverseOrder());
    System.out.println(numbers);

    System.out.println();

    var countries = new LinkedList<String>();
    countries.add("Nigeria");
    countries.add("Canada");
    countries.add("USA");
    countries.add("Nigeria");
    countries.add("India");
    System.out.println(countries);
    countries.sort(Comparator.naturalOrder());
    System.out.println(countries);
    countries.sort(Comparator.reverseOrder());
    System.out.println(countries);

    System.out.println();

    var countries1 = new LinkedList<String>();
    countries1.add("Nigeria");
    countries1.add("Canada");
    countries1.add("USA");
    countries1.add("Nigeria");
    countries1.add("India");
    // countries1.sort(new LastCharComparator());
    Collections.sort(countries1, new LastCharComparator());
    System.out.println(countries1);
  }
}
