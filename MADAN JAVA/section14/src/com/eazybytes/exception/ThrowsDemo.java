package com.eazybytes.exception;

public class ThrowsDemo {
  public static void main(String[] args) {
    try{
      Division division = new Division();
      double output = division.divide("four", "2");
      System.out.println(output);
    }catch (NumberFormatException | ArithmeticException ex){
      System.out.println("Invalid data provided..");
    }
  }
}
