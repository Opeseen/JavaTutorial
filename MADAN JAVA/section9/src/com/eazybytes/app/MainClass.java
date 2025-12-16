package com.eazybytes.app;

import com.eazybytes.model.Class1;
import com.eazybytes.model.Employee;
import com.eazybytes.model.Person;
import com.eazybytes.model.Vehicle;
import com.eazybytes.service.VehicleService;
import com.eazybytes.utility.MyConstants;

public class MainClass {
  public static void main(String[] args) {
    Vehicle vehicle = new Vehicle();
    Employee employee = new Employee();
    VehicleService vehicleService = new VehicleService();

    String input = "Hello";
    Integer num;

    System.out.println(MyConstants.TAX_RATE);
    System.out.println(MyConstants.SHIPPING_COST);

    System.out.println(MyConstants.calculateTotalCost(9.99));

    Class1 model = new Class1();
    com.eazybytes.service.Class1 service = new com.eazybytes.service.Class1();

    MyOuterClass.MyInnerClass myInnerClass = new MyOuterClass.MyInnerClass();
    myInnerClass.display();

    AccessModifiersDemo accessModifiersDemo = new AccessModifiersDemo();

    Person person = new Person();
    person.setFirstName("John");
    person.setLastName("Doe");
    person.setAge(20);
    person.setSalary(10000.00);

  }
}
