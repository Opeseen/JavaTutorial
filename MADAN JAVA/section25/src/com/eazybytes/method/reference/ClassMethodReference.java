package com.eazybytes.method.reference;

import java.util.List;

public class ClassMethodReference {
  public static void main(String[] args) {
    var list = List.of("Supply", "HR", "Sales", "marketing");
    list.forEach(department -> System.out.println(department));
    System.out.println();
    list.forEach(System.out::println);
  }
}
