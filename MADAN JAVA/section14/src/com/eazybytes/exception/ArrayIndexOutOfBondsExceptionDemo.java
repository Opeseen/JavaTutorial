package com.eazybytes.exception;


import java.util.logging.Logger;

public class ArrayIndexOutOfBondsExceptionDemo {
  private static Logger logger = Logger.getLogger(ArrayIndexOutOfBondsExceptionDemo.class.getName());
  public static void main(String[] args) {
    try{
      int[] numbers = {1,2,3,4,5};
      System.out.println(numbers[5]);
    }catch (Exception ex){
      logger.severe("Invalid array index. Please try again with a valid index number...");
    }
  }
}
