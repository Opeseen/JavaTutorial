package com.eazybytes.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
  public static void main(String[] args) {
    Scanner scanner = null;
    try{
      scanner = new Scanner(System.in);
      System.out.println("Enter a number...");
      int number = scanner.nextInt();
      System.out.println(number);
    } catch (InputMismatchException ex) {
      System.out.println("Please provide input in numerical only...");
    }finally {
      System.out.println("Finally block is been executed");
      if(scanner != null){
        scanner.close();
      }
    }
  }
}
