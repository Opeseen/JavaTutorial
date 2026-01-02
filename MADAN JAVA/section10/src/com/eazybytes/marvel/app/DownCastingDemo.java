package com.eazybytes.marvel.app;

import com.eazybytes.marvel.animals.Cat;
import com.eazybytes.marvel.animals.Dog;
import com.eazybytes.marvel.base.Animal;

public class DownCastingDemo {

  public static void main(String[] args) {
    Animal animal;
    Dog dog = new Dog();
    animal = dog; // upcasting

    dog = (Dog) animal; // downcasting

    AnimalUtility.performAction(dog);

    if(animal instanceof Cat){
      Cat cat = (Cat) animal;
    }
    
  }
}
