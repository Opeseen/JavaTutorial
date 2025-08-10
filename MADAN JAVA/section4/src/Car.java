import javax.swing.*;

public class Car {
//  java fields
  String model;
  String color;
  int horsePower;
  static final byte NO_OF_WHEELS=4;
  static byte noOfEngines;

  static{
    noOfEngines = 1;
    System.out.println("Static blocking is being executed");
  }

//  instance initialization block
  {
    this.model = "Camry" ;
    this.color = "Black";
    this.horsePower = 200;
    System.out.println("Car object is been created...");
  }

  public Car(){
  }

  public Car(String model, String color, int horsePower){
    this.model = model;
    this.horsePower= horsePower;
    this.color = color;
  }

  public void startCar(){
    System.out.println("Vehicle started...");
  }

  public String stopCar(){
    String output = "Vehicle stopped...";
      return  output;
  }
}