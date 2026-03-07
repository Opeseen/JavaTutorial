package com.eazybytes.generics.model;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundWildCardDemo {
  public static void main(String[] args) {
    addNumbers(new ArrayList<>());
  }

  public static void addNumbers(List<? super Integer> list){
    for (int i=0; i<10; i++){
      list.add(i);
    }
    // list.add(3.14); // not allowed -> double type
    System.out.println(list);
  }
}
