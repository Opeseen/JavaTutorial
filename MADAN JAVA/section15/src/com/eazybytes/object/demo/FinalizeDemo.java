package com.eazybytes.object.demo;

public class FinalizeDemo {
  public static void main(String[] args) {
    for(int i=0; i<10000; i++){
      System.out.println(i);
      new Person();
    }
  }
}
