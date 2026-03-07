package com.eazybytes.generics;

import java.util.ArrayList;

public class WithoutGenericsDemo {
  public static void main(String[] args) {
    ArrayList list = new ArrayList();
    list.add("Hello");
    list.add(123);
    list.add(true);


    Object greeting = (String) list.get(0);
    System.out.println(greeting);

    ArrayList<String> list2 = new ArrayList();
    list2.add("Hello");

    Object greeting1 =  list2.get(0);
    System.out.println(greeting1);

  }
}
