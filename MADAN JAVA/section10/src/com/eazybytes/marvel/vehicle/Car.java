package com.eazybytes.marvel.vehicle;

import com.eazybytes.marvel.base.Vehicle;

public class Car extends Vehicle {

  public int horsePower = 150;
  public String color = "Black";
  public String turningRadius = "6.23";
  public boolean isAutomatic = true;

  public static void start(){
    System.out.println("Car starting");
  }

  public void printCarDetails(){
    System.out.println(color);
    System.out.println(super.color);
  }

}
