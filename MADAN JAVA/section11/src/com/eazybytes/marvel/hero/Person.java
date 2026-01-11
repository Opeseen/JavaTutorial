package com.eazybytes.marvel.hero;

public interface Person {
  static void main(String[] args) {
    System.out.println("Hello world from interface");
  }

  default void walk(){
    System.out.println("Walking");
  }
}
