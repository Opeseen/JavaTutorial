package com.eazybytes.generics.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class UnBoundedWildCardDemo {
  public static void main(String[] args) {
    List<Integer> li = Arrays.asList(1,2,3);
    List<String> li2 = Arrays.asList("One", "Two", "Three");
    printList(li);
    printList(li2);
  }

  public static void printList(List<?> list){
    for (Object obj: list){
      System.out.println(obj);
    }
    System.out.println(list.size());
  }
}
