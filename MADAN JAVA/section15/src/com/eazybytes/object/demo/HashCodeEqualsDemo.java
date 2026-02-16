package com.eazybytes.object.demo;

public class HashCodeEqualsDemo {
  public static void main(String[] args) {
    Person p1 = new Person("John", 25, 'M', 543210);
    Person p2 = new Person("John", 25, 'M', 543210);
    System.out.println(p1.hashCode());
    System.out.println(p2.hashCode());
    System.out.println(p1.equals(p2));
    System.out.println(p1);
    System.out.println(p2);
  }
}
