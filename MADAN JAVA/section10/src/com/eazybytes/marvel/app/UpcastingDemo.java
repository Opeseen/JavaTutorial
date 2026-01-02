package com.eazybytes.marvel.app;

import com.eazybytes.marvel.animals.Cat;
import com.eazybytes.marvel.animals.Dog;
import com.eazybytes.marvel.base.Animal;

public class UpcastingDemo {

  public static void main(String[] args) {
    Animal animal = new Animal();
    animal.setName("Scooby");
    AnimalUtility.printName(animal);
    animal.eat();

    animal = new Dog();
    animal.setName("Charlie");
    AnimalUtility.printName(animal);

    Cat cat = new Cat();
    cat.setName("Snoopy");
    AnimalUtility.printName(cat);

  }
}
