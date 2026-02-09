package com.eazybytes.exception.custom;

public class InvalidAgeException extends Exception{
  public InvalidAgeException(String message){
    super(message);
  }
  public InvalidAgeException(){
    super();
  }
}
