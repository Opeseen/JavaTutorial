package com.eazybytes.set;

import java.util.TreeSet;

public class TreeSetDemo {
  public static void main(String[] args) {
    TreeSet<String> treeSet = new TreeSet<>();
    treeSet.add("India");
    treeSet.add("USA");
    treeSet.add("Germany");
    System.out.println(treeSet);
    treeSet.remove("Germany");
    System.out.println(treeSet);
    System.out.println(treeSet.size());
    System.out.println(treeSet.first());
    System.out.println(treeSet.last());
    System.out.println(treeSet.reversed());
  }
}
