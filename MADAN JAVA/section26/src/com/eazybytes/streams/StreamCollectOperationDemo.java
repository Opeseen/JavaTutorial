package com.eazybytes.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectOperationDemo {
  public static void main(String[] args) {
    List<String> departmentList = new ArrayList<>();
    departmentList.add("Supply");
    departmentList.add("HR");
    departmentList.add("Sales");
    departmentList.add("Marketing");

    List<String> newDepartmentList = departmentList.stream()
        .filter(word -> word.startsWith("S"))
        .toList();
    newDepartmentList.forEach(System.out::println);

    long totalCount = departmentList.stream()
        .filter(word -> word.startsWith("S"))
        .count();
    System.out.println(totalCount);
  }
}
