package com.eazybytes.exception.custom;

public class DivideByZeroException extends RuntimeException{
  public DivideByZeroException(String message){
    super(message);
  }
  public DivideByZeroException(){
    super();
  }
}
